
package com.example.myapplication;

import android.os.Bundle;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.view.Gravity;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import org.json.JSONArray;
import org.json.JSONObject;

public class Ty_MiniPeta2q3 extends AppCompatActivity {

    LinearLayout questContainer, todoContainer;
    SharedPreferences preferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ty_mainfeature_student);

        // initialize
        questContainer = findViewById(R.id.questContainer);
        todoContainer = findViewById(R.id.todoContainer);

        preferences = getSharedPreferences("QuestData", MODE_PRIVATE);

        Button shopButton = findViewById(R.id.shopButton);
        Button menuButton = findViewById(R.id.menuButton);
        Button logoutButton = findViewById(R.id.logoutButton);

        // shop button
        // la pa

        // menu button
        // la pa

        // logout button
        // la pa
    }

    @Override
    protected void onResume() {
        super.onResume();
        loadQuests();
    }

    // load quests
    private void loadQuests() {

        questContainer.removeAllViews();
        todoContainer.removeAllViews();

        String data = preferences.getString("quests", "[]");

        try {
            JSONArray quests = new JSONArray(data);

            if (quests.length() == 0) {
                addMessage(questContainer, "no quests available!");
                addMessage(todoContainer, "no tasks available!");
                return;
            }

            boolean hasOngoing = false;

            for (int i = 0; i < quests.length(); i++) {

                JSONObject quest = quests.getJSONObject(i);

                String name = quest.getString("name");
                String status = quest.getString("status");

                // show all quests
                addQuestText(questContainer, name);

                // show ongoing quests
                if (status.equalsIgnoreCase("Ongoing")) {
                    addQuestText(todoContainer, name);
                    hasOngoing = true;
                }
            }

            if (!hasOngoing) {
                addMessage(todoContainer, "no ongoing quests!");
            }

        } catch (Exception e) {
            e.printStackTrace();
            addMessage(questContainer, "error loading quests...");
        }
    }

    // add quest text
    private void addQuestText(LinearLayout container, String name) {

        TextView text = new TextView(this);

        text.setText(name);
        text.setTextColor(Color.WHITE);
        text.setTextSize(16);
        text.setGravity(Gravity.CENTER_VERTICAL);
        text.setPadding(12, 16, 12, 16);

        container.addView(text);
    }

    // ad message
    private void addMessage(LinearLayout container, String message) {

        TextView text = new TextView(this);

        text.setText(message);
        text.setTextColor(Color.LTGRAY);
        text.setTextSize(14);
        text.setPadding(12, 12, 12, 12);

        container.addView(text);
    }
}

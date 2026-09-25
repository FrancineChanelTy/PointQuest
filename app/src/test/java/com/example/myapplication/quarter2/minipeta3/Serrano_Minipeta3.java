package com.example.myapplication.quarter2.minipeta3;

public class Serrano_Minipeta3 {
}
public class Quest {

    private String name;
    private String description;
    private int requiredItems;
    private int collectedItems;
    private boolean completed;

    public Quest(String name, String description, int requiredItems) {
        this.name = name;
        this.description = description;
        this.requiredItems = requiredItems;
        this.collectedItems = 0;
        this.completed = false;
    }

    public void collectItem() {
        if (!completed) {
            collectedItems++;

            System.out.println("Item collected! "
                    + collectedItems + "/" + requiredItems);

            if (collectedItems >= requiredItems) {
                completed = true;
                System.out.println("Quest completed: " + name);
            }
        }
    }

    public void showQuest() {
        System.out.println("=== QUEST ===");
        System.out.println("Name: " + name);
        System.out.println("Description: " + description);
        System.out.println("Progress: " + collectedItems
                + "/" + requiredItems);
        System.out.println("Completed: " + completed);
    }

    public static void main(String[] args) {

        Quest quest = new Quest(
                "Goblin Hunt",
                "Collect 5 Goblin Coins.",
                5
        );

        quest.showQuest();

        quest.collectItem();
        quest.collectItem();
        quest.collectItem();
        quest.collectItem();
        quest.collectItem();

        quest.showQuest();
    }
}
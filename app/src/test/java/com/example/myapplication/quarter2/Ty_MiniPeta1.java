package com.example.myapplication.quarter2;

import org.junit.Test;

public class Ty_MiniPeta1{
    @Test
    public void printMyProfile() {

        String myName = "Francine";
        String petName = "Butter";
        String favFood = "Lasagna";
        int myAge = 15;

        System.out.println("---MY DIGITAL PROFILE---");
        System.out.println("Hello, my name is " + myName + " and I am " + myAge + " years old.");
        System.out.println("I have a wonderful pet named " + petName + ".");
        System.out.println("If  I could, I would eat " + favFood + " every single day!");

    }
}
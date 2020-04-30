package com.example.samuelmuriithi.funfact;
//THIS CLASS WILL TAKE THE RESPONSIBILITY OF SELECTING A RANDOM COLOR
// FROM THE mColors ARRAY AND RETURNING THE FACT (single responsibility)

import android.graphics.Color;

import java.util.Random;

public class ColorWheel {
    //A class is an object, and an object has two main parts:
      /*
      1. FIELDS (Member variables) - properties about the object
      */
    String[] mColors = {
            "#39add1", // light blue
            "#3079ab", // dark blue
            "#c25975", // mauve
            "#e15258", // red
            "#f9845b", // orange
            "#838cc7", // lavender
            "#7d669e", // purple
            "#53bbb4", // aqua
            "#51b46d", // green
            "#e0ab18", // mustard
            "#637a91", // dark gray
            "#f092b0", // pink
            "#b7c0c7", // light gray
            "#f5deb3", // Wheat
            "#8c9535", 
            "#afeeee", // pale turquoise
            "#f0e68c", // Khaki
            "#ff7f50", // Coral
            "#e0ffff",   // Light Cyan
            "#00ffff",
            "#ffc0cb",
            "#dda0dd",
            "#ffbbff",
            "#87ceeb",
            "#ffbbff",
            "#40e0d0",
            "#00f5ff",
            "#fcb268",
            "#7fffd4",
            "#b0e0e6",
            "#ffb5c5",
            "#eeaeee",
            "#ff6347",
            "#133337",
            "#1e90ff"
    };

    /*
     2. METHODS - Actions that the object can take
     */
    public int getColor() {

        String color;

        //Create a new Random object with a variable name: "randomGenerator"
        //Random is a class provided by java that helps us create all sorts of random numbers
        Random randomGenerator = new Random();
        //Then we create an integer variable called "randomNumber" to store the generated random number as such:
        int randomNumber = randomGenerator.nextInt(mColors.length);
        //Randomly select a fact using the random number to refer to the indices of the facts in the array
        color = mColors[randomNumber];

        //Parse.color is a method that takes in a color's hexadecimal string and returns an integer
        int colorAsInt = Color.parseColor(color);

        //A method/function always returns something
        return colorAsInt;
    }
}

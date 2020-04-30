package com.example.samuelmuriithi.funfact;
//THIS MAIN ACTIVITY CLASS WILL ONLY HANDLE HOW THE SCREEN LOOKS AND WORKS (single responsibility principle)

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private static final String KEY_FACT = "KEY_FACT";
    private static final String KEY_COLOR = "KEY_COLOR";

    //Declare a new FactBook Object and initialize it
    private FactBook mFactBook = new FactBook();
    // Declare a new ColourWheel Object and initiate it using the new keyword
    private ColorWheel mColourWheel = new ColorWheel();

    //Declare views as variables
    private TextView mFactTextView;
    private Button mFactButton;
    // Declare a field with the type RelativeLayout
    private RelativeLayout mRelativeLayout;
    private String mFact = mFactBook.mFacts[0];
    private int mColor = Color.parseColor(mColourWheel.mColors[8]);

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        // Provides a bundle that can be used to save the instance state of an activity
        super.onSaveInstanceState(outState);

        outState.putString(KEY_FACT, mFact);
        outState.putInt(KEY_COLOR, mColor);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        // Gets the state saved by onSaveInstance state through the bundle
        super.onRestoreInstanceState(savedInstanceState);

        // Get the saved values and assign them to the respective fields
        mFact = savedInstanceState.getString(KEY_FACT);
        mColor = savedInstanceState.getInt(KEY_COLOR);

        // Set the color, facts and etc using the restored values
        mFactTextView.setText(mFact);
        mFactButton.setTextColor(mColor);
        mRelativeLayout.setBackgroundColor(mColor);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_facts);

        // Assign the views from the layout file to their corresponding variables
        mFactTextView = (TextView) findViewById(R.id.funTextView);
        mFactButton = (Button) findViewById(R.id.showFactButton);
        mRelativeLayout = (RelativeLayout) findViewById(R.id.relativeLayout);

        // Make the button do something by adding an onclick listener
        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /* The button was clicked, so update the views with new fact and new bgColour */

                // Get a fact from the FactBook Object and assign it to a string variable named fact
                mFact = mFactBook.getFact();

                // Get a colour from the ColourWheel Object and assign it to an integer variable named colour
                mColor = mColourWheel.getColor();

                // Update the textview with our dynamic fact
                mFactTextView.setText(mFact);
                // Update the RelativeLayout with a new colour
                mRelativeLayout.setBackgroundColor(mColor);
                // Update the Button Text with the colour gotten from ColourWheel
                mFactButton.setTextColor(mColor);

            }
        };
        // Attach the OnclickListener to the Button
        mFactButton.setOnClickListener(listener);


    }
}

package com.johnwu1016.funfacts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class FunFactsActivity extends AppCompatActivity {
    // Declare our View variables
    private TextView factTextView;
    private Button showFactButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_facts);

        // Assign the Views from the layout file to the corresponding variables
        factTextView = (TextView) findViewById(R.id.factsTextView);
        showFactButton = (Button) findViewById(R.id.showFactsButton);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // The button was clicked, so update the fact TextView with a new fact.
                // Randomly select a fact
                Random randomGenerator = new Random();
                int randomNumber = randomGenerator.nextInt(3);

                String fact = randomNumber + "";

                // Update the screen with new fact
                factTextView.setText(fact);
            }
        };
        showFactButton.setOnClickListener(listener);
    }
}

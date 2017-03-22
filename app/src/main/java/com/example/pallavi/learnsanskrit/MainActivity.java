package com.example.pallavi.learnsanskrit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView numbersTextView;
    TextView familyTextView;
    TextView colorsTextView;
    TextView phrasesTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numbersTextView = (TextView) findViewById(R.id.numbers);
        familyTextView = (TextView) findViewById(R.id.family);
        colorsTextView = (TextView) findViewById(R.id.colors);
        phrasesTextView = (TextView) findViewById(R.id.phrases);

        numbersTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent numberActivityIntent = new Intent(MainActivity.this, NumbersActivity.class);
                startActivity(numberActivityIntent);
            }
        });

        familyTextView.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent familyActivityIntent = new Intent(MainActivity.this, FamilyActivity.class);
                startActivity(familyActivityIntent);
            }
        });

        colorsTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent colorActivityIntent = new Intent(MainActivity.this, ColorsActivity.class);
                startActivity(colorActivityIntent);
            }
        });

        phrasesTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent phrasesActivityIntent = new Intent(MainActivity.this, PhrasesActivity.class);
                startActivity(phrasesActivityIntent);
            }
        });



    }
}

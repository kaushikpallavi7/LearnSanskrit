package com.example.pallavi.learnsanskrit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);


        ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("One","एकः","एक"));
        words.add(new Word("Two","द्वौ","दो"));
        words.add(new Word("Three","त्रयः","तीन"));
        words.add(new Word("Four","चत्वारः","चार"));
        words.add(new Word("Five","पञ्च","पाँच"));
        words.add(new Word("Six","षट्","छः"));
        words.add(new Word("Seven","सप्त","सात"));
        words.add(new Word("Eight","अष्ट","आठ"));
        words.add(new Word("Nine","नव","नौ"));
        words.add(new Word("Ten","दश","दस"));

       WordAdapter adapter = new WordAdapter(this, words);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}

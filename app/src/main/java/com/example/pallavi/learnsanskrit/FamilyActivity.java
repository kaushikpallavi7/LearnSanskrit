package com.example.pallavi.learnsanskrit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family);
        //back arrow is displayed in the toolbar but does not function
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}

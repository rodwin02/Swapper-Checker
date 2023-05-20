package com.firstapp.labexercise;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;


public class ResultActivity extends AppCompatActivity {
    private TextView resultTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        resultTextView = findViewById(R.id.resultTextView);

        // Get the result from the intent
        Intent intent = getIntent();
        String result = intent.getStringExtra("result");

        // Set the result in the TextView
        resultTextView.setText(result);
    }
}

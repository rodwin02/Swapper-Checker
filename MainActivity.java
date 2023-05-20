package com.firstapp.labexercise;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private EditText editText1, editText2;
    private Button swapButton, checkButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText1 = findViewById(R.id.editText1);
        editText2 = findViewById(R.id.editText2);
        swapButton = findViewById(R.id.swapButton);
        checkButton = findViewById(R.id.checkButton);

        swapButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                swapContent();
            }
        });

        checkButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkContent();
            }
        });
    }

    private void swapContent() {
        String temp = editText1.getText().toString();
        editText1.setText(editText2.getText().toString());
        editText2.setText(temp);
    }

    private void checkContent() {
        String text1 = editText1.getText().toString();
        String text2 = editText2.getText().toString();

        if (text1.equals(text2)) {
            openResultActivity("SAME");
        } else {
            openResultActivity("NOT THE SAME");
        }
    }

    private void openResultActivity(String result) {
        Intent intent = new Intent(this, ResultActivity.class);
        intent.putExtra("result", result);
        startActivity(intent);
    }
}
package com.companyname.grader.grader;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText userInput;
    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        userInput = (EditText) findViewById(R.id.user_input);
        result = (TextView) findViewById(R.id.result);

    }

    public void clickedGrade(View view) {
        int grade = Integer.parseInt(userInput.getText().toString());
        if (grade > 100 || grade < 0) {
            Toast.makeText(getApplicationContext(), "Invalid Input", Toast.LENGTH_LONG).show();
        }
        else {
            if (grade > 90) {
                result.setText("A");
                result.setTextColor(Color.GREEN);
            }
            else if (grade > 80) {
                result.setText("B");
                result.setTextColor(Color.GREEN);
            }
            else if (grade > 70) {
                result.setText("C");
                result.setTextColor(Color.GREEN);
            }
            else if (grade > 60) {
                result.setText("D");
            }
            else {
                result.setText("F");
            }
        }

        setTextColor(grade);

    }

    public void clickedPassOrFail(View view) {
        int grade = Integer.parseInt(userInput.getText().toString());
        if (grade > 100 || grade < 0) {
            Toast.makeText(getApplicationContext(), "Invalid Input", Toast.LENGTH_LONG).show();
        }
        else {
            if (grade >= 65) {
                result.setText("Pass");
                result.setTextColor(Color.GREEN);
            }
            else {
                result.setText("Fail");
                result.setTextColor(Color.RED);
            }
        }

    }

    public void clickedFiveTimes(View view) {
        int grade = Integer.parseInt(userInput.getText().toString());
        if (grade > 100 || grade < 0) {
            Toast.makeText(getApplicationContext(), "Invalid Input", Toast.LENGTH_LONG).show();
        }
        else {
            result.setText("");
            String repeatThisString = userInput.getText().toString();
            for (int i = 0; i < 5; i++) {
                result.setText(result.getText() + repeatThisString + " ");
            }
            setTextColor(grade);
        }

    }

    public void setTextColor(int grade) {
        if (grade > 100 || grade < 0) {
            Log.d("tag", "bad input");
        }
        else {
            if (grade >= 65) {
                result.setTextColor(Color.GREEN);
            }
            else {
                result.setTextColor(Color.RED);
            }
        }

    }

}

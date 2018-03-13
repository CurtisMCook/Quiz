package com.example.sanzablancoaka2c.javaquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private int correctAnswers = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RadioGroup radioGroup;
        RadioGroup radioGroup2;
        RadioGroup radioGroup5;

        /* Initialize Radio Groups and attach click handler */
        radioGroup = (RadioGroup)findViewById(R.id.radioGroup);
        radioGroup.clearCheck();

        radioGroup2 = (RadioGroup)findViewById(R.id.radioGroup2);
        radioGroup2.clearCheck();

        radioGroup5 = (RadioGroup)findViewById(R.id.radioGroup5);
        radioGroup5.clearCheck();
    }


    public void checkAnswers(View view) {

        // Question 1's answer
        RadioButton question1False = (RadioButton) findViewById(R.id.question1False);
        boolean isCheckedQuestion1False = question1False.isChecked();

        if (isCheckedQuestion1False) {
            correctAnswers++;
        }

        // Question 2's answer
        RadioButton question2B = (RadioButton) findViewById(R.id.question2B);
        boolean isCheckedQuestion2B = question2B.isChecked();

        if (isCheckedQuestion2B) {
            correctAnswers++;
        }

        // Question 3's answer
        CheckBox intCheckBox = (CheckBox) findViewById(R.id.question3IntCheckBox);
        boolean isIntChecked = intCheckBox.isChecked();

        CheckBox stringCheckBox = (CheckBox) findViewById(R.id.question3StringCheckBox);
        boolean isStringChecked = stringCheckBox.isChecked();

        CheckBox booleanCheckBox = (CheckBox) findViewById(R.id.question3BooleanCheckBox);
        boolean isBooleanChecked = booleanCheckBox.isChecked();

        CheckBox classCheckBox = (CheckBox) findViewById(R.id.question3ClassCheckBox);
        boolean isClassChecked = classCheckBox.isChecked();

        CheckBox doubleCheckBox = (CheckBox) findViewById(R.id.question3DoubleCheckBox);
        boolean isDoubleChecked = doubleCheckBox.isChecked();

        if (isIntChecked && !isStringChecked && isBooleanChecked && !isClassChecked &&
                isDoubleChecked) {
            correctAnswers++;
        }

        // Question 4's answer
        EditText editText = (EditText) findViewById(R.id.question4EditText);
        String answer = editText.getText().toString();
        if (answer.equals("5")) {
            correctAnswers++;
        }


        // Question 5's answer
        RadioButton question5A = (RadioButton) findViewById(R.id.question5A);
        boolean isCheckedQuestion5False = question5A.isChecked();

        if (isCheckedQuestion5False) {
            correctAnswers++;
        }

        Toast.makeText(this, "You answered " + correctAnswers + " for 5 correctly",
                Toast.LENGTH_SHORT).show();
        correctAnswers = 0;
    }


}

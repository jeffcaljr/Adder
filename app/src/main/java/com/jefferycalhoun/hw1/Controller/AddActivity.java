package com.jefferycalhoun.hw1.Controller;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.jefferycalhoun.hw1.Model.Calculator;
import com.jefferycalhoun.hw1.R;

public class AddActivity extends AppCompatActivity {

    private EditText operand1Field;
    private EditText operand2Field;
    private Button submitButton;
    private TextView resultTextView;

    private Calculator calculator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);

        operand1Field = (EditText) findViewById(R.id.numberField1);
        operand2Field = (EditText) findViewById(R.id.numberField2);
        submitButton = (Button) findViewById(R.id.submitButton);
        resultTextView = (TextView) findViewById(R.id.answerView);

        //listen for changes to operand fields, and enable submit button if neither is empty



        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String op1String = operand1Field.getText().toString();
                String op2String = operand2Field.getText().toString();
                if(op1String.equals("") || op2String.equals("")){
                    Toast.makeText(getApplicationContext(), "You must enter a value in both fields", Toast.LENGTH_SHORT).show();
                }
                else{
                    int op1 = Integer.parseInt(op1String);
                    int op2 = Integer.parseInt(op2String);
                    calculator = new Calculator(op1, op2);

                    resultTextView.setText(String.valueOf(calculator.add()));
                }
            }
        });

    }
}

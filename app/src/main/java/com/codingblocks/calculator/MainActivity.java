package com.codingblocks.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText firstnum= (EditText) findViewById(R.id.editText);
        final EditText secnum=(EditText)findViewById(R.id.editText2);
        final TextView ans=(TextView)findViewById(R.id.textView);
        Button add= (Button) findViewById(R.id.button);
        Button subtract=(Button)findViewById(R.id.button3);
        Button multiply=(Button)findViewById(R.id.button2);
        Button divide=(Button)findViewById(R.id.button4);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String digit1=firstnum.getText().toString();
                int value=Integer.parseInt(digit1);
                String digit2=secnum.getText().toString();
                int value2=Integer.parseInt(digit2);
                int result=value+value2;


                ans.setText(String.valueOf(result));
              //  ans.setText("");
            }
        });
        subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String digit1=firstnum.getText().toString();
                int value=Integer.parseInt(digit1);
                String digit2=secnum.getText().toString();
                int value2=Integer.parseInt(digit2);
                int result=value-value2;
                ans.setText(String.valueOf(result));
              //  ans.setText("");

            }
        });
        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String digit1=firstnum.getText().toString();
                int value=Integer.parseInt(digit1);
                String digit2=secnum.getText().toString();
                int value2=Integer.parseInt(digit2);
                int result=value*value2;
                ans.setText(String.valueOf(result));
             //   ans.setText("");

            }
        });
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String digit1=firstnum.getText().toString();
                int value=Integer.parseInt(digit1);
                String digit2=secnum.getText().toString();
                int value2=Integer.parseInt(digit2);
                int result=value/value2;
                ans.setText(String.valueOf(result));
              //  ans.setText("");

            }
        });



    }
}

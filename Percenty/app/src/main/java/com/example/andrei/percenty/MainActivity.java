package com.example.andrei.percenty;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onButtonClick(View v){

        TextView t1;

        EditText e1= (EditText) findViewById(R.id.editText2);
        EditText e2= (EditText) findViewById(R.id.editText3);
      //  @SuppressLint("WrongViewCast") EditText t1= (EditText) findViewById(R.id.textView5);

        t1=(TextView) findViewById(R.id.textView5);

        int num1= Integer.parseInt(e1.getText().toString());
        int num2= Integer.parseInt(e2.getText().toString());

        int result= (num1*100)/num2;

        t1.setText(Integer.toString(result));

    }
}

package com.reehan2906.foodsvilla;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    TextView outputElement;
    EditText inputElement;
    String food[] = new String[5];
    int top=-1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void push(View view) {
        if (top == (food.length - 1)){
            Toast.makeText(getApplicationContext(),"Food Villa Full", Toast.LENGTH_SHORT).show();
         }
        else{
            inputElement = findViewById(R.id.input);
            String fooditem = inputElement.getText().toString();
            top=top+1;
            food[top]=fooditem;
            //food[top]=input.getText().toString();
            Toast.makeText(getApplicationContext(), fooditem+"has been eaten", Toast.LENGTH_SHORT).show();

        }
    }

    public void pop(View view){
        if(top==-1){
            Toast.makeText(getApplicationContext(), "Food Villa is Empty", Toast.LENGTH_SHORT).show();
        }
        else{
            String poppedFoodItem= food[top];
            top = top - 1;
            outputElement = findViewById(R.id.output);
            outputElement.setText("You last ate"+poppedFoodItem);

        }
    }
}

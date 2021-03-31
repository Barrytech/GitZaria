package com.example.gitzaria;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    shopping pizza;
    TextView total;
    private Thread view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        pizza = new shopping();
        total = findViewById(R.id.total);



        public void rdBClick(View view) {
            //is a button selected
            boolean checked = ((RadioButton) view).isChecked();

            switch (view.getId()) {
                case R.id.rdB1:
                    if(checked){
                        pizza.setPizza_size_pice(5);
                    }
                    break;
                case R.id.rdB2:
                    if(checked){
                        pizza.setPizza_size_pice(7);
                    }
                    break;
                case R.id.rdB3:
                    if(checked){
                        pizza.setPizza_size_pice(10);
                    }
                    break;

            }
                total.setText("Price Total: " + pizza.getPizza_size_pice());

        }
    }

  
}
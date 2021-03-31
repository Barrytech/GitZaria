package com.example.gitzaria;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    shopping pizza;
    TextView total = findViewById(R.id.totalID);


    double TotalPrice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        pizza = new shopping();
    }

    @SuppressLint("SetTextI18n")
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
        total.setText("Price Total: " + "$" + String.format("%.02", pizza.getPizza_size_pice()) );

    }

    public void choseTopping(View view) {

        //is a button selected
        boolean checked = ((CheckBox) view).isChecked();

        switch (view.getId()) {
            case R.id.cBmeat:
                if(checked){
                    pizza.setTopping_price(2);
                }else{
                    pizza.setTopping_price(0);
                }
                break;
            case R.id.cBonion:
                if(checked){
                    pizza.setOnion_price(2);
                }else{
                    pizza.setOnion_price(0);
                }
                break;
            case R.id.cBpep:
                if(checked){
                    pizza.setPepper_price(2);
                }else{
                    pizza.setPepper_price(0);
                }
                break;
            case R.id.cBmush:
                if(checked){
                    pizza.setMushroom_price(2);
                }else{
                    pizza.setMushroom_price(0);
                }
                break;
            case R.id.cBpin:
                if(checked){
                    pizza.setPineapple_price(2);
                }else{
                    pizza.setPineapple_price(0);
                }
                break;

            default:
                throw new IllegalStateException("Unexpected value: " + view.getId());
        }
        total.setText(("Price Total: " + "$" + String.format("%.02f", bigTotal()) ));
    }

    private double bigTotal(){
        TotalPrice = pizza.getPizza_size_pice() + pizza.getTopping_price() + pizza.getOnion__price() + pizza.getPepper__price() + pizza.getMushroom_price() + pizza.getPineapple__price();

        return TotalPrice;
    }
}



  

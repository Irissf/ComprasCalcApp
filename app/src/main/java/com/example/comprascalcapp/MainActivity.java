package com.example.comprascalcapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private int total;

    TextView txt_total;
    Button btn_agregar;

    TextView txt_cantidad;
    TextView txt_precio;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt_total = findViewById(R.id.txt_total);
        btn_agregar = findViewById(R.id.btn_agregar);
        txt_cantidad = findViewById(R.id.txt_cantidad);
        txt_precio = findViewById(R.id.txt_precio);

        btn_agregar.setOnClickListener(agregarElemento);
    }


    private View.OnClickListener agregarElemento = new View.OnClickListener() {
        public void onClick(View v) {
            //float valorUno = txt_cantidad.getText();
        }
        public void Sumar(int cantidad){
            setTotal(getTotal()+cantidad);
        }
        public void Restar(int cantidad){
            setTotal(getTotal()-cantidad);
        }
    };

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}
package com.example.pizzaria;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText txtChopp;
    EditText txtPizzas;
    EditText txtRecheios;
    EditText txtPessoas;
    TextView lblConsumo2;
    TextView lblServico2;
    TextView lblTotal2;
    TextView lblValorPessoa2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtChopp= findViewById(R.id.txtChopp);
        txtPizzas= findViewById(R.id.txtPizzas);
        txtRecheios= findViewById(R.id.txtRecheios);
        txtPessoas= findViewById(R.id.txtPessoas);
        lblConsumo2 = findViewById(R.id.lblConsumo2);
        lblServico2 = findViewById(R.id.lblServico2);
        lblTotal2 = findViewById(R.id.lblTotal2);
        lblValorPessoa2 = findViewById(R.id.lblValorPessoa2);

    }

    public void onCalcular(View v) {

        int Chopp = Integer.parseInt(txtChopp.getText().toString());
        int Pizzas = Integer.parseInt(txtPizzas.getText().toString());
        int Recheios = Integer.parseInt(txtRecheios.getText().toString());
        int Pessoas =  Integer.parseInt(txtPessoas.getText().toString());

        double Consumo  = (Chopp * 7.30 + Pizzas*31.50 + Recheios*5.90);
        lblConsumo2.setText("" + Consumo);
        double Servico  = (Consumo)*10/100;
        lblServico2.setText("" + Servico);
        double Total  = (Consumo + Servico);
        lblTotal2.setText("" + Total);

        if (Pessoas <= 0) {
            lblValorPessoa2.setText("");
        }
        else{
            double ValorPessoa = (Total / Pessoas);
            lblValorPessoa2.setText("" + ValorPessoa);
        }

    }
}

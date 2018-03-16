package br.edu.ucsal.imccalculo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ResultCalcular extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result_calcular);

       String peso =  getIntent().getStringExtra("peso");
       String altura = getIntent().getStringExtra("altura");

       Double resultado = Double.valueOf(peso) /(Double.valueOf(altura));

        TextView texto = findViewById(R.id.result);



    }
}

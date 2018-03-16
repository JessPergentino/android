package br.edu.ucsal.imccalculo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void calcular (View view) {
        Intent intent = new Intent(this, ResultCalcular.class);
        TextView altura = findViewById(R.id.altura);
        TextView peso = findViewById(R.id.peso);

        String a = altura.getText().toString();
        String p = peso.getText().toString();

        intent.putExtra("peso", p);
        intent.putExtra("altura", a);

        startActivity(intent);
    }
}

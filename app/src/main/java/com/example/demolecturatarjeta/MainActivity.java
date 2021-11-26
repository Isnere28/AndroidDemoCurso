package com.example.demolecturatarjeta;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener  {

    private Button button_lectura;
    private Button button_imprimir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button_lectura = findViewById(R.id.button_lectura);
        button_imprimir = findViewById(R.id.button_imprimir);

        button_lectura.setOnClickListener(this);
        button_imprimir.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button_lectura:
                Toast.makeText(this,"Abrir pantalla de lectura", Toast.LENGTH_LONG).show();
                startActivity(new Intent(this, LecturaTarjetaActivity.class));

                break;
            case R.id.button_imprimir:
                //Toast.makeText(this,"Abrir pantalla de lectura", Toast.LENGTH_LONG).show();
                startActivity(new Intent(this, PrintActivity.class));

                break;
        }
    }
}
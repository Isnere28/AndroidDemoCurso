package com.example.demolecturatarjeta;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.demolecturatarjeta.card.CardManager;
import com.topwise.cloudpos.aidl.AidlDeviceService;

public class LecturaTarjeta extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lectura_tarjeta);
    }


}
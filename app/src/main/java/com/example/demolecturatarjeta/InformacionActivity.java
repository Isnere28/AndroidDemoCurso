package com.example.demolecturatarjeta;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.demolecturatarjeta.api.SmartPosApplication;

public class InformacionActivity extends AppCompatActivity {

    private TextView informacionTextView;
    private TextView dateTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_informacion);

        informacionTextView = findViewById(R.id.informacionTextView);
        dateTextView = findViewById(R.id.date);

        informacionTextView.setText(SmartPosApplication.getApp().mConsumeData.getCardno());

        //byte[] num = SmartPosApplication.getApp().mConsumeData.getSecondTrackData();



        //dateTextView.setText(BCDASCII.bytesToHexString(num));
        dateTextView.setText(SmartPosApplication.getApp().mConsumeData.getSecondTrackData());
    }


}
package com.example.test;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;


public class SoalBing2 extends AppCompatActivity {
    private Button mBtnBack;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.soalbing2);

        //Ambil ID si Button Back
        mBtnBack = (Button) findViewById(R.id.btn_back);

        //Set on CLick si Button Back
        mBtnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
                /*
                kalo untuk memanggil activity baru (yang sifatnya maju) kita pakai Intent
                tapi, kalau kita memanggil Activity yang sebelumnya (1 ACTIVITY DIBELAKANG POSISI SAAT INI) gunakan saja
                onBackPressed()
                 */
            }
        });
    }
}

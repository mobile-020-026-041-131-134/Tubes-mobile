package com.example.test;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class Fisika extends AppCompatActivity {
    ListView listV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fisika);

        listV = (ListView) findViewById(R.id.list);
        String[] values = new String[]{"Cepat Rambat Gelombang", "Periode dan Frekuensi", "Gelombang Longitudinal","Bunyi Pantul"
        };
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, values);
        listV.setAdapter(adapter);

        listV.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                if (position == 0) {
                    Intent myIntent = new Intent(view.getContext(), CepatRambatGelombang.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 1) {
                    Intent myIntent = new Intent(view.getContext(), GetaranGelombang.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 2) {
                    Intent myIntent = new Intent(view.getContext(), GelombangLongitudinal.class);
                    startActivityForResult(myIntent, 0);
                }


                if (position == 3) {
                    Intent myIntent = new Intent(view.getContext(), BunyiPantul.class);
                    startActivityForResult(myIntent, 0);
                }


            }
        });
    }
}

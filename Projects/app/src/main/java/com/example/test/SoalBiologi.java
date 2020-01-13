package com.example.test;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class SoalBiologi extends AppCompatActivity {
    ListView listV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.soalbiologi);

        listV = (ListView) findViewById(R.id.list);
        String[] values = new String[]{"Sistem Pencernaan", "Sistem Peredaraan", "Sistm Respirasi", "Sistem Ekskresi"
        };
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, values);
        listV.setAdapter(adapter);

        listV.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                if (position == 0) {
                    Intent myIntent = new Intent(view.getContext(), SoalPencernaan.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 1) {
                    Intent myIntent = new Intent(view.getContext(), SoalPredaraanDarah.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 2) {
                    Intent myIntent = new Intent(view.getContext(), SoalRespirasi.class);
                    startActivityForResult(myIntent, 0);
                }


                if (position == 3) {
                    Intent myIntent = new Intent(view.getContext(), SoalEkskresi.class);
                    startActivityForResult(myIntent, 0);
                }


            }
        });
    }
}

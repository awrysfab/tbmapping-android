package com.awrcorp.tbmapping;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class InfoActivity extends AppCompatActivity {
    ImageView back;
    LinearLayout pengenalan, gejala, pencegahan, pengobatan;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        pengenalan = (LinearLayout) findViewById(R.id.info_pengenalan);
        gejala = (LinearLayout) findViewById(R.id.info_gejala);
        pencegahan = (LinearLayout) findViewById(R.id.info_pencegahan);
        pengobatan = (LinearLayout) findViewById(R.id.info_pengobatan);

        back = (ImageView) findViewById(R.id.info_back);
        back.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                 finish();
            }
        });

        pengenalan.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                intent = new Intent(getApplicationContext(), PengenalanActivity.class);
                startActivity(intent);
            }
        });

        gejala.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                intent = new Intent(getApplicationContext(), GejalaActivity.class);
                startActivity(intent);
            }
        });

        pencegahan.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                intent = new Intent(getApplicationContext(), PencegahanActivity.class);
                startActivity(intent);
            }
        });

        pengobatan.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                intent = new Intent(getApplicationContext(), PengobatanActivity.class);
                startActivity(intent);
            }
        });
    }
}
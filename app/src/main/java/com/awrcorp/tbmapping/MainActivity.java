package com.awrcorp.tbmapping;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    LinearLayout menuPeta, menuInfo, menuNews, menuFaskes;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        menuPeta = (LinearLayout) findViewById (R.id.menu_peta);
        menuInfo = (LinearLayout) findViewById (R.id.menu_info);
        menuNews = (LinearLayout) findViewById (R.id.news_menu);
        menuFaskes = (LinearLayout) findViewById (R.id.faskes_menu);

//        menuPeta.setOnClickListener(new View.OnClickListener() {
//            public void onClick(View v) {
//                 intent = new Intent(getApplicationContext(), PetaActivity.class);
//                startActivity(intent);
//            }
//        });

        menuInfo.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                intent = new Intent(getApplicationContext(), InfoActivity.class);
                startActivity(intent);
            }
        });

//        menuNews.setOnClickListener(new View.OnClickListener() {
//            public void onClick(View v) {
//                intent = new Intent(getApplicationContext(), NewsActivity.class);
//                startActivity(intent);
//            }
//        });

        menuFaskes.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                intent = new Intent(getApplicationContext(), FaskesActivity.class);
                startActivity(intent);
            }
        });
    }
}
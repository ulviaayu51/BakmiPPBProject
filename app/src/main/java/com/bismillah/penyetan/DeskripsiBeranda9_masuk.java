package com.bismillah.penyetan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class DeskripsiBeranda9_masuk extends AppCompatActivity {
    ImageView imageView;
    TextView textView1;
    TextView textView2;
    TextView textView3;
    TextView textView4;
    TextView textView5;
    TextView textView6;
    TextView textView7;
    TextView textView8;
    TextView textView9;
    TextView textView10;
    TextView textView11;
    TextView textView12;
    TextView textView13;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deskripsi_beranda9_masuk);

        Toolbar toolbar = findViewById(R.id.toolbar);
        TextView toolbarText = findViewById(R.id.textView_toolbar);
        if(toolbarText!=null && toolbar!=null){
            toolbarText.setText("NIKMAT DAN HEMAT");
            setSupportActionBar(toolbar);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        imageView = findViewById(R.id.imageView_beranda9);
        textView1 = findViewById(R.id.textView1_beranda9);
        textView2 = findViewById(R.id.textView2_beranda9);
        textView3 = findViewById(R.id.textView3_beranda9);
        textView4 = findViewById(R.id.textView4_beranda9);
        textView5 = findViewById(R.id.textView5_beranda9);
        textView6 = findViewById(R.id.textView6_beranda9);
        textView7 = findViewById(R.id.textView7_beranda9);
        textView8 = findViewById(R.id.textView8_beranda9);
        textView9 = findViewById(R.id.textView9_beranda9);
        textView10 = findViewById(R.id.textView10_beranda9);
        textView11 = findViewById(R.id.textView11_beranda9);
        textView12 = findViewById(R.id.textView12_beranda9);
        textView13 = findViewById(R.id.textView13_beranda9);
    }
}

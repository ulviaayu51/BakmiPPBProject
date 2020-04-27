package com.bismillah.penyetan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DeskripsiBeranda1 extends AppCompatActivity {
    ImageView imageView;
    TextView textView1;
    TextView textView2;
    TextView textView3;
    TextView textView4;
    TextView textView5;
    TextView textView6;
    TextView textView7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deskripsi_beranda1);

        Toolbar toolbar = findViewById(R.id.toolbar);
        TextView toolbarText = findViewById(R.id.textView_toolbar);
        if(toolbarText!=null && toolbar!=null){
            toolbarText.setText("SUPER SALE");
            setSupportActionBar(toolbar);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        imageView = findViewById(R.id.imageView_beranda1);
        textView1 = findViewById(R.id.textView1_beranda1);
        textView2 = findViewById(R.id.textView2_beranda1);
        textView3 = findViewById(R.id.textView3_beranda1);
        textView4 = findViewById(R.id.textView4_beranda1);
        textView5 = findViewById(R.id.textView5_beranda1);
        textView6 = findViewById(R.id.textView6_beranda1);
        textView7 = findViewById(R.id.textView7_beranda1);
    }
}

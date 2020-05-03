package com.bismillah.penyetan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class DeskripsiBeranda8 extends AppCompatActivity {
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
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deskripsi_beranda8);

        Toolbar toolbar = findViewById(R.id.toolbar);
        TextView toolbarText = findViewById(R.id.textView_toolbar);
        if(toolbarText!=null && toolbar!=null){
            toolbarText.setText("DOUBLE POINTS");
            setSupportActionBar(toolbar);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        imageView = findViewById(R.id.imageView_beranda8);
        textView1 = findViewById(R.id.textView1_beranda8);
        textView2 = findViewById(R.id.textView2_beranda8);
        textView3 = findViewById(R.id.textView3_beranda8);
        textView4 = findViewById(R.id.textView4_beranda8);
        textView5 = findViewById(R.id.textView5_beranda8);
        textView6 = findViewById(R.id.textView6_beranda8);
        textView7 = findViewById(R.id.textView7_beranda8);
        textView8 = findViewById(R.id.textView8_beranda8);
        textView9 = findViewById(R.id.textView9_beranda8);
        textView10 = findViewById(R.id.textView10_beranda8);
        textView11 = findViewById(R.id.textView11_beranda8);
        button = findViewById(R.id.button_beranda8);
    }
}

package com.bismillah.penyetan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Makanan extends AppCompatActivity {
    ImageView imageView1;
    ImageView imageView2;
    ImageView imageView3;
    ImageView imageView4;
    ImageView imageView5;
    ImageView imageView6;
    TextView textView1;
    TextView textView2;
    TextView textView3;
    TextView textView4;
    TextView textView5;
    TextView textView6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_makanan);

        Toolbar toolbar = findViewById(R.id.toolbar);
        TextView toolbarText = findViewById(R.id.textView_toolbar);
        if(toolbarText!=null && toolbar!=null){
            toolbarText.setText("Makanan");
            setSupportActionBar(toolbar);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        imageView1 = findViewById(R.id.imageView1_makanan);
        imageView2 = findViewById(R.id.imageView2_makanan);
        imageView3 = findViewById(R.id.imageView3_makanan);
        imageView4 = findViewById(R.id.imageView4_makanan);
        imageView5 = findViewById(R.id.imageView5_makanan);
        imageView6 = findViewById(R.id.imageView6_makanan);
        textView1 = findViewById(R.id.textView1_makanan);
        textView2 = findViewById(R.id.textView2_makanan);
        textView3 = findViewById(R.id.textView3_makanan);
        textView4 = findViewById(R.id.textView4_makanan);
        textView5 = findViewById(R.id.textView5_makanan);
        textView6 = findViewById(R.id.textView6_makanan);

        imageView1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(Makanan.this, DeskripsiMakanan1.class);
                startActivity(intent);
            }
        });
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(Makanan.this, DeskripsiMakanan2.class);
                startActivity(intent2);
            }
        });
        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent3 = new Intent(Makanan.this, DeskripsiMakanan3.class);
                startActivity(intent3);
            }
        });
        imageView4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent4 = new Intent(Makanan.this, DeskripsiMakanan4.class);
                startActivity(intent4);
            }
        });
        imageView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent5 = new Intent(Makanan.this, DeskripsiMakanan5.class);
                startActivity(intent5);
            }
        });
        imageView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent6 = new Intent(Makanan.this, DeskripsiMakanan6.class);
                startActivity(intent6);
            }
        });
    }
}


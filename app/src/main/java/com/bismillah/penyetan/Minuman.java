package com.bismillah.penyetan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Minuman extends AppCompatActivity {
    ImageView imageView1;
    ImageView imageView2;
    ImageView imageView3;
    ImageView imageView4;
    TextView textView1;
    TextView textView2;
    TextView textView3;
    TextView textView4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_minuman);

        Toolbar toolbar = findViewById(R.id.toolbar);
        TextView toolbarText = findViewById(R.id.textView_toolbar);
        if(toolbarText!=null && toolbar!=null){
            toolbarText.setText("Minuman");
            setSupportActionBar(toolbar);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        imageView1 = findViewById(R.id.imageView1_minuman);
        imageView2 = findViewById(R.id.imageView2_minuman);
        imageView3 = findViewById(R.id.imageView3_minuman);
        imageView4 = findViewById(R.id.imageView4_minuman);
        textView1 = findViewById(R.id.textView1_minuman);
        textView2 = findViewById(R.id.textView2_minuman);
        textView3 = findViewById(R.id.textView3_minuman);
        textView4 = findViewById(R.id.textView4_minuman);

        imageView1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(Minuman.this, DeskripsiMinuman1.class);
                startActivity(intent);
            }
        });
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(Minuman.this, DeskripsiMinuman2.class);
                startActivity(intent2);
            }
        });
        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent3 = new Intent(Minuman.this, DeskripsiMinuman3.class);
                startActivity(intent3);
            }
        });
        imageView4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent4 = new Intent(Minuman.this, DeskripsiMinuman4.class);
                startActivity(intent4);
            }
        });
    }
}

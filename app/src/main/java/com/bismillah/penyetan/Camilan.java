package com.bismillah.penyetan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Camilan extends AppCompatActivity {
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
        setContentView(R.layout.activity_camilan);

        Toolbar toolbar = findViewById(R.id.toolbar);
        TextView toolbarText = findViewById(R.id.textView_toolbar);
        if(toolbarText!=null && toolbar!=null){
            toolbarText.setText("Camilan");
            setSupportActionBar(toolbar);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        imageView1 = findViewById(R.id.imageView1_camilan);
        imageView2 = findViewById(R.id.imageView2_camilan);
        imageView3 = findViewById(R.id.imageView3_camilan);
        imageView4 = findViewById(R.id.imageView4_camilan);
        textView1 = findViewById(R.id.textView1_camilan);
        textView2 = findViewById(R.id.textView2_camilan);
        textView3 = findViewById(R.id.textView3_camilan);
        textView4 = findViewById(R.id.textView4_camilan);

        imageView1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(Camilan.this, DeskripsiCamilan1.class);
                startActivity(intent);
            }
        });
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(Camilan.this, DeskripsiCamilan2.class);
                startActivity(intent2);
            }
        });
        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent3 = new Intent(Camilan.this, DeskripsiCamilan3.class);
                startActivity(intent3);
            }
        });
        imageView4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent4 = new Intent(Camilan.this, DeskripsiCamilan4.class);
                startActivity(intent4);
            }
        });
    }
}

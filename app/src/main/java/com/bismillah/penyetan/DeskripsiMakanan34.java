package com.bismillah.penyetan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DeskripsiMakanan34 extends AppCompatActivity {
    ImageView imageView;
    TextView textView1;
    TextView textView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deskripsi_makanan34);

        Toolbar toolbar = findViewById(R.id.toolbar);
        TextView toolbarText = findViewById(R.id.textView_toolbar);
        if(toolbarText!=null && toolbar!=null){
            toolbarText.setText("NASI AYAM CAH CABAI");
            setSupportActionBar(toolbar);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        imageView = findViewById(R.id.imageView_desmakanan34);
        textView1 = findViewById(R.id.textView1_desmakanan34);
        textView2 = findViewById(R.id.textView2_desmakanan34);
    }
}

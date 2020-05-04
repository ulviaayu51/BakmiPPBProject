package com.bismillah.penyetan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Masuk extends AppCompatActivity {
    Button msk;
    protected View.OnClickListener clickMasuk=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()){
                case R.id.masukya:
                    Intent intent=new Intent(Masuk.this,Daftar.class);
                    startActivity(intent);
                    break;
            }
        }
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_masuk);
        msk=findViewById(R.id.masukya);
        msk.setOnClickListener(clickMasuk);
    }
}

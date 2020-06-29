package com.bismillah.penyetan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AturProfil extends AppCompatActivity {
    Button btnpria, btnwn, btnsel;

    protected View.OnClickListener selesai=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()){
                case R.id.slesai:
                    Intent intent=new Intent(AturProfil.this,Mainclone.class);
                    startActivity(intent);
                    break;
            }
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_atur_profil);
        btnpria=findViewById(R.id.pr);
        btnwn=findViewById(R.id.wn);
        btnsel=findViewById(R.id.slesai);
        btnsel.setOnClickListener(selesai);
    }
}

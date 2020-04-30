package com.bismillah.penyetan;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Notifikasi extends AppCompatActivity {
    Button btngbnotif;
    protected View.OnClickListener clickNotif=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()){
                case R.id.gbnotif:
                    Intent intent=new Intent(Notifikasi.this,Syarat_dan_Ketentuan.class);
                    startActivity(intent);
                    break;
            }
        }
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notifikasi);

        btngbnotif=findViewById(R.id.gbnotif);
        btngbnotif.setOnClickListener(clickNotif);
    }
}

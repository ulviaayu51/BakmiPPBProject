package com.bismillah.penyetan;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Main5Activity extends AppCompatActivity {
    TextView penjelasan,pilih;
    Button btndaftar,btnbahasaindo,btnbahasainggris,btnmain,btnnotif,btntanya,btnsyarat,btnprivate,btnhubung;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        penjelasan=findViewById(R.id.textView1);
        pilih=findViewById(R.id.pilihbahasa);
        btndaftar=findViewById(R.id.button1);
        btnbahasaindo=findViewById(R.id.bahasain);
        btnbahasainggris=findViewById(R.id.bahasaen);
        btnmain=findViewById(R.id.game);
        btnnotif=findViewById(R.id.notif);
        btntanya=findViewById(R.id.tanya);
        btnsyarat=findViewById(R.id.syarat);
        btnprivate=findViewById(R.id.bijak);
        btnhubung=findViewById(R.id.hubung);
        btndaftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Main5Activity.this,Syarat_dan_Ketentuan.class);
                startActivity(i);
            }
        });
        btnmain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Main5Activity.this,Permainan.class);
                startActivity(i);
            }
        });
        btnnotif.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Main5Activity.this,Notifikasi.class);
                startActivity(i);
            }
        });
        btnhubung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Main5Activity.this,Hubungi_Kami.class);
                startActivity(i);
            }
        });
        btnsyarat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Main5Activity.this,Syarat.class);
                startActivity(i);
            }
        });
        btnprivate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Main5Activity.this,Kebijakan_Privasi.class);
                startActivity(i);
            }
        });
        btntanya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Main5Activity.this,Pertanyaan.class);
                startActivity(i);
            }
        });

        Toolbar toolbar = findViewById(R.id.toolbar);
        TextView toolbarText = findViewById(R.id.textView_toolbar);
        if(toolbarText!=null && toolbar!=null){
            toolbarText.setText("Lainnya");
            setSupportActionBar(toolbar);
        }

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setSelectedItemId(R.id.lainnya);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()) {
                    case R.id.beranda:
                        startActivity(new Intent(getApplicationContext(), MainActivity.class));
                        overridePendingTransition(0, 0);
                        finish();
                        return true;
                    case R.id.hadiah:
                        startActivity(new Intent(getApplicationContext(), Main2Activity.class));
                        overridePendingTransition(0, 0);
                        finish();
                        return true;
                    case R.id.toko:
                        startActivity(new Intent(getApplicationContext(), Main3Activity.class));
                        overridePendingTransition(0, 0);
                        finish();
                        return true;
                    case R.id.menu:
                        startActivity(new Intent(getApplicationContext(), Main4Activity.class));
                        overridePendingTransition(0, 0);
                        finish();
                        return true;
                    case R.id.lainnya:
                        finish();
                        return true;
                }
                return false;
            }
        });
    }
}

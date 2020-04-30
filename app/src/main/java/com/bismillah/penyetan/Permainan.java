package com.bismillah.penyetan;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Permainan extends AppCompatActivity {
    Button btngb;
    protected View.OnClickListener clickGb=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()){
                case R.id.gabsek:
                    Intent intent=new Intent(Permainan.this,Syarat_dan_Ketentuan.class);
                    startActivity(intent);
                    break;
            }
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_permainan);

        btngb=findViewById(R.id.gabsek);
        btngb.setOnClickListener(clickGb);
    }
}

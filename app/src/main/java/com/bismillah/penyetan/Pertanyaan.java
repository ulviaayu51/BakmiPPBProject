package com.bismillah.penyetan;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.Spinner;

public class Pertanyaan extends AppCompatActivity {
    Spinner dd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pertanyaan);

        dd=findViewById(R.id.spinner1);
    }
}

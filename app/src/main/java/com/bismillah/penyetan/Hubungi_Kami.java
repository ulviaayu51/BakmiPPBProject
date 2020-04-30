package com.bismillah.penyetan;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

public class Hubungi_Kami extends AppCompatActivity {
    ImageButton maill;

    protected View.OnClickListener clickMail=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()){
                case R.id.imail:
                    Intent intent = new Intent(Intent.ACTION_SEND);
                    intent.setType("plain/text");
                    intent.putExtra(Intent.EXTRA_EMAIL, new String[] { "help@bgmania.bakmigm.com" });
                    intent.putExtra(Intent.EXTRA_SUBJECT, "");
                    intent.putExtra(Intent.EXTRA_TEXT, "");
                    startActivity(Intent.createChooser(intent, ""));
                    break;
            }
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hubungi__kami);

        maill=findViewById(R.id.imail);
        maill.setOnClickListener(clickMail);
    }
}

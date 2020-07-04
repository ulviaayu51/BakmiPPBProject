package com.bismillah.penyetan;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import static com.bismillah.penyetan.R.id.NasiAyam;
import static com.bismillah.penyetan.R.id.krispy;

public class tab_1 extends Fragment {
    ImageView pie;
    ImageView kri;
    ImageView Nasi;
    ImageView somay;
    ImageView lemon;
    ImageView cha;
    ImageView vou;
    @Nullable
    @Override
    public View onCreateView( LayoutInflater inflater,  ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.tab_1,container,false);

        pie = view.findViewById(R.id.permainan);
        pie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(),Permainan2.class));
            }
        });

        kri = view.findViewById(R.id.krispy);
        kri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(),DeskripsiKrispy.class));
            }
        });

        Nasi = view.findViewById(R.id.NasiAyam);
        Nasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(),DeskripsiNasiAyam.class));
            }
        });

        somay = view.findViewById(R.id.somayAyam);
        somay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(),DeskripsiSomayAyam.class));
            }
        });

        lemon = view.findViewById(R.id.LemonTea);
        lemon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(),DeskripsiEsLemonTea.class));
            }
        });

        cha = view.findViewById(R.id.chacha);
        cha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(),DeskripsiKuahChaCha.class));
            }
        });

        vou = view.findViewById(R.id.voucher);
        vou.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(),DeskripsiVoucher.class));
            }
        });




        return view;

    }
}

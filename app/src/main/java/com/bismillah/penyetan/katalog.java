package com.bismillah.penyetan;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class katalog extends Fragment {
  View v;
  private RecyclerView myrecyclerview;
  private List<Book_katalog>listkatalog;

  public katalog(){

  }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        v = inflater.inflate( R.layout.fragment_katalog,  container, false);
        myrecyclerview= (RecyclerView) v.findViewById(R.id.katalog_recyclerview);
        RecyleViewAdapter recycleAdapter = new RecyleViewAdapter(getContext(),listkatalog);
        myrecyclerview.setLayoutManager(new LinearLayoutManager(getActivity()));
        myrecyclerview.setAdapter(recycleAdapter);
        return v;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        listkatalog = new ArrayList<>();
        listkatalog.add(new Book_katalog(R.drawable.camilan4));
        listkatalog.add(new Book_katalog(R.drawable.minuman1));
        listkatalog.add(new Book_katalog(R.drawable.minuman2));
        listkatalog.add(new Book_katalog(R.drawable.camilan3));
        listkatalog.add(new Book_katalog(R.drawable.minuman4));
        listkatalog.add(new Book_katalog(R.drawable.makanan4));
        listkatalog.add(new Book_katalog(R.drawable.makanan2));
        listkatalog.add(new Book_katalog(R.drawable.makanan1));
        listkatalog.add(new Book_katalog(R.drawable.makanan3));
    }
}

package com.bismillah.penyetan;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

class RecyleViewAdapter extends RecyclerView.Adapter<RecyleViewAdapter.MyHolder> {

    private Context mContext;
    private List<Book_katalog> mData;


    public RecyleViewAdapter(Context mContext, List<Book_katalog> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @NonNull
    @Override
    public RecyleViewAdapter.MyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v;
        v= LayoutInflater.from(mContext).inflate(R.layout.item_katalog,parent,false);
        MyHolder vHolder= new MyHolder(v);
        return vHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyleViewAdapter.MyHolder holder, int position) {

        holder.img.setImageResource(mData.get(position).getPhoto());

    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class MyHolder extends RecyclerView.ViewHolder {
        private ImageView img;
        public MyHolder(@NonNull View itemView) {
            super(itemView);

            img =(ImageView) itemView.findViewById(R.id.img_katalog);
        }
    }
}







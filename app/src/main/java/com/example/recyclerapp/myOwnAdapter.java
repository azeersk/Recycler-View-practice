package com.example.recyclerapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.view.menu.MenuView;
import androidx.recyclerview.widget.RecyclerView;

public class myOwnAdapter extends RecyclerView.Adapter<myOwnAdapter.myHolder> {
    String textOne[],textTwo[];
    int imgof[];
    Context ctOut;
    public myOwnAdapter(Context ct,String s1[], String s2[], int imageOne[]){
        ctOut = ct;
        textOne = s1;
        textTwo = s2;
        imgof = imageOne;
    }
    @NonNull
    @Override
    public myHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(ctOut);
        View myView = inflater.inflate(R.layout.recyclelist,parent,false);

        return new myHolder(myView);
    }

    @Override
    public void onBindViewHolder(@NonNull myHolder holder, int position) {
        holder.data1.setText(textOne[position]);
        holder.data2.setText(textTwo[position]);
        holder.image1.setImageResource(imgof[position]);

        switch (position){
            case 0:
                holder.image1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(ctOut, "Zero", Toast.LENGTH_SHORT).show();
                    }
                });
                break;
            case 1:
                holder.image1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(ctOut, "One", Toast.LENGTH_SHORT).show();
                    }
                });
                break;
            case 2:
                holder.image1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(ctOut, "Two", Toast.LENGTH_SHORT).show();
                    }
                });
                break;
            case 3:
                holder.image1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(ctOut, "Three", Toast.LENGTH_SHORT).show();
                    }
                });
                break;
            case 4:
                holder.image1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(ctOut, "Four", Toast.LENGTH_SHORT).show();
                    }
                });
                break;
            case 5:
                holder.image1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(ctOut, "Five", Toast.LENGTH_SHORT).show();
                    }
                });
                break;
            case 6:
                holder.image1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(ctOut, "Six", Toast.LENGTH_SHORT).show();
                    }
                });
                break;
            case 7:
                holder.image1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(ctOut, "Seven", Toast.LENGTH_SHORT).show();
                    }
                });
                break;

            default:
        }

    }

    @Override
    public int getItemCount() {

        return textOne.length;
    }

    public class myHolder extends RecyclerView.ViewHolder{
        TextView data1,data2;
        ImageView image1;
        public myHolder(@NonNull View itemView) {
            super(itemView);
            data1 = (TextView)itemView.findViewById(R.id.textView2);
            data2 = (TextView)itemView.findViewById(R.id.textView3);
            image1 = (ImageView)itemView.findViewById(R.id.imageView);

        }
    }
}

package com.example.recyclerapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;
import android.widget.AbsListView;
import android.widget.GridLayout;

public class MainActivity extends AppCompatActivity {
    RecyclerView r1;
    String t1[],t2[];
    int imageOf[] = {R.drawable.gipicone, R.drawable.giprofesion, R.drawable.girlchaini, R.drawable.girlpic,R.drawable.gipicone, R.drawable.giprofesion, R.drawable.girlchaini, R.drawable.girlpic,R.drawable.girlchaini, R.drawable.girlpic};

    myOwnAdapter mOA;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        r1 = (RecyclerView)findViewById(R.id.myRecycle);
        t1 = getResources().getStringArray(R.array.person_name);
        t2 = getResources().getStringArray(R.array.about);

        mOA = new myOwnAdapter(this,t1,t2,imageOf);

        r1.setAdapter(mOA);


        //linear layout
//        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, true);
//        r1.setLayoutManager(linearLayoutManager);


        //grid layout
//        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 2);
//        r1.setLayoutManager(gridLayoutManager);


        //Staggered Grid Layout
//        StaggeredGridLayoutManager staggeredGrid = new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.GAP_HANDLING_NONE);
//        r1.setLayoutManager(staggeredGrid);

        StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(2, LinearLayoutManager.VERTICAL);
        r1.setLayoutManager(staggeredGridLayoutManager);
    }
}
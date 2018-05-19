package com.example.iossenac.apprecycleview;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SimpleItemAnimator;
import android.view.animation.BounceInterpolator;

import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    PaisesAdapter paisesAdapter;
    List<String> listaPaises = Arrays.asList("Alemanha","Brasil","Chile",
            "Dinamarca","Espanha","Alemanha","Brasil","Chile",
            "Dinamarca","Espanha","Alemanha","Brasil","Chile",
            "Dinamarca","Espanha","Alemanha","Brasil","Chile",
            "Dinamarca","Espanha");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.recycleView);

        recyclerView.setHasFixedSize(true);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        paisesAdapter = new PaisesAdapter(listaPaises);
        recyclerView.setAdapter(paisesAdapter);



    }
}

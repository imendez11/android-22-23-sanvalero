package com.svalero.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<String> listDatos;
    RecyclerView reycler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        reycler= (RecyclerView) findViewById(R.id.ReciclerId);
        reycler.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false));

        listDatos= new ArrayList<String>();

        for (int  i = 0;i<=50;i++){
            listDatos.add("Dato #"+i+" ");
        }

        AdapterDatos adapter= new AdapterDatos(listDatos);
        reycler.setAdapter(adapter);

    }
}
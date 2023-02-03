package com.svalero.vid45;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listasDias;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listasDias = (ListView)  findViewById(R.id.listViewId);
        ArrayAdapter<CharSequence> adaptador = ArrayAdapter.createFromResource(this, R.array.arrayDias,
                android.R.layout.simple_dropdown_item_1line);

        listasDias.setAdapter(adaptador);

        listasDias.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public  void onItemClick(AdapterView<?>parent, View view, int position, long id){
                Toast.makeText(parent.getContext(), "Selecciona: "+parent.getItemAtPosition(position).toString(), Toast.LENGTH_SHORT).show();
            }
        });

    }
}
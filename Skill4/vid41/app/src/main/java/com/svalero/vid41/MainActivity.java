package com.svalero.vid41;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Spinner comboDias;
    TextView estado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        estado = (TextView) findViewById(R.id.etiSeleccion);
        comboDias = (Spinner) findViewById(R.id.idSpinnerDias);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, combo_dias, android.R.layout.simple_spinner_item );

        comboDias.setAdapter(adapter);

        comboDias.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(parent.getContext(),
                        "Seleccionado: " + parent.getItemAtPosition(position).toString(),Toast.LENGTH_LONG).show();

                estado.setText("Seleccion: " + parent.getItemAtPosition(position).toString());
            }


            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}
package com.svalero.skill2;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button btn1, btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(getApplicationContext(),
                "Hola este es un Toast", Toast.LENGTH_SHORT).show();

        btn1= (Button) findViewById(R.id.imp);
        btn2= (Button) findViewById(R.id.ano);
        btn2.setOnClickListener(this) ;

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "desde la anonima", Toast.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.onclick:
                Toast.makeText(getApplicationContext(), "desde el onclick del metodo ", Toast.LENGTH_SHORT).show();
                break;
            case R.id.imp:
                Toast.makeText(getApplicationContext(), "desde el onclick del implements ", Toast.LENGTH_SHORT).show();
                break;;
        }

    }

    public void EventButton(View view) {
        Toast.makeText(getApplicationContext(), "desde el onclick del metodo ", Toast.LENGTH_SHORT).show();
    }
}
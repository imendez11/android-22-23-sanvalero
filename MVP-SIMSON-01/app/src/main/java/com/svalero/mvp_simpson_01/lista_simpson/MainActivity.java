package com.svalero.mvp_simpson_01.lista_simpson;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.svalero.mvp_simpson_01.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Handler handler = new Handler();
        // SetTimeOut - setInterval
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent screenChanger = new Intent(getBaseContext(),
                        LstSimpsonActivity.class
                );
                startActivity(screenChanger);
            }
        }, 4000);
    }
}
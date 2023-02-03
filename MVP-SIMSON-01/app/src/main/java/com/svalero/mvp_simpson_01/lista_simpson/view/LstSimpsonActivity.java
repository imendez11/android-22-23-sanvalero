package com.svalero.mvp_simpson_01.lista_simpson.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.svalero.mvp_simpson_01.R;
import com.svalero.mvp_simpson_01.lista_simpson.presenter.LstSimpsonPrensenter;

public class LstSimpsonActivity extends AppCompatActivity {
    private LstSimpsonPrensenter lstSimpsonPrensenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lst_simpson);

        initComponets();
        initPresenter();
        lstSimpsonPrensenter.lstSimpson(null);
    }
    public void initComponets(){

    }
    public void initPresenter(){
        lstSimpsonPrensenter = new LstSimpsonPrensenter();
    }
}
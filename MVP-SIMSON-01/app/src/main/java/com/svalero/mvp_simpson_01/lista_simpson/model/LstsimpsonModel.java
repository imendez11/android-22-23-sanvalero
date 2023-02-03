package com.svalero.mvp_simpson_01.lista_simpson.model;

import com.svalero.mvp_simpson_01.lista_simpson.LstSimpsonContract;
import com.svalero.mvp_simpson_01.lista_simpson.model.pojo.Simpson;

public class LstsimpsonModel implements LstSimpsonContract.Model {
    @Override
    public void lstSimpsonWS(Simpson simpson, OnLstSimsonListener onLstSimsonListener) {

        //si ha ido bien
        onLstSimsonListener.onSuccess(lstSimpson: null);
        //si ha ido mal
        onLstSimsonListener.onFailure();

    }
}

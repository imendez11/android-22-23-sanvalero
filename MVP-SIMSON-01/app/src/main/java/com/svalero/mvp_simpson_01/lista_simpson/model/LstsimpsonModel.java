package com.svalero.mvp_simpson_01.lista_simpson.model;

import android.telecom.Call;

import com.svalero.mvp_simpson_01.lista_simpson.LstSimpsonContract;
import com.svalero.mvp_simpson_01.lista_simpson.model.pojo.Simpson;
import com.svalero.mvp_simpson_01.lista_simpson.utils.ApiClient;

import java.util.ArrayList;

import okhttp3.Callback;
import okhttp3.Response;

public class LstsimpsonModel implements LstSimpsonContract.Model {
    @Override
    public void lstSimpsonWS(Simpson simpson, OnLstSimsonListener onLstSimsonListener) {

        //si ha ido bien
        onLstSimsonListener.onSuccess(lstSimpson: null);
        //si ha ido mal
        onLstSimsonListener.onFailure();

    }
    public void getSimpsonService(final OnLstSimpsonListener onLstSimpsonListener) {
        /*Ejecuto Webservice con retrofit*/
        ApiInterface apiService = ApiClient.getClient()
                .create(ApiInterface.class);
        Call<ArrayList<Simpson>> call = apiService.getPopularSimpson(2);
        call.enqueue();
    }
}

package com.svalero.mvp_simpson_01.lista_simpson.presenter;

import com.svalero.mvp_simpson_01.lista_simpson.LstSimpsonContract;
import com.svalero.mvp_simpson_01.lista_simpson.model.LstsimpsonModel;
import com.svalero.mvp_simpson_01.lista_simpson.model.pojo.Simpson;

public class LstSimpsonPrensenter implements LstSimpsonContract.Presenter {
    private LstsimpsonModel lstsimpsonModel;

    public LstSimpsonPrensenter(){
        lstsimpsonModel= new LstsimpsonModel();
    }

    @Override
    public void lstSimpson(Simpson simpson) {
        lstsimpsonModel.lstSimpsonWS(new Simpson);

    }
}

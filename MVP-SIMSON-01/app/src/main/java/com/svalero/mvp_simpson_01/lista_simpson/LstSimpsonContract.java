package com.svalero.mvp_simpson_01.lista_simpson;

import com.svalero.mvp_simpson_01.lista_simpson.model.pojo.Simpson;

import java.util.ArrayList;

public interface LstSimpsonContract {

    public interface View{
        void successLstSimpson(ArrayList<Simpson> lstSimpson);
        void failureLstSimpson();
    }

    public interface Presenter{
        void lstSimpson(Simpson simpson);
    }

    public interface Model{
        interface OnLstSimsonListener{
            void onSuccess(ArrayList<Simpson> lstSimpson);
            void onFailure(String error);
        }
        void lstSimpsonWS(Simpson simpson, OnLstSimsonListener onLstSimsonListener);
    }

}

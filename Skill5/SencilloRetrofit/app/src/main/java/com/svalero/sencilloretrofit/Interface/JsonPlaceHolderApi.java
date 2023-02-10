package com.svalero.sencilloretrofit.Interface;

import android.telecom.Call;

import com.svalero.sencilloretrofit.model.Posts;

import java.util.List;

public interface JsonPlaceHolderApi {
    @GET("posts")
    Call<List<Posts>> getPosts();
}

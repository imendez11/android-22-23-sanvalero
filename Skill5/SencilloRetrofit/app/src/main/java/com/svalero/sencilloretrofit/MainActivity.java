package com.svalero.sencilloretrofit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.telecom.Call;

import com.svalero.sencilloretrofit.Interface.JsonPlaceHolderApi;
import com.svalero.sencilloretrofit.model.Posts;

import java.util.List;

import javax.security.auth.callback.Callback;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private void getPosts(){
        Retrofit retrofit = new Retrofit.Builder().baseURL("https://jsonplaceholder.typicode.com/posts/").build();

        JsonPlaceHolderApi jsonPlaceHolderApi = retrofit.create(JsonPlaceHolderApi.class);

        Call<List<Posts>> call = jsonPlaceHolderApi.getPosts();

        call.enqueue(new Callback)<List<Posts>>(){
            
        }
    }


}
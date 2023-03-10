package com.svalero.mvp_simpson_01.lista_simpson.model.pojo;

import com.google.gson.annotations.SerializedName;

public class Simpson {
    /*"quote": "And this is the snack holder where I can put my beverage or, if you will, cupcake.",
        "character": "Homer Simpson",
        "image": "https://cdn.glitch.com/3c3ffadc-3406-4440-bb95-d40ec8fcde72%2FHomerSimpson.png?1497567511939",
        "characterDirection": "Right"*/
    @SerializedName("quote")
    private  String quote;

    @SerializedName("character")
    private  String character;

    @SerializedName("image")
    private  String image;

    @SerializedName("characterDirection")
    private  String characterDirection;
}

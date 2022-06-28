package com.johnny.kotlin_android.domain

import com.google.gson.annotations.SerializedName

data class Team(

    @SerializedName("nome")
    val name: String,

    @SerializedName ("forca")
    val stars: String,

    @SerializedName ("imagem")
    val image: String
)

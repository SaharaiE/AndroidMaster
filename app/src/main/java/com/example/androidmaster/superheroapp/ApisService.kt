package com.example.androidmaster.superheroapp

import okhttp3.Response
import retrofit2.http.GET
import retrofit2.http.Path

//En las interfaces no se mete codigo
interface ApisService {

    @GET("/api/228667996966582/search/{name}")
    suspend fun getSuperheroes(@Path("name") superheroName: String): Response<SuperHeroDataResponse>

}
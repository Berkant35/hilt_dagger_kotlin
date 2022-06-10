package com.example.hiltex2

import retrofit2.Call
import retrofit2.http.GET

interface RetrofitServiceInstance {

    //Post modelimiz yani data classımız..
    @GET("posts")
    fun  getPosts() : Call<List<Post>>
}
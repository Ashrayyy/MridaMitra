package com.ashray.mridamitra.services



import com.ashray.mridamitra.model.Values
import retrofit2.Call
import retrofit2.http.GET

interface ApiService {
    @GET("feeds.json?api_key=ENXUTSE126BOWSD9&results=5")
    fun getPosts(): Call<Values>
}



package com.example.hiltex2

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

/*
* SHARED PREFERENES OLSUN
* NETWORK MANAGER KISMI OLSUN
* Projede tek bir instance yaratıp projenin
*  her yerinde çağırmamızı sağlayan singleton yapıdır..
* */

//Bunlara anotasyon denir...
@Module
@InstallIn(SingletonComponent::class)
class AppModule {

   val BASE_URL = "https://jsonplaceholder.typicode.com/"
    //Çağırcağımız servisin interfacini yazıyoruz....
   @Singleton
   @Provides
   fun getRetrofitServiceInstance(retrofit: Retrofit): RetrofitServiceInstance{
       return retrofit.create(RetrofitServiceInstance::class.java)
   }


    //Flutterdaki dio paketimizin initilazı olarak düşünebilirsin....
    @Singleton
    @Provides
    fun getRetrofitInstance() : Retrofit
    {
      return Retrofit.Builder()
          .baseUrl(BASE_URL)
          .addConverterFactory(GsonConverterFactory.create())
          .build()
    }






}
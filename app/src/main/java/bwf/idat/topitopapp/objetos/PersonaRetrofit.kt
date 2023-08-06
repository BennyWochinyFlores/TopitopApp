package bwf.idat.topitopapp.objetos

import bwf.idat.topitopapp.interfacez.PersonaConsulaApi
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object PersonaRetrofit {

    private  val retrofit = Retrofit.Builder()
        .baseUrl("http://localhost:8090/persona")
        .addConverterFactory(GsonConverterFactory.create())
        .build()
    val consumirapi = retrofit.create(PersonaConsulaApi::class.java)

}
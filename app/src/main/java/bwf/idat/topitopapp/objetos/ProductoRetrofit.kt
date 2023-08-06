package bwf.idat.topitopapp.objetos

import bwf.idat.topitopapp.interfacez.PersonaConsulaApi
import bwf.idat.topitopapp.interfacez.ProductoConsultaApi
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ProductoRetrofit {
    private  val retrofit = Retrofit.Builder()
        .baseUrl("https://api-topitop.onrender.com/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()
    val consumirapi = retrofit.create(ProductoConsultaApi::class.java)
}
package bwf.idat.topitopapp.interfacez

import bwf.idat.topitop.model.Producto
import retrofit2.Call
import retrofit2.http.GET

interface ProductoConsultaApi {
    @GET("/producto/")
    fun getProducto() : Call<Producto>

}
package bwf.idat.topitopapp.interfacez

import bwf.idat.topitopapp.model.Persona
import retrofit2.Call
import retrofit2.http.POST

interface PersonaConsulaApi {
    @POST("/agregar")
    fun postCrearPersona(): Call<Persona>
}
package com.example.examen_02_rog.services

import com.example.examen_02_rog.entities.UserEntity
import retrofit2.http.GET


interface UserService {

    @GET("users")
    suspend fun getAllUsers(): List<UserEntity>

}
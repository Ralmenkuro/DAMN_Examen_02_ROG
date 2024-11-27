package com.example.examen_02_rog.repositories

import com.example.examen_02_rog.entities.UserEntity
import com.example.examen_02_rog.network.ClienteRetrofit
import com.example.examen_02_rog.services.UserService

class UserRepository(private val userService: UserService = ClienteRetrofit.getInstanciaRetrofit) {

    suspend fun getAllUsers() : List<UserEntity> = userService.getAllUsers()

}
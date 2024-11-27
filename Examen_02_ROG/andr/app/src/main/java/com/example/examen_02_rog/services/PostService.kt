package com.example.examen_02_rog.services

import com.example.examen_02_rog.entities.PostEntity
import retrofit2.http.GET
import retrofit2.http.Path

interface PostService {
    @GET("users/{id}/posts")
    suspend fun getAllPosts(@Path("id") id: Long): List<PostEntity>
}
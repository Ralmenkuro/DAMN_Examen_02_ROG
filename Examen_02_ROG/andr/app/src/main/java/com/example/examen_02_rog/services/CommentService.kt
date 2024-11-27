package com.example.examen_02_rog.services

import com.example.examen_02_rog.entities.CommentEntity
import retrofit2.http.GET
import retrofit2.http.Path

interface CommentService {
    @GET("posts/{id}/comments")
    suspend fun getAllComments(@Path("id") id: Long): List<CommentEntity>
}
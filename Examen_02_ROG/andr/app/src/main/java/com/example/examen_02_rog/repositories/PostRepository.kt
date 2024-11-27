package com.example.examen_02_rog.repositories

import com.example.examen_02_rog.entities.PostEntity
import com.example.examen_02_rog.network.ClienteRetrofit
import com.example.examen_02_rog.services.PostService

class PostRepository(private val postService: PostService = ClienteRetrofit.getInstanciaRetrofit2) {
    suspend fun getAllPosts(id: Long) : List<PostEntity> = postService.getAllPosts(id)
}
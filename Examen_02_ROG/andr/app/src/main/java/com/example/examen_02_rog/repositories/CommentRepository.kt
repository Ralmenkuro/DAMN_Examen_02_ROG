package com.example.examen_02_rog.repositories

import com.example.examen_02_rog.entities.CommentEntity
import com.example.examen_02_rog.network.ClienteRetrofit
import com.example.examen_02_rog.services.CommentService

class CommentRepository(private val commentService: CommentService = ClienteRetrofit.getInstanciaRetrofit3) {
    suspend fun getAllComments(id: Long) : List<CommentEntity> = commentService.getAllComments(id)
}
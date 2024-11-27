package com.example.examen_02_rog.entities

data class CommentEntity(
    val id: Long,
    val postId: Long,
    val email: String,
    val name: String,
    val body: String,
)

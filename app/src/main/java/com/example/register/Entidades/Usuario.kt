package com.example.register.Entidades

import androidx.annotation.NonNull
import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.ColumnInfo

@Entity
data class User(
    @PrimaryKey
    val nome: String,
    val email: String?,
    val senha: String?
)
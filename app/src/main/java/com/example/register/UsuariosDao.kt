package com.example.register

import androidx.room.Dao
import androidx.room.Insert
import com.example.register.Entidades.User


@Dao
abstract class UsuariosDao {
    @Insert
    abstract fun registrar( user: User)
}
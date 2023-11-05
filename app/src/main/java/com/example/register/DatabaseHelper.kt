package com.example.register

import android.content.Context
import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.Room
import com.example.register.Entidades.User

@Database(
    entities = [User::class],
    version = 4,
    exportSchema = true
)

abstract class DatabaseHelper : RoomDatabase() {
    abstract fun userDao(): UsuariosDao

    companion object {
        fun pegarInstancia(context: Context) : DatabaseHelper {

            return Room.databaseBuilder(context, DatabaseHelper::class.java, "usuarios.db").allowMainThreadQueries().build()
        }
    }
}
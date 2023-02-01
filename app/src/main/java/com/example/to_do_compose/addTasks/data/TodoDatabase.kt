package com.example.to_do_compose.addTasks.data

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [TaskEntity::class], version = 1)
abstract class TodoDatabase: RoomDatabase() {
    // DAO
    abstract fun taskDao(): TaskDao


}
package com.example.to_do_compose.addTasks.data

import androidx.room.PrimaryKey

data class TaskEntity(
    @PrimaryKey
    val id: Int,
    var task: String,
    var selected: Boolean = false
)

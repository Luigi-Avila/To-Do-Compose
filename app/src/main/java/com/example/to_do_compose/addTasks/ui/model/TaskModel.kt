package com.example.to_do_compose.addTasks.ui.model

data class TaskModel(val id: Long = System.currentTimeMillis(), val task: String, var selected: Boolean = false)

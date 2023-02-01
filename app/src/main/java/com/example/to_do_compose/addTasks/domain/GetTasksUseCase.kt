package com.example.to_do_compose.addTasks.domain

import com.example.to_do_compose.addTasks.data.TaskRepository
import com.example.to_do_compose.addTasks.ui.model.TaskModel
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetTasksUseCase @Inject constructor( private val taskRepository: TaskRepository) {
    operator fun invoke(): Flow<List<TaskModel>> = taskRepository.tasks
}
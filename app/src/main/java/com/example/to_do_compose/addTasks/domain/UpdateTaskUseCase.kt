package com.example.to_do_compose.addTasks.domain

import com.example.to_do_compose.addTasks.data.TaskRepository
import com.example.to_do_compose.addTasks.ui.model.TaskModel
import javax.inject.Inject

class UpdateTaskUseCase @Inject constructor(private val taskRepository: TaskRepository) {

    suspend operator fun invoke(taskModel: TaskModel){
        taskRepository.update(taskModel)
    }

}
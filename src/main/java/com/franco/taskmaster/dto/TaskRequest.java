package com.franco.taskmaster.dto;

import com.franco.taskmaster.model.TaskStatus;
import lombok.Data;

@Data
public class TaskRequest {
    private String title;
    private String description;
    private TaskStatus status;
}
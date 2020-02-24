package pe.cibertec.parcialproject.adapter;

import pe.cibertec.parcialproject.models.Task;

public class TaskItem extends TaskType {

    private Task task;

    public TaskItem(Task task){
        this.task = task;
    }

    public Task getTask() {
        return task;
    }

    @Override
    public int getType() {
        return TYPE_TASK;
    }
}

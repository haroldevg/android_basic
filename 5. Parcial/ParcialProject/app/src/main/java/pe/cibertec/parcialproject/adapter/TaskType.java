package pe.cibertec.parcialproject.adapter;

public abstract class TaskType {

    public static final int TYPE_HEADER = 0;
    public static final int TYPE_TASK = 1;

    abstract public int getType();

}


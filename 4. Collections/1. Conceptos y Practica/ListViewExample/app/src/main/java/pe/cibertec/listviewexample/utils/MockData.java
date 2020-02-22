package pe.cibertec.listviewexample.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import pe.cibertec.listviewexample.R;
import pe.cibertec.listviewexample.models.Student;

public interface MockData {
    List<Student> students = new ArrayList<Student>(Arrays.<Student>asList(
        new Student("Estudiante 1","Estudiante Nuevo 1","Av. Direccion 1234",5, R.drawable.user_1),
        new Student("Estudiante 2","Estudiante Nuevo 1","Av. Direccion 1234",5, R.drawable.user_2),
        new Student("Estudiante 3","Estudiante Nuevo 1","Av. Direccion 1234",5, R.drawable.user_3),
        new Student("Estudiante 4","Estudiante Nuevo 1","Av. Direccion 1234",5, R.drawable.user_4),
        new Student("Estudiante 5","Estudiante Nuevo 1","Av. Direccion 1234",5, R.drawable.user_1),
        new Student("Estudiante 6","Estudiante Nuevo 1","Av. Direccion 1234",5, R.drawable.user_2),
        new Student("Estudiante 7","Estudiante Nuevo 1","Av. Direccion 1234",5, R.drawable.user_3)
    ));
}

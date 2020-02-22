package pe.cibertec.listviewexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import pe.cibertec.listviewexample.adapter.StudentAdapterHolder;
import pe.cibertec.listviewexample.adapter.StudentAdapterSimple;
import pe.cibertec.listviewexample.models.Student;

public class ThirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        ListView lvMain = findViewById(R.id.lv_main);

        List<Student> studentList = new ArrayList<Student>();
        studentList.add(new Student("Estudiante 1","Estudiante Nuevo 1","Av. Direccion 1234",5));
        studentList.add(new Student("Estudiante 2","Estudiante Nuevo 2","Av. Direccion 1234",5));
        studentList.add(new Student("Estudiante 3","Estudiante Nuevo 3","Av. Direccion 1234",5));
        studentList.add(new Student("Estudiante 4","Estudiante Nuevo 4","Av. Direccion 1234",5));
        studentList.add(new Student("Estudiante 5","Estudiante Nuevo 5","Av. Direccion 1234",5));

        StudentAdapterHolder adapter = new StudentAdapterHolder(this, studentList);
        lvMain.setAdapter(adapter);
    }
}

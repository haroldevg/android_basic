package pe.cibertec.listviewexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

import java.util.ArrayList;
import java.util.List;

import pe.cibertec.listviewexample.adapter.GridStudentAdapter;
import pe.cibertec.listviewexample.models.Student;

public class FourthActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);
        GridView lvMain = findViewById(R.id.gv_main);

        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Estudiante 1","Estudiante Nuevo 1","Av. Direccion 1234",5,R.drawable.user_1));
        studentList.add(new Student("Estudiante 2","Estudiante Nuevo 2","Av. Direccion 1234",5,R.drawable.user_2));
        studentList.add(new Student("Estudiante 3","Estudiante Nuevo 3","Av. Direccion 1234",5,R.drawable.user_3));
        studentList.add(new Student("Estudiante 4","Estudiante Nuevo 4","Av. Direccion 1234",5,R.drawable.user_4));
        studentList.add(new Student("Estudiante 1","Estudiante Nuevo 1","Av. Direccion 1234",5,R.drawable.user_1));
        studentList.add(new Student("Estudiante 2","Estudiante Nuevo 2","Av. Direccion 1234",5,R.drawable.user_2));
        studentList.add(new Student("Estudiante 3","Estudiante Nuevo 3","Av. Direccion 1234",5,R.drawable.user_3));
        studentList.add(new Student("Estudiante 4","Estudiante Nuevo 4","Av. Direccion 1234",5,R.drawable.user_4));

        GridStudentAdapter adapter = new GridStudentAdapter(this, studentList);
        lvMain.setAdapter(adapter);
    }
}

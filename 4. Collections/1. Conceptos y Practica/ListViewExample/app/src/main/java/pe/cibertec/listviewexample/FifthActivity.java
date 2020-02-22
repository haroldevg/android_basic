package pe.cibertec.listviewexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import pe.cibertec.listviewexample.adapter.RecyclerAdapter;
import pe.cibertec.listviewexample.models.Student;
import pe.cibertec.listviewexample.utils.MockData;

public class FifthActivity extends AppCompatActivity {

    private List<Student> studentList = new ArrayList<>();
    private RecyclerView recyclerView;
    private RecyclerAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifth);

        studentList = MockData.students;

        recyclerView = (RecyclerView) findViewById(R.id.rcv_main);
        adapter = new RecyclerAdapter(studentList);

        //RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        RecyclerView.LayoutManager mLayoutManager = new GridLayoutManager(getApplicationContext(), 3, GridLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setAdapter(adapter);

    }
}

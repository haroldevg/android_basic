package pe.cibertec.parcialproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import com.google.android.material.snackbar.Snackbar;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import pe.cibertec.parcialproject.adapter.HeaderItem;
import pe.cibertec.parcialproject.adapter.TaskAdapter;
import pe.cibertec.parcialproject.adapter.TaskItem;
import pe.cibertec.parcialproject.adapter.TaskType;
import pe.cibertec.parcialproject.models.Task;
import pe.cibertec.parcialproject.utils.MockData;

public class MainActivity extends AppCompatActivity {

    Toolbar toolbar;
    RecyclerView recyclerView;

    List<TaskType> taskList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = findViewById(R.id.tb_main);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(false);
        getSupportActionBar().setTitle("");

        recyclerView = findViewById(R.id.rv_main);
        Map<String,List<Task>> taskMap = toMap(MockData.task);

        for (String title : taskMap.keySet()) {
            HeaderItem header = new HeaderItem(title);
            taskList.add(header);
            for (Task task : taskMap.get(title)) {
                TaskItem item = new TaskItem(task);
                taskList.add(item);
            }
        }

        TaskAdapter adapter = new TaskAdapter(this, taskList, task -> Log.d("TITLE",task.getTitle()));

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);

    }


    private Map<String, List<Task>> toMap(List<Task> tasks) {
        Map<String, List<Task>> map = new TreeMap<>();
        for (Task task : tasks) {
            List<Task> value = map.get(task.getHumanDate());
            if (value == null) {
                value = new ArrayList<>();
                map.put(task.getHumanDate(), value);
            }
            value.add(task);
        }
        return map;
    }
}

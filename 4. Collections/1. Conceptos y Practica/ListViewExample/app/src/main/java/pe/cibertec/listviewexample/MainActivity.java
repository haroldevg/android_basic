package pe.cibertec.listviewexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import pe.cibertec.listviewexample.adapter.StringAdapter;

public class MainActivity extends AppCompatActivity {

    List<String> arrayList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView lvMain = findViewById(R.id.lv_main);

        //Arreglo de datos
        arrayList.add("Adapter Simple");
        arrayList.add("Adapter Holder");
        arrayList.add("GridView Holder");
        arrayList.add("RecyclerView");

        StringAdapter adapter = new StringAdapter(this,
                android.R.layout.simple_list_item_1, arrayList);
        lvMain.setAdapter(adapter);

    }

}

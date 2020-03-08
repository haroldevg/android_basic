package pe.haroldev.fragmentclass;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import pe.haroldev.fragmentclass.adapter.StringAdapter;

public class MainActivity extends AppCompatActivity {


    List<String> arrayList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ListView lvMain = findViewById(R.id.lv_main);

        //Arreglo de datos
        arrayList.add("Fragment Static");
        arrayList.add("Fragment Dynamic");
        arrayList.add("Finding Fragments");
        arrayList.add("Fragment By Arguments");
        arrayList.add("Fragment Methods");
        arrayList.add("Fragments Adapter Tablets");


        StringAdapter adapter = new StringAdapter(this,
                android.R.layout.simple_list_item_1, arrayList);
        lvMain.setAdapter(adapter);

    }
}

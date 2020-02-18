package pe.cibertec.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Indicamos que este toolbar reemplazara al que usamos por defecto
        Toolbar toolbar = findViewById(R.id.tb_main);
        setSupportActionBar(toolbar);
        //Obtenermos el tablyout que se ha inflado en la vista y agregamos algunos tabs
        TabLayout tabLayout = findViewById(R.id.tbl_main);
        tabLayout.addTab(tabLayout.newTab().setText("TAB 1"));
        tabLayout.addTab(tabLayout.newTab().setText("TAB 2"));
        tabLayout.addTab(tabLayout.newTab().setText("TAB 3"));
        //Ejemplo para fixed y scrolling
        tabLayout.addTab(tabLayout.newTab().setText("TAB 4"));
        tabLayout.addTab(tabLayout.newTab().setText("TAB 5"));
        tabLayout.addTab(tabLayout.newTab().setText("TAB 6"));
        tabLayout.addTab(tabLayout.newTab().setText("TAB 7"));
        tabLayout.addTab(tabLayout.newTab().setText("TAB 8"));

    }
}

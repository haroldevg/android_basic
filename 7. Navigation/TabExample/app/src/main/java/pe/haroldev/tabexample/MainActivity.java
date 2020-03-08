package pe.haroldev.tabexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.View;

import com.google.android.material.tabs.TabLayout;

import pe.haroldev.tabexample.adapter.ViewPagerAdapter;
import pe.haroldev.tabexample.fragments.BlankFragment;

public class MainActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = findViewById(R.id.tb_main);
        toolbar.setTitle("Lista de tareas");
        setSupportActionBar(toolbar);

        viewPager = findViewById(R.id.vp_main);
        setupViewPager(viewPager);

        tabLayout = findViewById(R.id.tbl_main);
        tabLayout.setupWithViewPager(viewPager);

    }

    private void setupViewPager(ViewPager viewPager){
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new BlankFragment(),"Tareas");
        adapter.addFragment(new BlankFragment(),"Actividades");
        viewPager.setAdapter(adapter);
    }



}

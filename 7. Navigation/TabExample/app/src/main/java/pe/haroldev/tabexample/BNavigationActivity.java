package pe.haroldev.tabexample;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.tabs.TabLayout;

import pe.haroldev.tabexample.adapter.ViewPagerAdapter;
import pe.haroldev.tabexample.fragments.BlankFragment;

public class BNavigationActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {

    private Toolbar toolbar;
    private BottomNavigationView bottomNavigationView;
    private ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bnavigation);
        toolbar = findViewById(R.id.tb_main);
        toolbar.setTitle("Lista de tareas");
        setSupportActionBar(toolbar);

        viewPager = findViewById(R.id.vp_main);
        bottomNavigationView = findViewById(R.id.bn_main);
        bottomNavigationView.setOnNavigationItemSelectedListener(this);

        setupViewPager(viewPager,bottomNavigationView);

    }


    private void setupViewPager(ViewPager viewPager, final BottomNavigationView bottomNavigationView){
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new BlankFragment(),"Tareas");
        adapter.addFragment(new BlankFragment(),"Actividades");
        bottomNavigationView.getMenu().add(Menu.NONE,1,Menu.NONE,"Tareas").setIcon(R.drawable.ic_calendar);
        bottomNavigationView.getMenu().add(Menu.NONE,2,Menu.NONE,"Actividades").setIcon(R.drawable.ic_clock);
        viewPager.setAdapter(adapter);
        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                switch (position) {
                    case 0:
                        bottomNavigationView.getMenu().findItem(1).setChecked(true);
                        break;
                    case 1:
                        bottomNavigationView.getMenu().findItem(2).setChecked(true);
                        break;
                }
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

        switch(menuItem.getItemId()){
            case 1:
                viewPager.setCurrentItem(0);
                break;
            case 2:
                viewPager.setCurrentItem(1);
                break;
        }
        return true;
    }
}

package pe.haroldev.fragmentclass;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import pe.haroldev.fragmentclass.fragments.DetailFragment;
import pe.haroldev.fragmentclass.fragments.ListFragment;
import pe.haroldev.fragmentclass.models.Contacto;

public class TabletActivity extends AppCompatActivity implements ListFragment.OnContactoClickListener {

    private boolean dualPane;
    private int index = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tablet);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        View detailFrame = findViewById(R.id.fg_detail);
        dualPane = detailFrame != null && detailFrame.getVisibility() == View.VISIBLE;
        ListFragment fragmentList = (ListFragment) getSupportFragmentManager().findFragmentById(R.id.fg_list);
        index = fragmentList.getSelectedPosition();
    }

    @Override
    public void onContactoClick(Contacto contacto) {
        if(dualPane){
            DetailFragment detailFragment = (DetailFragment) getSupportFragmentManager().findFragmentById(R.id.fg_detail);
            ListFragment listFragment = (ListFragment) getSupportFragmentManager().findFragmentById(R.id.fg_list);

            if(detailFragment == null || listFragment.getSelectedPosition() != index){
                index = listFragment.getSelectedPosition();
                detailFragment = DetailFragment.newInstance(contacto);
                FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
                ft.replace(R.id.fg_detail,detailFragment);
                ft.commit();
            }
        }else{
            Intent intent = new Intent(this,DetailActivity.class);
            intent.putExtra(DetailFragment.ARG_CONTACTO,contacto);
            startActivity(intent);
        }
    }
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}

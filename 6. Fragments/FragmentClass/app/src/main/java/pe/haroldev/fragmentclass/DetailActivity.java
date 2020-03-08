package pe.haroldev.fragmentclass;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import pe.haroldev.fragmentclass.fragments.DetailFragment;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        if(savedInstanceState == null){
            DetailFragment detailFragment = new DetailFragment();
            detailFragment.setArguments(getIntent().getExtras());
            getSupportFragmentManager().beginTransaction().add(android.R.id.content,detailFragment).commit();
        }
    }
}

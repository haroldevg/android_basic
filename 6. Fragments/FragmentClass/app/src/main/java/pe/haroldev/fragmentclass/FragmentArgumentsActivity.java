package pe.haroldev.fragmentclass;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import pe.haroldev.fragmentclass.fragments.BlankFragment;

public class FragmentArgumentsActivity extends AppCompatActivity {

    final String title = "TITULO";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment_arguments);
        if(savedInstanceState == null){
            Bundle bundle = new Bundle();
            bundle.putString("title",title);
            BlankFragment blankFragment = new BlankFragment();
            blankFragment.setArguments(bundle);
            getSupportFragmentManager().beginTransaction().add(R.id.fm_main,blankFragment).commit();
        }
    }
}

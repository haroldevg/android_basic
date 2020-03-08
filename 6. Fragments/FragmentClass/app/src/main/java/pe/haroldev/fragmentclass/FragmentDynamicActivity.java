package pe.haroldev.fragmentclass;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

import pe.haroldev.fragmentclass.fragments.BlankFragment;

public class FragmentDynamicActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment_dinamyc);

        FragmentTransaction fmTransaction = getSupportFragmentManager().beginTransaction();
        fmTransaction.replace(R.id.fm_replace,new BlankFragment());
        fmTransaction.commit();

    }
}

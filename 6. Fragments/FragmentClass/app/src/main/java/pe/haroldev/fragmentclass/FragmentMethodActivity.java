package pe.haroldev.fragmentclass;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.widget.TextView;

import pe.haroldev.fragmentclass.fragments.SecondFragment;

public class FragmentMethodActivity extends AppCompatActivity implements SecondFragment.OnFragmentInteractionListener {

    TextView tvTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment_method);
        tvTitle = findViewById(R.id.tv_main);
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.fm_main, new SecondFragment());
        ft.commit();
    }

    @Override
    public void onButtonInteraction(String changeButtonText) {
        tvTitle.setText(changeButtonText);
    }
}

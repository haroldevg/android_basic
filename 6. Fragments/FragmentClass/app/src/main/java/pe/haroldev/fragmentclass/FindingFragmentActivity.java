package pe.haroldev.fragmentclass;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;

import pe.haroldev.fragmentclass.fragments.BlankFragment;

public class FindingFragmentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finding_fragment);

        /*FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.fm_first, new BlankFragment());
        ft.replace(R.id.fm_second,new BlankFragment());
        ft.commit();*/


        BlankFragment bFirst =  (BlankFragment) getSupportFragmentManager().findFragmentById(R.id.fm_first);
        if(bFirst != null ) bFirst.changeHeaderText("Primer Fragment");

        BlankFragment bSecond =  (BlankFragment) getSupportFragmentManager().findFragmentById(R.id.fm_second);
        if(bSecond != null ) bSecond.changeHeaderText("Segundo Fragment");

    }

    @Override
    public View onCreateView(View parent,String name,Context context,AttributeSet attrs) {
        return super.onCreateView(parent, name, context, attrs);
    }
}

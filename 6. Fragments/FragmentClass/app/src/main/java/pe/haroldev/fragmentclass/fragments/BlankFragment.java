package pe.haroldev.fragmentclass.fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;
import android.widget.TextView;

import pe.haroldev.fragmentclass.R;

public class BlankFragment extends Fragment {

    TextView tvMain;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View rootView = inflater.inflate(R.layout.fragment_blank, container, false);
        tvMain = rootView.findViewById(R.id.fragment_header);
        if(getArguments() != null){
            tvMain.setText(getArguments().getString("title"));
        }
        return rootView;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }

    public void changeHeaderText(String newText){
        this.tvMain.setText(newText);
    }

}

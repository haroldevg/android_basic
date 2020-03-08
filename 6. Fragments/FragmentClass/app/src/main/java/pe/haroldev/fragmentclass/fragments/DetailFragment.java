package pe.haroldev.fragmentclass.fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import pe.haroldev.fragmentclass.R;
import pe.haroldev.fragmentclass.models.Contacto;

public class DetailFragment extends Fragment {

    public static final String ARG_CONTACTO = "contacto";

    private Contacto contacto;

    public static DetailFragment newInstance(Contacto contacto){
        DetailFragment f = new DetailFragment();
        Bundle args = new Bundle();
        args.putParcelable(ARG_CONTACTO,contacto);
        f.setArguments(args);
        return f;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(getArguments() != null){
            contacto = getArguments().getParcelable(ARG_CONTACTO);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_detail, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        TextView tvName = view.findViewById(R.id.tv_name);
        TextView tvTelephone = view.findViewById(R.id.tv_telephone);
        TextView tvEmail = view.findViewById(R.id.tv_email);
        TextView tvAddress = view.findViewById(R.id.tv_address);

        tvName.setText(contacto.getName());
        tvTelephone.setText(contacto.getTelephone());
        tvEmail.setText(contacto.getEmail());
        tvAddress.setText(contacto.getAddress());

    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }
}

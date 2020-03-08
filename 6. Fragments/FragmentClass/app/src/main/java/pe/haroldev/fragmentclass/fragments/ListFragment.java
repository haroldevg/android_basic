package pe.haroldev.fragmentclass.fragments;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.Arrays;
import java.util.List;

import pe.haroldev.fragmentclass.R;
import pe.haroldev.fragmentclass.adapter.ListAdapter;
import pe.haroldev.fragmentclass.models.Contacto;

public class ListFragment extends Fragment implements AdapterView.OnItemClickListener {

    private static final String SELECTED_POSITION = "selection";

    private ListView listView;
    private boolean dualPane;
    private Contacto[] contactos;
    private int selectedPosition = 0;
    private OnContactoClickListener onContactoClickListener;

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        try{
            onContactoClickListener = (OnContactoClickListener) context;
        }catch (ClassCastException e){
            throw new ClassCastException(context.toString()+" must implement OnContactoClickListener");
        }
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_list, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        listView = view.findViewById(R.id.lv_main);
        contactos = Contacto.LISTA;
        List<Contacto> aux = Arrays.asList(contactos);
        ListAdapter adapter = new ListAdapter(getContext(), aux);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(this);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        View detailFrame = getActivity().findViewById(R.id.fg_detail);
        dualPane = detailFrame != null  && detailFrame.getVisibility() == View.VISIBLE;
        if(savedInstanceState != null){
            selectedPosition = savedInstanceState.getInt(SELECTED_POSITION,0);
        }
        if(dualPane){
            listView.setChoiceMode(ListView.CHOICE_MODE_SINGLE);
            listView.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
                @Override
                public void onGlobalLayout() {
                    selectContact(selectedPosition);
                    listView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                }
            });
        }
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt(SELECTED_POSITION,selectedPosition);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        selectedPosition = position;
        onContactoClickListener.onContactoClick(contactos[position]);
    }

    private void selectContact(int index){
        if(dualPane){
            listView.setItemChecked(index,true);
            listView.setSelection(index);
        }
        onContactoClickListener.onContactoClick(contactos[index]);
    }

    public int getSelectedPosition(){
        return selectedPosition;
    }

    public interface OnContactoClickListener{
        void onContactoClick(Contacto contacto);
    }
}

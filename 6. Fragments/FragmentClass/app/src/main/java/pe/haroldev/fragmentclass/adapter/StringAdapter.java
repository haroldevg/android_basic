package pe.haroldev.fragmentclass.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

import pe.haroldev.fragmentclass.FindingFragmentActivity;
import pe.haroldev.fragmentclass.FragmentArgumentsActivity;
import pe.haroldev.fragmentclass.FragmentDynamicActivity;
import pe.haroldev.fragmentclass.FragmentMethodActivity;
import pe.haroldev.fragmentclass.FragmentStaticActivity;
import pe.haroldev.fragmentclass.TabletActivity;

public class StringAdapter extends ArrayAdapter<String> {

    //Lista de elementos
    List<String> items;

    //Contexto
    Context context;

    //layout resource
    int resource;

    public StringAdapter(@NonNull Context context, int resource, @NonNull List<String> objects) {
        super(context, resource, objects);
        this.context = context;
        this.resource = resource;
        this.items = objects;
    }

    @NonNull
    @Override
    public View getView(final int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        LayoutInflater layoutInflater = LayoutInflater.from(context);

        View view = layoutInflater.inflate(resource,null,false);

        TextView textView = view.findViewById(android.R.id.text1);

        textView.setText(items.get(position));

        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectActivity(position);
            }
        });

        return view;

    }


    private void selectActivity(int position){
        Intent intent;
        switch(position){
            case 0:
                intent = new Intent(context, FragmentStaticActivity.class);
                context.startActivity(intent);
                break;
            case 1:
                intent = new Intent(context, FragmentDynamicActivity.class);
                context.startActivity(intent);
                break;
            case 2:
                intent = new Intent(context, FindingFragmentActivity.class);
                context.startActivity(intent);
                break;
            case 3:
                intent = new Intent(context, FragmentArgumentsActivity.class);
                context.startActivity(intent);
                break;
            case 4:
                intent = new Intent(context, FragmentMethodActivity.class);
                context.startActivity(intent);
                break;
            case 5:
                intent = new Intent(context, TabletActivity.class);
                context.startActivity(intent);
                break;
        }
    }

}

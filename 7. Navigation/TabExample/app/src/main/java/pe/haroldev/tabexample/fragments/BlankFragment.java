package pe.haroldev.tabexample.fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import pe.haroldev.tabexample.R;
import pe.haroldev.tabexample.adapter.TaskAdapter;
import pe.haroldev.tabexample.models.Task;

public class BlankFragment extends Fragment {

    private TaskAdapter adapter;
    private List<Task> taskList = new ArrayList<>();
    private RecyclerView recyclerView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_blank, container, false);

        taskList = Arrays.asList(Task.LISTA);

        recyclerView = (RecyclerView) root.findViewById(R.id.rv_main);
        adapter = new TaskAdapter(taskList);

        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setAdapter(adapter);

        return root;
    }

}

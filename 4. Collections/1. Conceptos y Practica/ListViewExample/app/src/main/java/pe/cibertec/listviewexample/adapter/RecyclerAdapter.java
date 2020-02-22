package pe.cibertec.listviewexample.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import pe.cibertec.listviewexample.R;
import pe.cibertec.listviewexample.models.Student;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.RecyclerViewHolder> {

    private List<Student> studentList;

    public RecyclerAdapter(List<Student> list){
        studentList = list;
    }

    @NonNull
    @Override
    public RecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_student, parent, false);
        return new RecyclerViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewHolder holder, int position) {

        Student student = studentList.get(position);
        holder.tvName.setText(student.getName());
        holder.tvAddress.setText(student.getAddress());
        holder.tvDescription.setText(student.getDescription());

    }

    @Override
    public int getItemCount() {
        return studentList.size();
    }

    public static class RecyclerViewHolder extends RecyclerView.ViewHolder {

        public TextView tvName;
        public TextView tvDescription;
        public TextView tvAddress;

        public RecyclerViewHolder(@NonNull View itemView) {
            super(itemView);
            tvName = itemView.findViewById(R.id.tv_name);
            tvDescription = itemView.findViewById(R.id.tv_description);
            tvAddress = itemView.findViewById(R.id.tv_address);
        }
    }

}

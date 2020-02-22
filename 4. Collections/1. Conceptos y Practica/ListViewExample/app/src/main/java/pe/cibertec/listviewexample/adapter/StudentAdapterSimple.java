package pe.cibertec.listviewexample.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

import pe.cibertec.listviewexample.R;
import pe.cibertec.listviewexample.models.Student;

public class StudentAdapterSimple extends ArrayAdapter<Student> {

    public StudentAdapterSimple(@NonNull Context context, @NonNull List<Student> objects) {
        super(context, 0, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        Student student = getItem(position);

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_student,parent,false);
        }

        TextView tvName = convertView.findViewById(R.id.tv_name);
        TextView tvDescription = convertView.findViewById(R.id.tv_description);
        TextView tvAddress = convertView.findViewById(R.id.tv_address);
        TextView tvGrades = convertView.findViewById(R.id.tv_grade);

        tvName.setText(student.getName());
        tvDescription.setText(student.getDescription());
        tvAddress.setText(student.getAddress());
        tvGrades.setText(Integer.toString(student.getGrade()));

        return convertView;
    }
}

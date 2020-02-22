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

public class StudentAdapterHolder extends ArrayAdapter<Student> {

    private static class ViewHolder {
        TextView tvName;
        TextView tvDescription;
        TextView tvAddress;
        TextView tvGrade;
    }

    public StudentAdapterHolder(@NonNull Context context, @NonNull List<Student> objects) {
        super(context, 0, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        Student student = getItem(position);

        ViewHolder viewHolder;

        if (convertView == null) {
            viewHolder = new ViewHolder();
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_student, parent, false);

            viewHolder.tvName = convertView.findViewById(R.id.tv_name);
            viewHolder.tvDescription = convertView.findViewById(R.id.tv_description);
            viewHolder.tvAddress = convertView.findViewById(R.id.tv_address);
            viewHolder.tvGrade = convertView.findViewById(R.id.tv_grade);

            convertView.setTag(viewHolder);
        }else{

            viewHolder = (ViewHolder) convertView.getTag();

        }
        
        viewHolder.tvName.setText(student.getName());
        viewHolder.tvDescription.setText(student.getDescription());
        viewHolder.tvAddress.setText(student.getAddress());
        viewHolder.tvGrade.setText(Integer.toString(student.getGrade()));

        return convertView;
    }
}

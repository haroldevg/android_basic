package pe.cibertec.listviewexample.adapter;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.media.Image;
import android.net.Uri;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.target.Target;

import java.util.List;

import pe.cibertec.listviewexample.R;
import pe.cibertec.listviewexample.models.Student;

public class GridStudentAdapter extends BaseAdapter {

    private Context context;
    private List<Student> studentList;

    public GridStudentAdapter(Context context, List<Student> list){
        this.context = context;
        this.studentList = list;
    }

    private static class ViewHolder {
        TextView tvName;
        ImageView ivPhoto;
    }

    @Override
    public int getCount() {
        return studentList.size();
    }

    @Override
    public Object getItem(int position) {
        return studentList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        Student student = studentList.get(position);
        ViewHolder viewHolder;

        if(convertView == null){
            viewHolder = new ViewHolder();
            convertView = LayoutInflater.from(context).inflate(R.layout.item_grid_student, parent, false);
            viewHolder.ivPhoto = convertView.findViewById(R.id.iv_card);
            viewHolder.tvName = convertView.findViewById(R.id.tv_card);
            convertView.setTag(viewHolder);
        }else{
            viewHolder = (ViewHolder) convertView.getTag();
        }

        viewHolder.tvName.setText(student.getName());

        Glide.with(context)
                .load(student.getImageUrl())
                .placeholder(R.drawable.placeholder)
                .into(viewHolder.ivPhoto);

        return convertView;

    }
}

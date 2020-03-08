package pe.haroldev.tabexample.adapter;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import pe.haroldev.tabexample.R;
import pe.haroldev.tabexample.models.Task;

public class TaskAdapter extends RecyclerView.Adapter<TaskAdapter.RecyclerViewHolder> {

    private List<Task> taskList;

    public TaskAdapter(List<Task> list){
        taskList = list;
    }

    @NonNull
    @Override
    public RecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_task, parent, false);
        return new RecyclerViewHolder(itemView,parent.getContext());
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewHolder holder, int position) {

        Task task = taskList.get(position);
        holder.tvCourse.setText(task.getCourse());
        holder.tvCourseType.setText(task.getCourseType());
        holder.tvDate.setText(task.getDate());
        holder.tvTime.setText(task.getTime());
        holder.tvTimeout.setText(task.getHurryTimeout());

        GradientDrawable drawable = (GradientDrawable) holder.drawable.findDrawableByLayerId(R.id.it_border);
        drawable.setColor(Color.parseColor(task.getColor()));

        holder.container.setBackground(holder.drawable);
    }

    @Override
    public int getItemCount() {
        return taskList.size();
    }

    public static class RecyclerViewHolder extends RecyclerView.ViewHolder {

        public TextView tvCourse;
        public TextView tvCourseType;
        public TextView tvDate;
        public TextView tvTime;
        public TextView tvTimeout;
        public LayerDrawable drawable;
        public View container;

        public RecyclerViewHolder(@NonNull View itemView,Context context) {
            super(itemView);
            tvCourse = itemView.findViewById(R.id.tv_title);
            tvCourseType = itemView.findViewById(R.id.tv_description);
            tvDate = itemView.findViewById(R.id.tv_date);
            tvTime = itemView.findViewById(R.id.tv_time);
            tvTimeout = itemView.findViewById(R.id.tv_timeout);
            container = itemView.findViewById(R.id.ll_background);
            drawable = (LayerDrawable) ContextCompat.getDrawable(context,R.drawable.card_border);
        }
    }

}
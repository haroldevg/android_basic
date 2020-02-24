package pe.cibertec.parcialproject.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import pe.cibertec.parcialproject.R;
import pe.cibertec.parcialproject.models.Task;

public class TaskAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private List<TaskType> itemList;
    private OnItemClickListener itemClickListener;
    private Context context;

    public TaskAdapter(Context context,List<TaskType> itemList, OnItemClickListener itemClickListener){
        this.context = context;
        this.itemList = itemList;
        this.itemClickListener = itemClickListener;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);

        switch (viewType) {
            case TaskType.TYPE_HEADER: {
                View itemView = inflater.inflate(R.layout.item_task_header, parent, false);
                return new HeaderViewHolder(itemView);
            }
            case TaskType.TYPE_TASK: {
                View itemView = inflater.inflate(R.layout.item_task, parent, false);
                return new ViewHolder(itemView);
            }
            default:
                throw new IllegalStateException("unsupported item type");
        }
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

        int itemType = getItemViewType(position);

        switch (itemType){
            case TaskType.TYPE_HEADER: {
                HeaderItem task = (HeaderItem) itemList.get(position);
                HeaderViewHolder viewHolder = (HeaderViewHolder) holder;
                viewHolder.tvTitle.setText(task.getTitle());
                break;
            }
            case TaskType.TYPE_TASK: {
                TaskItem task = (TaskItem) itemList.get(position);
                ViewHolder viewHolder = (ViewHolder) holder;
                viewHolder.tvTitle.setText(task.getTask().getTitle());
                viewHolder.tvDescription.setText(task.getTask().getDescription());
                viewHolder.tvDate.setText(task.getTask().getTime());
                viewHolder.container.setOnClickListener(v -> itemClickListener.onItemClick(task.getTask()));
                break;
            }
            default: throw new IllegalStateException("UNSUPPORTED ITEM TYPE");
        }



    }
    @Override
    public int getItemViewType(int position) {
        return itemList.get(position).getType();
    }

    @Override
    public int getItemCount() {
        return itemList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{

        View container;
        CheckBox cbxEnable;
        TextView tvTitle;
        TextView tvDescription;
        TextView tvDate;

        ViewHolder(@NonNull View itemView) {
            super(itemView);
            cbxEnable = itemView.findViewById(R.id.cbx_task);
            tvTitle = itemView.findViewById(R.id.tv_title);
            tvDescription = itemView.findViewById(R.id.tv_description);
            tvDate = itemView.findViewById(R.id.tv_time);
            container = itemView.findViewById(R.id.ll_container);
        }
    }

    public static class HeaderViewHolder extends RecyclerView.ViewHolder{

        TextView tvTitle;

        HeaderViewHolder(@NonNull View itemView) {
            super(itemView);
            tvTitle = itemView.findViewById(R.id.tv_header);
        }
    }

    public interface OnItemClickListener{
        void onItemClick(Task task);
    }

}



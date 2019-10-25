package felixyunianto.com;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class ListLinuxAdapter extends RecyclerView.Adapter<ListLinuxAdapter.ListViewHolder> {
    private ArrayList<Linux> listLinux;

    private OnItemClickCallback onItemClickCallback;

    public void setOnItemClickCallback(OnItemClickCallback onItemClickCallback){
        this.onItemClickCallback = onItemClickCallback;
    }
    public ListLinuxAdapter(ArrayList<Linux> list){
        this.listLinux = list;
    }



    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row_linux, parent, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListLinuxAdapter.ListViewHolder holder, int position) {
        Linux linux = listLinux.get(position);
        holder.tvLinux.setText(linux.getName());
        holder.tvDetail.setText(linux.getDetail());
        Glide.with(holder.itemView.getContext())
                .load(linux.getPhoto())
                .apply(new RequestOptions().override(60,55))
                .into(holder.Gambar);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onItemClickCallback.onItemClicked(listLinux.get(holder.getAdapterPosition()));
            }
        });
    }

    @Override
    public int getItemCount() {
        return listLinux.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        TextView tvLinux, tvDetail;
        ImageView Gambar;

        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            tvLinux = itemView.findViewById(R.id.tv_name);
            tvDetail = itemView.findViewById(R.id.tv_detail);
            Gambar = itemView.findViewById(R.id.img_linux);
        }
    }
    public interface OnItemClickCallback {
        void onItemClicked(Linux data);
    }
}

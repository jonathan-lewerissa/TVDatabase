package com.jonathanrl.tvdatabase;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.jonathanrl.tvdatabase.model.TvShow;

import java.util.ArrayList;
import java.util.List;

public class SeriesAdapter extends RecyclerView.Adapter<SeriesAdapter.MyViewHolder> {
    private Context context;
    private ArrayList<TvShow> tvShowList;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        private TextView title, info;
        public ImageView thumbnail;

        public MyViewHolder(View view) {
            super(view);

            this.title = view.findViewById(R.id.card_title);
            this.info = view.findViewById(R.id.card_info);
            this.thumbnail = view.findViewById(R.id.card_thumbnail);
        }

        public void setDetail(TvShow tvShow) {
            title.setText(tvShow.getSeriesName());
            info.setText(String.valueOf(tvShow.getRating()));
        }
    }

    public SeriesAdapter(Context mContext, ArrayList<TvShow> tvShowList) {
        this.context = mContext;
        this.tvShowList = tvShowList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(context)
                .inflate(R.layout.card, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull final MyViewHolder holder, int position) {
        TvShow tvShow = tvShowList.get(position);
        holder.setDetail(tvShow);
    }

    @Override
    public int getItemCount() {
        return tvShowList.size();
    }
}

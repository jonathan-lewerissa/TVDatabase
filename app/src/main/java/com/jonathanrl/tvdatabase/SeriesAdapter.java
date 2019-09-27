package com.jonathanrl.tvdatabase;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.jonathanrl.tvdatabase.model.Episode;

import java.util.ArrayList;

import static android.content.ContentValues.TAG;

public class SeriesAdapter extends RecyclerView.Adapter<SeriesAdapter.MyViewHolder> {
    private Context context;
    private ArrayList<Episode> episodeList;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        private TextView title, firstAired, director, guestStar, rating;
        public ImageView thumbnail;

        public MyViewHolder(View view) {
            super(view);

            this.title = view.findViewById(R.id.card_title);
            this.firstAired = view.findViewById(R.id.card_first_aired);
            this.director = view.findViewById(R.id.card_director);
            this.guestStar = view.findViewById(R.id.card_guest_star);
            this.rating = view.findViewById(R.id.card_rating);
            this.thumbnail = view.findViewById(R.id.card_thumbnail);
        }

        public void setDetail(Episode episode) {
            title.setText(episode.getEpisodeName());
            firstAired.setText("First aired: " + episode.getFirstAired());
            director.setText("Directed by: " + episode.getDirector());
            guestStar.setText("Guest stars: " + episode.getGuestStar());
            rating.setText("Rating: " + String.valueOf(episode.getRating()));

            try {
                Glide.with(thumbnail.getContext())
                        .load(episode.getImageUrl())
                        .into(thumbnail);
            } catch (Exception e) {
                Log.d(TAG, "ERROR loading image: " + e.toString());
            }
        }
    }

    public SeriesAdapter(Context mContext, ArrayList<Episode> episodeList) {
        this.context = mContext;
        this.episodeList = episodeList;
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
        Episode episode = episodeList.get(position);
        holder.setDetail(episode);
    }

    @Override
    public int getItemCount() {
        return episodeList.size();
    }
}

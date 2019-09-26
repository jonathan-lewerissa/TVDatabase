package com.jonathanrl.tvdatabase;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.jonathanrl.tvdatabase.model.TvShow;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private SeriesAdapter seriesAdapter;
    private ArrayList<TvShow> tvShowArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        tvShowArrayList = new ArrayList<>();

        seriesAdapter = new SeriesAdapter(this, tvShowArrayList);
        recyclerView.setAdapter(seriesAdapter);
        createListData();
    }

    private void createListData() {
        tvShowArrayList.add(new TvShow(1, "Naruto", 5.0, null));
        tvShowArrayList.add(new TvShow(2, "Naruto", 4.0, null));
        tvShowArrayList.add(new TvShow(3, "Naruto", 4.5, null));

        seriesAdapter.notifyDataSetChanged();
    }

}

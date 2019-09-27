package com.jonathanrl.tvdatabase;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.jonathanrl.tvdatabase.model.Episode;
import com.jonathanrl.tvdatabase.model.GuestStar;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

//    this project is inspired by the following projects / articles:
//    https://medium.com/@droidbyme/android-cardview-with-recyclerview-90cfeda6a4d4
//    https://www.androidhive.info/2016/05/android-working-with-card-view-and-recycler-view/

    private RecyclerView recyclerView;
    private SeriesAdapter seriesAdapter;
    private ArrayList<Episode> episodeArrayList;
    private ArrayList<GuestStar> guestStarArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        episodeArrayList = new ArrayList<>();

        seriesAdapter = new SeriesAdapter(this, episodeArrayList);
        recyclerView.setAdapter(seriesAdapter);
        createListData();
    }

    private void createListData() {
        GuestStar gs1 = new GuestStar(1, "Masashi Sugawara", "actor", "male");
        GuestStar gs2 = new GuestStar(2, "Shingo Horii", "actor", "male");
        GuestStar gs3 = new GuestStar(3, "Masuhiko Kawazu", "actor", "male");

        String actors = gs1.getName() + ", " + gs2.getName() + ", " + gs3.getName();

        episodeArrayList.add(new Episode(324783, 1, "You Guys!! Do You Even Have a Gintama? (1)", "2006-04-04", actors,  "Me!", 9, "https://www.thetvdb.com/banners/episodes/79895/324783.jpg"));
        episodeArrayList.add(new Episode(324784, 1, "You Guys!! Do You Even Have a Gintama? (2)", "2006-04-04", actors, "Me!", 10, "https://www.thetvdb.com/banners/episodes/79895/324784.jpg"));
        episodeArrayList.add(new Episode(324785, 1, "Nobody with Naturally Wavy Hair Can be That Bad!", "2006-04-11", actors,  "Me!", 9, "https://www.thetvdb.com/banners/episodes/79895/324785.jpg"));
        seriesAdapter.notifyDataSetChanged();
    }

}

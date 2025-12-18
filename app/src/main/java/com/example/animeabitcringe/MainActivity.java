package com.example.animeabitcringe;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView anime;
    private ArrayList<String> animelist = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        anime = findViewById(R.id.anime);

        loadAnimeList();

        anime.setLayoutManager(new LinearLayoutManager(this));
        AnimeAdapter adapter = new AnimeAdapter(animelist);
        anime.setAdapter(adapter);
    }

    private void loadAnimeList() {
        animelist.add("One Piece");
        animelist.add("Naruto Shippuden");
        animelist.add("Attack on Titan");
        animelist.add("Dragon Ball Z");
        animelist.add("Death Note");
        animelist.add("Jujutsu Kaisen");
        animelist.add("Demon Slayer");
        animelist.add("Fullmetal Alchemist: Brotherhood");
        animelist.add("Hunter x Hunter");
        animelist.add("Bleach");
        animelist.add("My Hero Academia");
        animelist.add("Chainsaw Man");
        animelist.add("Solo Leveling");
        animelist.add("Spy x Family");
        animelist.add("Tokyo Ghoul");
        animelist.add("One Punch Man");
        animelist.add("Cowboy Bebop");
        animelist.add("Neon Genesis Evangelion");
        animelist.add("Steins;Gate");
        animelist.add("Black Clover");
        animelist.add("Sword Art Online");
        animelist.add("Fairy Tail");
        animelist.add("Blue Lock");
        animelist.add("Haikyuu!!");
        animelist.add("Vinland Saga");
        animelist.add("Code Geass");
        animelist.add("Mob Psycho 100");
        animelist.add("JoJo's Bizarre Adventure");
        animelist.add("Your Lie in April");
        animelist.add("Dr. Stone");
    }
}
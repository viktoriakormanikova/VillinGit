package com.example.projectexodus.dark;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.projectexodus.R;
import com.example.projectexodus.light.maps_light;
import com.example.projectexodus.light.search_light;
import com.example.projectexodus.light.table_light;

public class search_dark extends AppCompatActivity {

    private Button table;
    private Button maps;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_dark);
        table = findViewById(R.id.table);
        table.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openTable();
            }
        });

        maps = findViewById(R.id.maps);
        maps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMaps();
            }
        });
    }
    public void openTable(){
        Intent intent = new Intent(this, table_dark.class);
        startActivity(intent);
    }
    public void openMaps(){
        Intent intent = new Intent(this, maps_dark.class);
        startActivity(intent);
    }

}

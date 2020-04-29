package com.example.projectexodus.light;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.projectexodus.R;
import com.example.projectexodus.dark.maps_dark;
import com.example.projectexodus.dark.table_dark;

public class search_light extends AppCompatActivity {

    private Button table;
    private Button maps;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_light);
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
        Intent intent = new Intent(this, table_light.class);
        startActivity(intent);
    }
    public void openMaps(){
        Intent intent = new Intent(this, maps_light.class);
        startActivity(intent);
    }

}

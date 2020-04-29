package com.example.projectexodus.light;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.projectexodus.R;

public class maps_light extends AppCompatActivity {

    private Button table;
    private Button search;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps_light);

        table = findViewById(R.id.table);
        table.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openTable();
            }
        });

        search = findViewById(R.id.search);
        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSearch();
            }
        });
    }
    public void openTable(){
        Intent intent = new Intent(this, table_light.class);
        startActivity(intent);
    }
    public void openSearch(){
        Intent intent = new Intent(this, search_light.class);
        startActivity(intent);
    }

}

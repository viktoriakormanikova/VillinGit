package com.example.projectexodus.light;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.projectexodus.R;
import com.example.projectexodus.dark.Home_dark;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class table_light extends AppCompatActivity {

    private Button search;
    private Button maps;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table_light);
        TextView textView = (TextView) findViewById(R.id.text);
        search = findViewById(R.id.search);
        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSearch();
            }
        });

        maps = findViewById(R.id.maps);
        maps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMaps();
            }
        });

        File file = new File("data.json");
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(file));
            for(int i = 0; i < 4933; i++){
                String data = reader.readLine();
                String [] nazov = data.split(": ");

                if (nazov[0].trim().equals("\"Názov\"")){
                    String data2 = reader.readLine();
                    String [] skupina = data2.split(": ");

                    if (skupina[1].trim().equals("\"Fontány a pramene\",") || skupina[1].trim().equals("\"Investície mesta\",")) {

                        //System.out.println("Nazov: " + nazov[1]);
                        textView.setText("Nazov: " + nazov[1]);
                        String [] adresa;
                        do {
                            String data3 = reader.readLine();
                            adresa = data3.split(": ");

                        }while(!adresa[0].trim().equals("\"Adresa\""));

                        //System.out.println("Adresa: " + adresa[1]);
                        textView.setText("Adresa: " + adresa[1]);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public void openSearch(){
        Intent intent = new Intent(this, search_light.class);
        startActivity(intent);
    }
    public void openMaps(){
        Intent intent = new Intent(this, maps_light.class);
        startActivity(intent);
    }
}

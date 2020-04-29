package com.example.projectexodus.dark;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.projectexodus.light.MainActivity;
import com.example.projectexodus.R;

public class Home_dark extends AppCompatActivity {

    private Button button;
    private Button buttonlight;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_dark);

        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openTable_dark();
            }
        });
        buttonlight = findViewById(R.id.buttonlight);
        buttonlight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               openHome_light();
            }
        });
    }

    public void openHome_light(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
    public void openTable_dark(){
        Intent intent = new Intent(this, table_dark.class);
        startActivity(intent);
    }
}

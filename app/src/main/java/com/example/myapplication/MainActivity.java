package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button) findViewById(R.id.button_show);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast toast = Toast.makeText(getApplicationContext(), "Jerzy Kisielewski", Toast.LENGTH_SHORT);
                toast.show();
            }
        });
    }
}

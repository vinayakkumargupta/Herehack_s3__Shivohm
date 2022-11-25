package com.here.search;

import static android.app.PendingIntent.getActivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class homepage extends AppCompatActivity {
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);



        Button btn2 = (Button)findViewById(R.id.button4);

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(homepage.this, accident_assistance.class));
            }
        });



        // with method findViewById()
        imageView = findViewById(R.id.imageView);

        // Apply OnClickListener  to imageView to
        // switch from one activity to another
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Intent class will help to go to next activity using
                // it's object named intent.
                // SecondActivty is the name of new created EmptyActivity.
                Intent intent = new Intent(homepage.this, emergency.class);
                startActivity(intent);
            }
        });

        imageView = findViewById(R.id.imageView2);

        // Apply OnClickListener  to imageView to
        // switch from one activity to another
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Intent class will help to go to next activity using
                // it's object named intent.
                // SecondActivty is the name of new created EmptyActivity.
                Intent intent = new Intent(homepage.this, MainActivity.class);
                startActivity(intent);
            }
        });

        imageView = findViewById(R.id.imageView3);

        // Apply OnClickListener  to imageView to
        // switch from one activity to another
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Intent class will help to go to next activity using
                // it's object named intent.
                // SecondActivty is the name of new created EmptyActivity.
                Intent intent = new Intent(homepage.this, medicalinfo.class);
                startActivity(intent);
            }
        });

    }

}
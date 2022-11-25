package com.here.search;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class emergency extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Button buttonCall;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emergency);
        buttonCall = findViewById(R.id.button5);

        buttonCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:100"));
                startActivity(intent);
            }
        });
        buttonCall = findViewById(R.id.button6);

        buttonCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:108"));
                startActivity(intent);
            }
        });
        Button btn3 = (Button)findViewById(R.id.button40);

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(emergency.this, accident_assistance.class));
            }
        });
        buttonCall = findViewById(R.id.button7);

        buttonCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:181"));
                startActivity(intent);
            }
        });
        buttonCall = findViewById(R.id.button8);

        buttonCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:101"));
                startActivity(intent);
            }
        });



    }


}

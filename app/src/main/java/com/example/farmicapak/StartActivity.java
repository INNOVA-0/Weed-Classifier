package com.example.farmicapak;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class StartActivity extends AppCompatActivity {

    Button login,register;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        login=findViewById(R.id.Login);
        register=findViewById(R.id.Register);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                startActivity(new Intent(StartActivity.this,LoginActivity.class));
            }
        });
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                startActivity(new Intent(StartActivity.this, RegisterActivity.class));
            }
        });

      // Toolbar Configuration
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        ImageView help = (ImageView) toolbar.findViewById(R.id.helpIcon);
        help.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //Intent to youtube where guide is available
            }
        });
    }
}
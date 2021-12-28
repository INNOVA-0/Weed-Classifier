package com.example.farmicapak;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class HomeActivity extends AppCompatActivity {

    Button BtnClickImage,BtnBrowserImage,BtnExit,BtnLogout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        BtnClickImage=findViewById(R.id.clickimage);
        BtnBrowserImage=findViewById(R.id.BrowserImage);
        BtnExit=findViewById(R.id.btnExit);
//        BtnLogout=findViewById(R.id.Logout);

        BtnClickImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                startActivity(new Intent(HomeActivity.this, ClickImageActivity.class));
                startActivityForResult( new Intent(HomeActivity.this, ClickImageActivity.class), 1 , ActivityOptions.makeCustomAnimation(HomeActivity.this,R.anim.slide_out, R.anim.slide_in_bottom).toBundle());

            }
        });
        BtnBrowserImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                startActivity(new Intent(HomeActivity.this,BrowserImageActivity.class));
                startActivityForResult( new Intent(HomeActivity.this, BrowserImageActivity.class), 1 , ActivityOptions.makeCustomAnimation(HomeActivity.this,R.anim.slide_out, R.anim.slide_in_bottom).toBundle());
            }
        });
        BtnExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                moveTaskToBack(true);
                android.os.Process.killProcess(android.os.Process.myPid());
                System.exit(1);
            }
        });
//        BtnLogout.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                startActivity(new Intent(HomeActivity.this, StartActivity.class));
//            }
//        });

        // Toolbar Configuration
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        ImageView help = (ImageView) toolbar.findViewById(R.id.helpIcon);
        help.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //Intent to youtube where guide is available
                startActivity(new Intent(HomeActivity.this,ContactUs.class));

            }
        });
    }
}
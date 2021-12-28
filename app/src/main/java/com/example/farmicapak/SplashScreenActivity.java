package com.example.farmicapak;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

import androidx.appcompat.app.AppCompatActivity;

import static java.lang.Thread.sleep;

public class SplashScreenActivity extends AppCompatActivity {
    private static   int SplashTimeOut=4000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash);

        Thread myThread =new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    sleep(3200);

                    Intent i=new Intent(SplashScreenActivity.this, HomeActivity.class);
//                    startActivity(new Intent(SplashScreenActivity.this, HomeActivity.class));
//                    overridePendingTransition(R.anim.slide_down, R.anim.slide_up);

                    startActivityForResult( i, 1 , ActivityOptions.makeCustomAnimation(SplashScreenActivity.this,R.anim.slide_out, R.anim.slide_in_bottom).toBundle());

//                    startActivity(i);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        myThread.start();
    }
}
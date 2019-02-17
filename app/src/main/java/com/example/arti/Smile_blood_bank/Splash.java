package com.example.arti.Smile_blood_bank;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.tanisha.Smile_blood_bank.R;

public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        new Thread()
        {
            @Override
            public void run() {
                super.run();
                try {
                    Thread.sleep(1500);
                    Intent intent=new Intent(Splash.this,RegisterActivity.class);
                    startActivity(intent);
                    Splash.super.finish();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }.start();
    }
}

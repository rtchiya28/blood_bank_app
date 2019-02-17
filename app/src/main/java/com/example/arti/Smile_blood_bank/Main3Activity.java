package com.example.arti.Smile_blood_bank;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.tanisha.Smile_blood_bank.R;
import com.synnapps.carouselview.CarouselView;
import com.synnapps.carouselview.ImageListener;

public class Main3Activity extends AppCompatActivity {
Button upload,donor,hospital;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        upload=findViewById(R.id.b11);
        donor=findViewById(R.id.b22);
        hospital=findViewById(R.id.b33);
        CarouselView imageslider;
        ImageListener imageListener;
        final int[] images={R.drawable.blood1,R.drawable.blood6,R.drawable.blood4};
        imageslider = (CarouselView) findViewById(R.id.carouselview);
        imageslider.setPageCount(images.length);
        imageListener=new ImageListener() {
            @Override
            public void setImageForPosition(int position, ImageView imageView) {
                imageView.setImageResource(images[position]);
            }
        };
        imageslider.setImageListener(imageListener);

        upload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1=new Intent(Intent.ACTION_VIEW, Uri.parse("https://artijangra28.wixsite.com/mysite-1"));
                startActivity(i1);
            }
        });
        donor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i2=new Intent(Intent.ACTION_VIEW, Uri.parse("https://artijangra28.wixsite.com/mysite-1/mypage"));
                startActivity(i2);
            }
        });
        //pref=this.getSharedPreferences(STR_PREF_NAME,MODE_PRIVATE);
        hospital.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i3=new Intent(Intent.ACTION_VIEW, Uri.parse("https://artijangra28.wixsite.com/mysite-1/organisation"));
                startActivity(i3);
            }
        });

    }
}

package com.example.rocket.fondonavapp;

import android.app.WallpaperManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.io.IOException;

import static com.example.rocket.fondonavapp.R.drawable.fon1;
import static com.example.rocket.fondonavapp.R.styleable.View;

public class MainActivity extends AppCompatActivity {
    private ImageView imagen1,imagen2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);
        imagen1 = (ImageView)findViewById(R.id.fon1);
        imagen1.setImageResource(R.drawable.fon1);
        imagen2 = (ImageView)findViewById(R.id.fon2);
        imagen2.setImageResource(R.drawable.fon2);
    }
    public void cambio(View v) {
        WallpaperManager myWallpaperManager = WallpaperManager.getInstance(getApplicationContext());
        try {
            myWallpaperManager.setResource(R.drawable.fon1);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void cambio2(View v) {
        WallpaperManager myWallpaperManager = WallpaperManager.getInstance(getApplicationContext());
        try {
            myWallpaperManager.setResource(R.drawable.fon2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void cambio3(View v) {
        WallpaperManager myWallpaperManager = WallpaperManager.getInstance(getApplicationContext());
        try {
            myWallpaperManager.setResource(R.drawable.fon3);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void cambio4(View v) {
        WallpaperManager myWallpaperManager = WallpaperManager.getInstance(getApplicationContext());
        try {
            myWallpaperManager.setResource(R.drawable.fon4);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void cambio5(View v) {
        WallpaperManager myWallpaperManager = WallpaperManager.getInstance(getApplicationContext());
        try {
            myWallpaperManager.setResource(R.drawable.fon5);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }public void cambio6(View v) {
        WallpaperManager myWallpaperManager = WallpaperManager.getInstance(getApplicationContext());
        try {
            myWallpaperManager.setResource(R.drawable.fon6);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

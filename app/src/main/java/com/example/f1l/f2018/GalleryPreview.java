package com.example.f1l.f2018;

/**
 * Created by F1L on 20.01.2018.
 */

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import java.io.File;

/**
 * Created by SHAJIB on 25/12/2015.
 */
@SuppressLint("Registered")
public class GalleryPreview extends AppCompatActivity {

    ImageView GalleryPreviewImg;
    String path;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.gallery_preview);
        Intent intent = getIntent();
        path = intent.getStringExtra("path");
        GalleryPreviewImg = (ImageView) findViewById(R.id.GalleryPreviewImg);
        Glide.with(GalleryPreview.this)
                .load(new File(path)) // Uri of the picture
                .into(GalleryPreviewImg);
    }
}

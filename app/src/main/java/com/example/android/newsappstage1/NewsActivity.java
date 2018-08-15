package com.example.android.newsappstage1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class NewsActivity extends AppCompatActivity {

    private static final String API_URL = "https://content.guardianapis.com/search?q=immigration&section=us-news&format=json&api-key=c59f3312-8bf6-4e29-87a2-c44cded6b01f";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news);
    }
}


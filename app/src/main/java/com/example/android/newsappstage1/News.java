package com.example.android.newsappstage1;

public class News {
    private String mNewsTitle;
    private String mSectionName;

    public News(String newsTitle, String sectionName) {
        mNewsTitle = newsTitle;
        mSectionName = sectionName;
    }

    public String getNewsTitle() {
        return mNewsTitle;
    }

    public String getSectionName() {
        return mSectionName;
    }

}

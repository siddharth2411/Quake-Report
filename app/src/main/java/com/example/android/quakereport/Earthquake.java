package com.example.android.quakereport;

public class Earthquake {

    private Double mMag;

    private String mLocation;

    private long mDate;

    private String mUrl;

    public Earthquake(Double mag, String location, long date, String url) {
        mMag = mag;
        mLocation = location;
        mDate = date;
        mUrl = url;
    }

    public Double getMag() {
        return mMag;
    }

    public String getLocation() {
        return mLocation;
    }

    public long getDate() {
        return mDate;
    }

    public String getUrl() {
        return mUrl;
    }
}

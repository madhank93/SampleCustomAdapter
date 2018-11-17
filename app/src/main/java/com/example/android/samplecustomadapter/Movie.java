package com.example.android.samplecustomadapter;

public class Movie {

    // Store the id of the  movie poster
    private int mMovieImage;

    // Store the name of the movie
    private String mName;

    // Store the release date of the movie
    private String mRelease;

    public Movie(int mImageDrawable, String mName, String mRelease) {
        this.mMovieImage = mImageDrawable;
        this.mName = mName;
        this.mRelease = mRelease;
    }


    public int getmMovieImage() {
        return mMovieImage;
    }

    public void setmMovieImage(int mMovieImage) {
        this.mMovieImage = mMovieImage;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public String getmRelease() {
        return mRelease;
    }

    public void setmRelease(String mRelease) {
        this.mRelease = mRelease;
    }

}

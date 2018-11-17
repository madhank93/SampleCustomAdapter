package com.example.android.samplecustomadapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MovieAdapter extends ArrayAdapter<Movie> {

    //https://medium.com/mindorks/custom-array-adapters-made-easy-b6c4930560dd

    private Context mContext;
    private List<Movie> moviesList = new ArrayList<>();

    public MovieAdapter(@NonNull Context context, @NonNull ArrayList<Movie> objects) {
        super(context,0, objects);
        this.mContext = context;
        this.moviesList = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItem = convertView;
        if(listItem == null)
            listItem = LayoutInflater.from(mContext).inflate(R.layout.list_item,parent,false);

        Movie currentMovie = moviesList.get(position);

        ImageView image = (ImageView)listItem.findViewById(R.id.imageView_poster);
        image.setImageResource(currentMovie.getmMovieImage());

        TextView name = (TextView) listItem.findViewById(R.id.textView_name);
        name.setText(currentMovie.getmName());

        TextView release = (TextView) listItem.findViewById(R.id.textView_release);
        release.setText(currentMovie.getmRelease());

        return listItem;
    }
}

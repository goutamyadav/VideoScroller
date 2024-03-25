package com.example.videoscroller;

import android.app.Activity;
import android.media.MediaPlayer;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.VideoView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class VideoAdaptor extends RecyclerView.Adapter<VideoAdaptor.ViewHolder> {
    private  ArrayList<DataHandler>dataHandlers;
    private Activity activity;

    public VideoAdaptor(ArrayList<DataHandler> dataHandlers,Activity activity) {

        this.dataHandlers = dataHandlers;
        this.activity=activity;

    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
     View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_main,parent,false);
        return new ViewHolder(view) ;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.title.setText(dataHandlers.get(position).title);
        holder.Videoview.setVideoURI(Uri.parse(dataHandlers.get(position).url));
     holder.Videoview.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
         @Override
         public void onPrepared(MediaPlayer mp) {
             holder.progress.setVisibility(View.GONE);
             mp.start();

             float vidRatio=mp.getVideoWidth()/(float)mp.getVideoHeight();
             float screenRatio=holder.Videoview.getWidth()/(float) holder.Videoview.getHeight();
             float scale=vidRatio/screenRatio;
             if(scale>=1f){
                 holder.Videoview.setScaleX(scale);
             }else {
                 holder.Videoview.setScaleY(1f/scale);
             }
         }
     });
     holder.Videoview.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
         @Override
         public void onCompletion(MediaPlayer mp) {
             mp.start();
         }
     });
    }

    @Override
    public int getItemCount() {
        return dataHandlers.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView title;
        ProgressBar progress;
        VideoView Videoview;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            Videoview =itemView.findViewById(R.id.VideoView);
            progress =itemView.findViewById(R.id.progress);
            title =itemView.findViewById(R.id.title);


        }
    }
}

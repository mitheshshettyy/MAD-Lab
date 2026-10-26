package com.example.p1again;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;

import androidx.annotation.Nullable;

public class MusicService  extends Service {
    public MusicService(){}

    MediaPlayer music;

    public void onCreate(){
        super.onCreate();
        music = MediaPlayer.create(this,R.raw.music);
    }

    public void onStart(Intent intent,int startid){
        super.onStart(intent,startid);
        music.start();
    }

    public void onDestroy(){
        super.onDestroy();
        music.stop();
    }

    @Override
    public IBinder onBind(Intent intent) {
        throw new UnsupportedOperationException("Not yet implemented");
    }
}

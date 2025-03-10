package com.example.pr7servis;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.util.Log;

public class MusicService extends Service {

    private static final String TAG = "MusicService";
    private MediaPlayer mediaPlayer;
    @Override
    public void onCreate() {
        super.onCreate();
        // Инициализация медиаплеера
        mediaPlayer = MediaPlayer.create(this, R.raw.metalpipe);
        mediaPlayer.setLooping(true); // Зацикливание
        mediaPlayer.setVolume(100, 100);
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int
            startId) {
        if (!mediaPlayer.isPlaying()) {

            mediaPlayer.start();
            Log.d(TAG, "Музыка начала играть");
        }
        return START_STICKY;
    }
    @Override
    public void onDestroy() {
        super.onDestroy();
        if (mediaPlayer.isPlaying()) {
            mediaPlayer.stop();
            mediaPlayer.release();
            Log.d(TAG, "Музыка остановлена и ресурсы освобождены");
        }
    }
    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
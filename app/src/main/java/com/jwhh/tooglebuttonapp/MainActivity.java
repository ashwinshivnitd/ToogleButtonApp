package com.jwhh.tooglebuttonapp;

import androidx.appcompat.app.AppCompatActivity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    private ToggleButton startAndPauseMusicToogleButton;
    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.mediaPlayer = MediaPlayer.create(this, R.raw.delicate);
        this.startAndPauseMusicToogleButton = findViewById(R.id.start_and_stop_music);

        String currentToogleAction = this.startAndPauseMusicToogleButton.getText().toString();
        System.out.println(currentToogleAction);

        this.startAndPauseMusicToogleButton.setOnClickListener(view -> {
            if (startAndPauseMusicToogleButton.isChecked()) {
                System.out.println("Music Starts");
                this.mediaPlayer.start();
                Toast.makeText(this, "Music Starts", Toast.LENGTH_SHORT).show();
                System.out.println(startAndPauseMusicToogleButton.getText().toString());
            } else {
                System.out.println("Music Paused");
                this.mediaPlayer.pause();
                Toast.makeText(this, "Music Paused", Toast.LENGTH_SHORT).show();
                System.out.println(startAndPauseMusicToogleButton.getText().toString());
            }
        });


    }

}
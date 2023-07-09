package com.example.itsmusical;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    MediaPlayer soundplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void playbutton(View view) {
        Button btn = (Button) view;
        int tagvalue = Integer.parseInt(btn.getTag().toString());
        playmusic(tagvalue);
    }

    public void playmusic(int tagvalue) {
        if (tagvalue == 0) {
            soundplay = MediaPlayer.create(this, R.raw.first);
            soundplay.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                @Override
                public void onPrepared(MediaPlayer mp) {
                    soundplay.start();
                }
            });

            soundplay.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mp) {
                    releaseAndStop();
                }
            });
        } else if (tagvalue == 1) {
            soundplay = MediaPlayer.create(this, R.raw.second);
            soundplay.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                @Override
                public void onPrepared(MediaPlayer mp) {
                    soundplay.start();
                }
            });

            soundplay.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mp) {
                    releaseAndStop();
                }
            });

        } else if (tagvalue == 2) {
            soundplay = MediaPlayer.create(this, R.raw.third);

            soundplay.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                @Override
                public void onPrepared(MediaPlayer mp) {
                    soundplay.start();
                }
            });

            soundplay.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mp) {
                    releaseAndStop();
                }
            });

        } else if (tagvalue == 3) {
            soundplay = MediaPlayer.create(this, R.raw.fourth);

            soundplay.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                @Override
                public void onPrepared(MediaPlayer mp) {
                    soundplay.start();
                }
            });

            soundplay.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mp) {
                    releaseAndStop();
                }
            });

        } else if (tagvalue == 4) {
            soundplay = MediaPlayer.create(this, R.raw.fifth);

            soundplay.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                @Override
                public void onPrepared(MediaPlayer mp) {
                    soundplay.start();
                }
            });

            soundplay.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mp) {
                    releaseAndStop();
                }
            });

        } else if (tagvalue == 5) {
            soundplay = MediaPlayer.create(this, R.raw.sixth);
            soundplay.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                @Override
                public void onPrepared(MediaPlayer mp) {
                    soundplay.start();
                }
            });

            soundplay.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mp) {
                    releaseAndStop();
                }
            });

        } else if (tagvalue == 6) {
            soundplay = MediaPlayer.create(this, R.raw.seventh);

            soundplay.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                @Override
                public void onPrepared(MediaPlayer mp) {
                    soundplay.start();
                }
            });

            soundplay.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mp) {
                    releaseAndStop();
                }
            });

        } else if (tagvalue == 7) {
            soundplay = MediaPlayer.create(this, R.raw.eighth);

            soundplay.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                @Override
                public void onPrepared(MediaPlayer mp) {
                    soundplay.start();
                }
            });

            soundplay.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mp) {
                    releaseAndStop();
                }
            });
            ;
        } else if (tagvalue == 8) {
            soundplay = MediaPlayer.create(this, R.raw.nineth);
            soundplay.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                @Override
                public void onPrepared(MediaPlayer mp) {
                    soundplay.start();
                }
            });

            soundplay.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mp) {
                    releaseAndStop();
                }
            });

        }
    }

    @Override
    protected void onStop() {

        releaseAndStop();

        super.onStop();
    }


    public void releaseAndStop() {

        if (soundplay != null) {

            soundplay.stop();
            soundplay.release();


        }
    }
}

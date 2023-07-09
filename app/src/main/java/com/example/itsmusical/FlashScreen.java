package com.example.itsmusical;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.TextView;

public class FlashScreen extends AppCompatActivity {
       TextView appname;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flash_screen);
        ActionBar actionBar=getSupportActionBar();
        actionBar.hide();

        new Handler().postDelayed(new Runnable()
                                  {
                                      @Override
                                      public void run() {
                                          Intent nextScreen=new Intent(FlashScreen.this,MainActivity.class);
                                          startActivity(nextScreen);
                                          finish();
                                      }
                                  },3000);
        appname=findViewById(R.id.appname);
        appname.animate().scaleXBy(0.2f).setDuration(2000);

    }
}

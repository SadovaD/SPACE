 package com.example.myapplication2;

 import android.content.Intent;
 import android.media.MediaPlayer;
 import android.os.Bundle;
 import android.view.SurfaceView;
 import android.view.View;
 import android.view.WindowManager;
 import android.view.animation.Animation;
 import android.view.animation.AnimationUtils;
 import android.widget.Button;
 import android.widget.TextView;

 import androidx.appcompat.app.AppCompatActivity;

 public class MainActivity extends AppCompatActivity {
     MediaPlayer mySong;
     TextView logo;
     Button button1, button2;
     SurfaceView surface;
     Engine engine;
     private Animation logoAnim;

     @Override
     protected void onCreate(Bundle savedInstanceState) {
         super.onCreate(savedInstanceState);
         setContentView(R.layout.activity_main);
         mySong = MediaPlayer.create(MainActivity.this,R.raw.yesterday);
         mySong.start();
         getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
         getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);

         surface = findViewById(R.id.surface);
         engine = new Engine(surface);

         button1 = findViewById(R.id.button1);
         button2 = findViewById(R.id.button2);
         button1.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 try {
                     Intent intent = new Intent(MainActivity.this, Beginning.class);
                     startActivity(intent);
                 } catch (Exception e) {
                     e.printStackTrace();
                 }

             }
         });
         button2.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 try {
                     Intent intent = new Intent(MainActivity.this, Registration.class);
                     startActivity(intent);
                 } catch (Exception e) {
                     e.printStackTrace();
                 }

             }
         });
       init();
     }
     private void init(){
         logoAnim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.logo_anim);
         logo = findViewById(R.id.logo);
         logo.startAnimation(logoAnim);
     }

     @Override
     protected void onDestroy() {
         engine.stop();
         super.onDestroy();
     }
     protected void onPause(){
         super.onPause();
         mySong.release();
     }

 }
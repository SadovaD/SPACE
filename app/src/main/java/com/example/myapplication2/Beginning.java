 package com.example.myapplication2;

 import android.app.Activity;
 import android.os.AsyncTask;
 import android.content.Intent;
 import android.media.MediaPlayer;
 import android.os.Bundle;
 import android.view.View;
 import android.view.animation.Animation;
 import android.view.animation.AnimationUtils;
 import android.widget.Button;
 import android.widget.TextView;

 public class Beginning extends Activity {
     public int l = 0;


     Background text1 = new Background();
     TextView[] t = new TextView[47];
     Button button;
     MediaPlayer mySong;
     Delay delay = new Delay();


     @Override
     protected void onCreate(Bundle savedInstanceState) {
         super.onCreate(savedInstanceState);
         mySong = MediaPlayer.create(Beginning.this, R.raw.watr);
         mySong.start();
         setContentView(R.layout.beginning);
         for (int i = 0; i < t.length; i++) {
             int g = 0;
             String textvID = "textView" + (i + 1);
             int resID = getResources().getIdentifier(textvID, "id", getPackageName());
             t[i] = findViewById(resID);
             t[i].setText(text1.text_s[i][g]);
             t[i].setVisibility(View.INVISIBLE);
         }
         button = findViewById(R.id.button);

         button.setVisibility(View.INVISIBLE);


         delay.execute();
     }

     @Override
     public void onBackPressed() {
         delay.cancel(true);
         delay = null;
         try {
             Intent intent = new Intent(this, MainActivity.class);
             startActivity(intent);
         } catch (Exception e) {
             e.printStackTrace();
         }
         finish();
     }

     class Delay extends AsyncTask<Void, Integer, Void> {
         @Override
         protected Void doInBackground(Void... params) {
             while (l <= 48) {
                 publishProgress(l++);
                 try {
                     Thread.sleep(1000);
                     if (isCancelled()) return null;
                 } catch (Exception e) {
                 }
             }
             return null;
         }

         @Override
         protected void onProgressUpdate(Integer... values) {

             Animation textAnim = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.alpha);
             t = new TextView[47];
             for (int h = 0; h < t.length; h++) {
                 {
                     String textvID = "textView" + (h + 1);
                     int resID_2 = getResources().getIdentifier(textvID, "id", getPackageName());
                     t[h] = (findViewById(resID_2));
                 }
             }
             switch (l) {
                 case 1:
                     t[0].setVisibility(View.VISIBLE);
                     t[0].startAnimation(textAnim);
                     break;
                 case 2:
                     t[1].setVisibility(View.VISIBLE);
                     t[1].startAnimation(textAnim);
                     break;
                 case 3:
                     t[2].setVisibility(View.VISIBLE);
                     t[2].startAnimation(textAnim);
                     break;
                 case 4:
                     t[3].setVisibility(View.VISIBLE);
                     t[3].startAnimation(textAnim);
                     break;
                 case 5:
                     t[4].setVisibility(View.VISIBLE);
                     t[4].startAnimation(textAnim);
                     break;
                 case 6:
                     t[5].setVisibility(View.VISIBLE);
                     t[5].startAnimation(textAnim);
                     break;
                 case 7:
                     t[6].setVisibility(View.VISIBLE);
                     t[6].startAnimation(textAnim);
                     break;
                 case 8:
                     t[7].setVisibility(View.VISIBLE);
                     t[7].startAnimation(textAnim);
                     break;
                 case 9:
                     t[8].setVisibility(View.VISIBLE);
                     t[8].startAnimation(textAnim);
                     break;
                 case 10:
                     t[9].setVisibility(View.VISIBLE);
                     t[9].startAnimation(textAnim);
                     break;
                 case 11:
                     t[10].setVisibility(View.VISIBLE);
                     t[10].startAnimation(textAnim);
                     break;
                 case 12:
                     t[11].setVisibility(View.VISIBLE);
                     t[11].startAnimation(textAnim);
                     break;
                 case 13:
                     t[12].setVisibility(View.VISIBLE);
                     t[12].startAnimation(textAnim);
                     break;
                 case 14:
                     t[13].setVisibility(View.VISIBLE);
                     t[13].startAnimation(textAnim);
                     break;
                 case 15:
                     t[14].setVisibility(View.VISIBLE);
                     t[14].startAnimation(textAnim);
                     break;
                 case 16:
                     t[15].setVisibility(View.VISIBLE);
                     t[15].startAnimation(textAnim);
                     break;
                 case 17:
                     t[16].setVisibility(View.VISIBLE);
                     t[16].startAnimation(textAnim);
                     break;
                 case 18:
                     t[17].setVisibility(View.VISIBLE);
                     t[17].startAnimation(textAnim);
                     break;
                 case 19:
                     t[18].setVisibility(View.VISIBLE);
                     t[18].startAnimation(textAnim);
                     break;
                 case 20:
                     t[19].setVisibility(View.VISIBLE);
                     t[19].startAnimation(textAnim);
                     break;
                 case 21:
                     t[20].setVisibility(View.VISIBLE);
                     t[20].startAnimation(textAnim);
                     break;
                 case 22:
                     t[21].setVisibility(View.VISIBLE);
                     t[21].startAnimation(textAnim);
                     break;
                 case 23:
                     t[22].setVisibility(View.VISIBLE);
                     t[22].startAnimation(textAnim);
                     break;
                 case 24:
                     t[23].setVisibility(View.VISIBLE);
                     t[23].startAnimation(textAnim);
                     break;
                 case 25:
                     t[24].setVisibility(View.VISIBLE);
                     t[24].startAnimation(textAnim);
                     break;
                 case 26:
                     t[25].setVisibility(View.VISIBLE);
                     t[25].startAnimation(textAnim);
                     break;
                 case 27:
                     t[26].setVisibility(View.VISIBLE);
                     t[26].startAnimation(textAnim);
                     break;
                 case 28:
                     t[27].setVisibility(View.VISIBLE);
                     t[27].startAnimation(textAnim);
                     break;
                 case 29:
                     t[28].setVisibility(View.VISIBLE);
                     t[28].startAnimation(textAnim);
                     break;
                 case 30:
                     t[29].setVisibility(View.VISIBLE);
                     t[29].startAnimation(textAnim);
                     break;
                 case 31:
                     t[30].setVisibility(View.VISIBLE);
                     t[30].startAnimation(textAnim);
                     break;
                 case 32:
                     t[31].setVisibility(View.VISIBLE);
                     t[31].startAnimation(textAnim);
                     break;
                 case 33:
                     t[32].setVisibility(View.VISIBLE);
                     t[32].startAnimation(textAnim);
                     break;
                 case 34:
                     t[33].setVisibility(View.VISIBLE);
                     t[33].startAnimation(textAnim);
                     break;
                 case 35:
                     t[34].setVisibility(View.VISIBLE);
                     t[34].startAnimation(textAnim);
                     break;
                 case 36:
                     t[35].setVisibility(View.VISIBLE);
                     t[35].startAnimation(textAnim);
                     break;
                 case 37:
                     t[36].setVisibility(View.VISIBLE);
                     t[36].startAnimation(textAnim);
                     break;
                 case 38:
                     t[37].setVisibility(View.VISIBLE);
                     t[37].startAnimation(textAnim);
                     break;
                 case 39:
                     t[38].setVisibility(View.VISIBLE);
                     t[38].startAnimation(textAnim);
                     break;
                 case 40:
                     t[39].setVisibility(View.VISIBLE);
                     t[39].startAnimation(textAnim);
                     break;
                 case 41:
                     t[40].setVisibility(View.VISIBLE);
                     t[40].startAnimation(textAnim);
                     break;
                 case 42:
                     t[41].setVisibility(View.VISIBLE);
                     t[41].startAnimation(textAnim);
                     break;
                 case 43:
                     t[42].setVisibility(View.VISIBLE);
                     t[42].startAnimation(textAnim);
                     break;
                 case 44:
                     t[43].setVisibility(View.VISIBLE);
                     t[43].startAnimation(textAnim);
                     break;
                 case 45:
                     t[44].setVisibility(View.VISIBLE);
                     t[44].startAnimation(textAnim);
                     break;
                 case 46:
                     t[45].setVisibility(View.VISIBLE);
                     t[45].startAnimation(textAnim);
                     break;
                 case 47:
                     t[46].setVisibility(View.VISIBLE);
                     t[46].startAnimation(textAnim);
                     break;
                 case 48:
                     button.setVisibility(View.VISIBLE);
                     button.startAnimation(textAnim);
                     button.setOnClickListener(new View.OnClickListener() {
                         @Override
                         public void onClick(View view) {
                             try {
                                 Intent intent = new Intent(Beginning.this, Story.class);
                                 startActivity(intent);
                             } catch (Exception e) {
                                 e.printStackTrace();
                             }

                         }
                     });

                 default:
                     break;
             }
         }
     }

     protected void onPause(){
         super.onPause();
         mySong.release();
     }

 }


 package com.example.myapplication2;

 import static android.view.animation.AnimationUtils.loadAnimation;

 import android.app.Activity;
 import android.os.AsyncTask;
 import android.media.MediaPlayer;
 import android.os.Bundle;
 import android.view.View;
 import android.view.animation.Animation;
 import android.widget.Button;
 import android.widget.ImageView;
 import android.widget.TextView;


 public class Story extends Activity {
     public volatile int l = 0;
     public int c = 0;
     public int g = 0;
     public int s = 0;
     public int f = 0;
     public int y = 0;
     public int j = 0;
     public int u = 0;
     public int k = 0;
     public int i = 0;

     Basic_Text text1 = new Basic_Text();
     Button[] b = new Button[17];
     TextView[] t =  new TextView[281];
     ImageView[] d = new ImageView[16];
     MediaPlayer mySong;
     Delay delay = new Delay();

     @Override
     protected void onCreate(Bundle savedInstanceState) {
         super.onCreate(savedInstanceState);
         setContentView(R.layout.story);
         mySong = MediaPlayer.create(Story.this,R.raw.watr);
         mySong.start();


         for(int i=0; i<b.length; i++) {
             String buttonID = "button" + (i+1);
             int resID = getResources().getIdentifier(buttonID, "id", getPackageName());
             b[i] = findViewById(resID);
             b[i].setVisibility(View.INVISIBLE);
         }
         for(int i=0; i<d.length; i++) {
             String buttonID = "imageView" + (i+1);
             int resID = getResources().getIdentifier(buttonID, "id", getPackageName());
             d[i] = findViewById(resID);
             d[i].setVisibility(View.INVISIBLE);
         }
         for(int i=0; i<t.length; i++) {
             int g = 0;
             String textvID = "textView" + (i+1);
             int resID = getResources().getIdentifier(textvID, "id", getPackageName());
             t[i] = findViewById(resID);
             t[i].setText(text1.scenario[i][g]);
             t[i].setVisibility(View.INVISIBLE);
         }

         delay.execute();
     }


     class Delay extends AsyncTask<Void, Integer, Void> {
         @Override
         protected Void doInBackground(Void... params) {
             while (l <= 325) {
                 {
                     if (c == 0 & l == 5) {
                         l = 5;
                     } else {
                         if (g == 0 & l == 9) {
                             l = 9;
                         } else {
                             if (s == 0 & l == 28) {
                                 l = 28;
                             } else {
                                 if (f == 0 & l == 193) {
                                     l = 193;
                                 } else {
                                     if (y == 0 & l == 198) {
                                         l = 198;
                                     } else {
                                         if (j == 0 & l == 229) {
                                             l = 229;
                                         } else {
                                             if (u == 0 & l == 233) {
                                                 l = 233;
                                             } else {
                                                 if (k == 0 & l == 238) {
                                                     l = 238;
                                                 } else {
                                                 }
                                                 publishProgress(l++);
                                                 try {
                                                     Thread.sleep(3000);
                                                     if (isCancelled()) return null;
                                                 } catch (Exception e) {
                                                 }
                                             }
                                         }
                                     }
                                 }
                             }
                         }
                     }
                 }
             }
             return null;
         }
         @Override
         protected void onProgressUpdate(Integer... values) {

             Animation a = loadAnimation(getApplicationContext(), R.anim.alpha);


                          for (int i = 0; i < d.length; i++) {
                         {
                             String buttonID = "imageView" + (i + 1);
                             int resID = getResources().getIdentifier(buttonID, "id", getPackageName());
                             d[i] = (findViewById(resID));
                            }
                         }
                         for (int i = 0; i < b.length; i++) {
                             {
                                 String buttonID = "button" + (i + 1);
                                 int resID = getResources().getIdentifier(buttonID, "id", getPackageName());
                                 b[i] = (findViewById(resID));
                             }
                         }
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
                                 t[0].startAnimation(a);
                                 break;
                             case 2:
                                 t[1].setVisibility(View.VISIBLE);
                                 t[1].startAnimation(a);
                                 break;
                             case 3:
                                 t[2].setVisibility(View.VISIBLE);
                                 t[2].startAnimation(a);
                                 break;
                             case 4:
                                 d[0].setVisibility(View.VISIBLE);
                                 d[0].startAnimation(a);
                                 break;
                             case 5:
                                 b[0].setVisibility(View.VISIBLE);
                                 b[0].startAnimation(a);
                                 b[0].setOnClickListener(new View.OnClickListener() {
                                     @Override
                                     public void onClick(View v) {
                                         try {
                                             if (c == 0) {
                                                 c = 1;
                                                 t[3].setVisibility(View.VISIBLE);
                                                 t[3].startAnimation(a);
                                                 t[4].setVisibility(View.GONE);

                                             }
                                         } catch (Exception e) {
                                         }
                                     }
                                 });
                                 b[1].setVisibility(View.VISIBLE);
                                 b[1].startAnimation(a);
                                 b[1].setOnClickListener(new View.OnClickListener() {
                                     @Override
                                     public void onClick(View v) {
                                         try {
                                             if (c == 0) {
                                                 c = 1;
                                                 t[4].setVisibility(View.VISIBLE);
                                                 t[4].startAnimation(a);
                                                 t[3].setVisibility(View.GONE);

                                             }
                                         } catch (Exception e) {
                                         }
                                     }
                                 });
                                 break;
                             case 6:
                                 t[5].setVisibility(View.VISIBLE);
                                 t[5].startAnimation(a);
                                 break;
                             case 7:
                                 t[6].setVisibility(View.VISIBLE);
                                 t[6].startAnimation(a);
                                 break;
                             case 8:
                                 d[1].setVisibility(View.VISIBLE);
                                 d[1].startAnimation(a);
                                 break;
                             case 9:
                                 b[2].setVisibility(View.VISIBLE);
                                 b[2].startAnimation(a);
                                 b[3].setVisibility(View.VISIBLE);
                                 b[3].startAnimation(a);
                                 b[2].setOnClickListener(new View.OnClickListener() {
                                     @Override
                                     public void onClick(View v) {
                                         try {
                                             if (g == 0) {
                                                 g = 1;
                                             t[7].setVisibility(View.VISIBLE);
                                             t[7].startAnimation(a);}
                                         } catch (Exception e) {
                                         }
                                     }
                                 });
                                 b[3].setOnClickListener(new View.OnClickListener() {
                                     @Override
                                     public void onClick(View v) {
                                         try {
                                             if (g == 0) {
                                                 g = 1;
                                             t[7].setVisibility(View.GONE);}
                                         } catch (Exception e) {
                                         }
                                     }
                                 });
                                 break;
                             case 10:
                                 t[8].setVisibility(View.VISIBLE);
                                 t[8].startAnimation(a);
                                 break;
                             case 11:
                                 t[9].setVisibility(View.VISIBLE);
                                 t[9].startAnimation(a);
                                 break;
                             case 12:
                                 t[10].setVisibility(View.VISIBLE);
                                 t[10].startAnimation(a);
                                 break;
                             case 13:
                                 t[11].setVisibility(View.VISIBLE);
                                 t[11].startAnimation(a);
                                 break;
                             case 14:
                                 t[12].setVisibility(View.VISIBLE);
                                 t[12].startAnimation(a);
                                 break;
                             case 15:
                                 t[13].setVisibility(View.VISIBLE);
                                 t[13].startAnimation(a);
                                 break;
                             case 16:
                                 t[14].setVisibility(View.VISIBLE);
                                 t[14].startAnimation(a);
                                 break;
                             case 17:
                                 d[2].setVisibility(View.VISIBLE);
                                 d[2].startAnimation(a);
                                 break;
                             case 18:
                                 t[15].setVisibility(View.VISIBLE);
                                 t[15].startAnimation(a);
                                 break;
                             case 19:
                                 t[16].setVisibility(View.VISIBLE);
                                 t[16].startAnimation(a);
                                 break;
                             case 20:
                                 t[17].setVisibility(View.VISIBLE);
                                 t[17].startAnimation(a);
                                 break;
                             case 21:
                                 t[18].setVisibility(View.VISIBLE);
                                 t[18].startAnimation(a);
                                 break;
                             case 22:
                                 t[19].setVisibility(View.VISIBLE);
                                 t[19].startAnimation(a);
                                 break;
                             case 23:
                                 t[20].setVisibility(View.VISIBLE);
                                 t[20].startAnimation(a);
                                 break;
                             case 24:
                                 t[21].setVisibility(View.VISIBLE);
                                 t[21].startAnimation(a);
                                 break;
                             case 25:
                                 t[22].setVisibility(View.VISIBLE);
                                 t[22].startAnimation(a);
                                 break;
                             case 26:
                                 t[23].setVisibility(View.VISIBLE);
                                 t[23].startAnimation(a);
                                 break;
                             case 27:
                                 d[3].setVisibility(View.VISIBLE);
                                 d[3].startAnimation(a);
                                 break;
                             case 28:
                                 b[4].setVisibility(View.VISIBLE);
                                 b[4].startAnimation(a);
                                 b[5].setVisibility(View.VISIBLE);
                                 b[5].startAnimation(a);
                                 b[4].setOnClickListener(new View.OnClickListener() {
                                     @Override
                                     public void onClick(View v) {
                                         try {
                                             if (s == 0) {
                                                 s = 1;
                                             t[24].setVisibility(View.VISIBLE);
                                             t[24].startAnimation(a);
                                             t[25].setVisibility(View.GONE);}
                                         } catch (Exception e) {
                                         }
                                     }
                                 });
                                 b[5].setOnClickListener(new View.OnClickListener() {
                                     @Override
                                     public void onClick(View v) {
                                         try {
                                             if (s == 0) {
                                                 s = 1;
                                                 t[25].setVisibility(View.VISIBLE);
                                                 t[25].startAnimation(a);
                                                 t[24].setVisibility(View.GONE);
                                             }
                                         } catch (Exception e) {
                                         }
                                     }
                                 });
                                 break;
                             case 29:
                                 t[26].setVisibility(View.VISIBLE);
                                 t[26].startAnimation(a);
                                 break;
                             case 30:
                                 t[27].setVisibility(View.VISIBLE);
                                 t[27].startAnimation(a);
                                 break;
                             case 31:
                                 t[28].setVisibility(View.VISIBLE);
                                 t[28].startAnimation(a);
                                 break;
                             case 32:
                                 t[29].setVisibility(View.VISIBLE);
                                 t[29].startAnimation(a);
                                 break;
                             case 33:
                                 t[30].setVisibility(View.VISIBLE);
                                 t[30].startAnimation(a);
                                 break;
                             case 34:
                                 t[31].setVisibility(View.VISIBLE);
                                 t[31].startAnimation(a);
                                 break;
                             case 35:
                                 t[32].setVisibility(View.VISIBLE);
                                 t[32].startAnimation(a);
                                 break;
                             case 36:
                                 d[4].setVisibility(View.VISIBLE);
                                 d[4].startAnimation(a);
                                 break;
                             case 37:
                                 t[33].setVisibility(View.VISIBLE);
                                 t[33].startAnimation(a);
                                 break;
                             case 38:
                                 t[34].setVisibility(View.VISIBLE);
                                 t[34].startAnimation(a);
                                 break;
                             case 39:
                                 t[35].setVisibility(View.VISIBLE);
                                 t[35].startAnimation(a);
                                 break;
                             case 40:
                                 t[36].setVisibility(View.VISIBLE);
                                 t[36].startAnimation(a);
                                 break;
                             case 41:
                                 t[37].setVisibility(View.VISIBLE);
                                 t[37].startAnimation(a);
                                 break;
                             case 42:
                                 t[38].setVisibility(View.VISIBLE);
                                 t[38].startAnimation(a);
                                 break;
                             case 43:
                                 t[39].setVisibility(View.VISIBLE);
                                 t[39].startAnimation(a);
                                 break;
                             case 44:
                                 d[5].setVisibility(View.VISIBLE);
                                 d[5].startAnimation(a);
                                 break;
                             case 45:
                                 t[40].setVisibility(View.VISIBLE);
                                 t[40].startAnimation(a);
                                 break;
                             case 46:
                                 t[41].setVisibility(View.VISIBLE);
                                 t[41].startAnimation(a);
                                 break;
                             case 47:
                                 t[42].setVisibility(View.VISIBLE);
                                 t[42].startAnimation(a);
                                 break;
                             case 48:
                                 t[43].setVisibility(View.VISIBLE);
                                 t[43].startAnimation(a);
                                 break;
                             case 49:
                                 t[44].setVisibility(View.VISIBLE);
                                 t[44].startAnimation(a);
                                 break;
                             case 50:
                                 t[45].setVisibility(View.VISIBLE);
                                 t[45].startAnimation(a);
                                 break;
                             case 51:
                                 t[46].setVisibility(View.VISIBLE);
                                 t[46].startAnimation(a);
                                 break;
                             case 52:
                                 t[47].setVisibility(View.VISIBLE);
                                 t[47].startAnimation(a);
                                 break;
                             case 53:
                                 t[48].setVisibility(View.VISIBLE);
                                 t[48].startAnimation(a);
                                 break;
                             case 54:
                                 t[49].setVisibility(View.VISIBLE);
                                 t[49].startAnimation(a);
                                 break;
                             case 55:
                                 t[50].setVisibility(View.VISIBLE);
                                 t[50].startAnimation(a);
                                 break;
                             case 56:
                                 t[51].setVisibility(View.VISIBLE);
                                 t[51].startAnimation(a);
                                 break;
                             case 57:
                                 t[52].setVisibility(View.VISIBLE);
                                 t[52].startAnimation(a);
                                 break;
                             case 58:
                                 t[53].setVisibility(View.VISIBLE);
                                 t[53].startAnimation(a);
                                 break;
                             case 59:
                                 t[54].setVisibility(View.VISIBLE);
                                 t[54].startAnimation(a);
                                 break;
                             case 60:
                                 t[55].setVisibility(View.VISIBLE);
                                 t[55].startAnimation(a);
                                 break;
                             case 61:
                                 t[56].setVisibility(View.VISIBLE);
                                 t[56].startAnimation(a);
                                 break;
                             case 62:
                                 t[57].setVisibility(View.VISIBLE);
                                 t[57].startAnimation(a);
                                 break;
                             case 63:
                                 t[58].setVisibility(View.VISIBLE);
                                 t[58].startAnimation(a);
                                 break;
                             case 64:
                                 t[59].setVisibility(View.VISIBLE);
                                 t[59].startAnimation(a);
                                 break;
                             case 65:
                                 t[60].setVisibility(View.VISIBLE);
                                 t[60].startAnimation(a);
                                 break;
                             case 66:
                                 d[6].setVisibility(View.VISIBLE);
                                 d[6].startAnimation(a);
                                 break;
                             case 67:
                                 t[61].setVisibility(View.VISIBLE);
                                 t[61].startAnimation(a);
                                 break;
                             case 68:
                                 t[62].setVisibility(View.VISIBLE);
                                 t[62].startAnimation(a);
                                 break;
                             case 69:
                                 t[63].setVisibility(View.VISIBLE);
                                 t[63].startAnimation(a);
                                 break;
                             case 70:
                                 t[64].setVisibility(View.VISIBLE);
                                 t[64].startAnimation(a);
                                 break;
                             case 71:
                                 t[65].setVisibility(View.VISIBLE);
                                 t[65].startAnimation(a);
                                 break;
                             case 72:
                                 t[66].setVisibility(View.VISIBLE);
                                 t[66].startAnimation(a);
                                 break;
                             case 73:
                                 t[67].setVisibility(View.VISIBLE);
                                 t[67].startAnimation(a);
                                 break;
                             case 74:
                                 t[68].setVisibility(View.VISIBLE);
                                 t[68].startAnimation(a);
                                 break;
                             case 75:
                                 t[69].setVisibility(View.VISIBLE);
                                 t[69].startAnimation(a);
                                 break;
                             case 76:
                                 t[70].setVisibility(View.VISIBLE);
                                 t[70].startAnimation(a);
                                 break;
                             case 77:
                                 t[71].setVisibility(View.VISIBLE);
                                 t[71].startAnimation(a);
                                 break;
                             case 78:
                                 t[72].setVisibility(View.VISIBLE);
                                 t[72].startAnimation(a);
                                 break;
                             case 79:
                                 t[73].setVisibility(View.VISIBLE);
                                 t[73].startAnimation(a);
                                 break;
                             case 80:
                                 t[74].setVisibility(View.VISIBLE);
                                 t[74].startAnimation(a);
                                 break;
                             case 81:
                                 t[75].setVisibility(View.VISIBLE);
                                 t[75].startAnimation(a);
                                 break;
                             case 82:
                                 t[76].setVisibility(View.VISIBLE);
                                 t[76].startAnimation(a);
                                 break;
                             case 83:
                                 t[77].setVisibility(View.VISIBLE);
                                 t[77].startAnimation(a);
                                 break;
                             case 84:
                                 t[78].setVisibility(View.VISIBLE);
                                 t[78].startAnimation(a);
                                 break;
                             case 85:
                                 d[7].setVisibility(View.VISIBLE);
                                 d[7].startAnimation(a);
                                 break;
                             case 86:
                                 t[79].setVisibility(View.VISIBLE);
                                 t[79].startAnimation(a);
                                 break;
                             case 87:
                                 t[80].setVisibility(View.VISIBLE);
                                 t[80].startAnimation(a);
                                 break;
                             case 88:
                                 t[81].setVisibility(View.VISIBLE);
                                 t[81].startAnimation(a);
                                 break;
                             case 89:
                                 t[82].setVisibility(View.VISIBLE);
                                 t[82].startAnimation(a);
                                 break;
                             case 90:
                                 t[83].setVisibility(View.VISIBLE);
                                 t[83].startAnimation(a);
                                 break;
                             case 91:
                                 t[84].setVisibility(View.VISIBLE);
                                 t[84].startAnimation(a);
                                 break;
                             case 92:
                                 t[85].setVisibility(View.VISIBLE);
                                 t[85].startAnimation(a);
                                 break;
                             case 93:
                                 t[86].setVisibility(View.VISIBLE);
                                 t[86].startAnimation(a);
                                 break;
                             case 94:
                                 t[87].setVisibility(View.VISIBLE);
                                 t[87].startAnimation(a);
                                 break;
                             case 95:
                                 t[88].setVisibility(View.VISIBLE);
                                 t[88].startAnimation(a);
                                 break;
                             case 96:
                                 t[89].setVisibility(View.VISIBLE);
                                 t[89].startAnimation(a);
                                 break;
                             case 97:
                                 t[90].setVisibility(View.VISIBLE);
                                 t[90].startAnimation(a);
                                 break;
                             case 98:
                                 t[91].setVisibility(View.VISIBLE);
                                 t[91].startAnimation(a);
                                 break;
                             case 99:
                                 t[92].setVisibility(View.VISIBLE);
                                 t[92].startAnimation(a);
                                 break;
                             case 100:
                                 t[93].setVisibility(View.VISIBLE);
                                 t[93].startAnimation(a);
                                 break;
                             case 101:
                                 t[94].setVisibility(View.VISIBLE);
                                 t[94].startAnimation(a);
                                 break;
                             case 102:
                                 t[95].setVisibility(View.VISIBLE);
                                 t[95].startAnimation(a);
                                 break;
                             case 103:
                                 d[8].setVisibility(View.VISIBLE);
                                 d[8].startAnimation(a);
                                 break;
                             case 104:
                                 t[96].setVisibility(View.VISIBLE);
                                 t[96].startAnimation(a);
                                 break;
                             case 105:
                                 t[97].setVisibility(View.VISIBLE);
                                 t[97].startAnimation(a);
                                 break;
                             case 106:
                                 t[98].setVisibility(View.VISIBLE);
                                 t[98].startAnimation(a);
                                 break;
                             case 107:
                                 t[99].setVisibility(View.VISIBLE);
                                 t[99].startAnimation(a);
                                 break;
                             case 108:
                                 t[100].setVisibility(View.VISIBLE);
                                 t[100].startAnimation(a);
                                 break;
                             case 109:
                                 t[101].setVisibility(View.VISIBLE);
                                 t[101].startAnimation(a);
                                 break;
                             case 110:
                                 t[102].setVisibility(View.VISIBLE);
                                 t[102].startAnimation(a);
                                 break;
                             case 111:
                                 t[103].setVisibility(View.VISIBLE);
                                 t[103].startAnimation(a);
                                 break;
                             case 112:
                                 t[104].setVisibility(View.VISIBLE);
                                 t[104].startAnimation(a);
                                 break;
                             case 113:
                                 t[105].setVisibility(View.VISIBLE);
                                 t[105].startAnimation(a);
                                 break;
                             case 114:
                                 d[9].setVisibility(View.VISIBLE);
                                 d[9].startAnimation(a);
                                 break;
                             case 115:
                                 t[106].setVisibility(View.VISIBLE);
                                 t[106].startAnimation(a);
                                 break;
                             case 116:
                                 t[107].setVisibility(View.VISIBLE);
                                 t[107].startAnimation(a);
                                 break;
                             case 117:
                                 t[108].setVisibility(View.VISIBLE);
                                 t[108].startAnimation(a);
                                 break;
                             case 118:
                                 t[109].setVisibility(View.VISIBLE);
                                 t[109].startAnimation(a);
                                 break;
                             case 119:
                                 t[110].setVisibility(View.VISIBLE);
                                 t[110].startAnimation(a);
                                 break;
                             case 120:
                                 t[111].setVisibility(View.VISIBLE);
                                 t[111].startAnimation(a);
                                 break;
                             case 121:
                                 t[112].setVisibility(View.VISIBLE);
                                 t[112].startAnimation(a);
                                 break;
                             case 122:
                                 t[113].setVisibility(View.VISIBLE);
                                 t[113].startAnimation(a);
                                 break;
                             case 123:
                                 t[114].setVisibility(View.VISIBLE);
                                 t[114].startAnimation(a);
                                 break;
                             case 124:
                                 t[115].setVisibility(View.VISIBLE);
                                 t[115].startAnimation(a);
                                 break;
                             case 125:
                                 t[116].setVisibility(View.VISIBLE);
                                 t[116].startAnimation(a);
                                 break;
                             case 126:
                                 t[117].setVisibility(View.VISIBLE);
                                 t[117].startAnimation(a);
                                 break;
                             case 127:
                                 t[118].setVisibility(View.VISIBLE);
                                 t[118].startAnimation(a);
                                 break;
                             case 128:
                                 t[119].setVisibility(View.VISIBLE);
                                 t[119].startAnimation(a);
                                 break;
                             case 129:
                                 t[120].setVisibility(View.VISIBLE);
                                 t[120].startAnimation(a);
                                 break;
                             case 130:
                                 t[121].setVisibility(View.VISIBLE);
                                 t[121].startAnimation(a);
                                 break;
                             case 131:
                                 t[122].setVisibility(View.VISIBLE);
                                 t[122].startAnimation(a);
                                 break;
                             case 132:
                                 t[123].setVisibility(View.VISIBLE);
                                 t[123].startAnimation(a);
                                 break;
                             case 133:
                                 t[124].setVisibility(View.VISIBLE);
                                 t[124].startAnimation(a);
                                 break;
                             case 134:
                                 t[125].setVisibility(View.VISIBLE);
                                 t[125].startAnimation(a);
                                 break;
                             case 135:
                                 t[126].setVisibility(View.VISIBLE);
                                 t[126].startAnimation(a);
                                 break;
                             case 136:
                                 t[127].setVisibility(View.VISIBLE);
                                 t[127].startAnimation(a);
                                 break;
                             case 137:
                                 t[128].setVisibility(View.VISIBLE);
                                 t[128].startAnimation(a);
                                 break;
                             case 138:
                                 t[129].setVisibility(View.VISIBLE);
                                 t[129].startAnimation(a);
                                 break;
                             case 139:
                                 t[130].setVisibility(View.VISIBLE);
                                 t[130].startAnimation(a);
                                 break;
                             case 141:
                                 t[131].setVisibility(View.VISIBLE);
                                 t[131].startAnimation(a);
                                 break;
                             case 142:
                                 t[132].setVisibility(View.VISIBLE);
                                 t[132].startAnimation(a);
                                 break;
                             case 143:
                                 t[133].setVisibility(View.VISIBLE);
                                 t[133].startAnimation(a);
                                 break;
                             case 144:
                                 t[134].setVisibility(View.VISIBLE);
                                 t[134].startAnimation(a);
                                 break;
                             case 145:
                                 t[135].setVisibility(View.VISIBLE);
                                 t[135].startAnimation(a);
                                 break;
                             case 146:
                                 t[136].setVisibility(View.VISIBLE);
                                 t[136].startAnimation(a);
                                 break;
                             case 147:
                                 t[137].setVisibility(View.VISIBLE);
                                 t[137].startAnimation(a);
                                 break;
                             case 148:
                                 t[138].setVisibility(View.VISIBLE);
                                 t[138].startAnimation(a);
                                 break;
                             case 149:
                                 t[139].setVisibility(View.VISIBLE);
                                 t[139].startAnimation(a);
                                 break;
                             case 150:
                                 t[140].setVisibility(View.VISIBLE);
                                 t[140].startAnimation(a);
                                 break;
                             case 151:
                                 t[141].setVisibility(View.VISIBLE);
                                 t[141].startAnimation(a);
                                 break;
                             case 152:
                                 t[142].setVisibility(View.VISIBLE);
                                 t[142].startAnimation(a);
                                 break;
                             case 153:
                                 t[143].setVisibility(View.VISIBLE);
                                 t[143].startAnimation(a);
                                 break;
                             case 154:
                                 t[144].setVisibility(View.VISIBLE);
                                 t[144].startAnimation(a);
                                 break;
                             case 155:
                                 t[145].setVisibility(View.VISIBLE);
                                 t[145].startAnimation(a);
                                 break;
                             case 156:
                                 t[146].setVisibility(View.VISIBLE);
                                 t[146].startAnimation(a);
                                 break;
                             case 157:
                                 t[147].setVisibility(View.VISIBLE);
                                 t[147].startAnimation(a);
                                 break;
                             case 158:
                                 t[148].setVisibility(View.VISIBLE);
                                 t[148].startAnimation(a);
                                 break;
                             case 159:
                                 t[149].setVisibility(View.VISIBLE);
                                 t[149].startAnimation(a);
                                 break;
                             case 160:
                                 t[150].setVisibility(View.VISIBLE);
                                 t[150].startAnimation(a);
                                 break;
                             case 161:
                                 t[151].setVisibility(View.VISIBLE);
                                 t[151].startAnimation(a);
                                 break;
                             case 162:
                                 t[152].setVisibility(View.VISIBLE);
                                 t[152].startAnimation(a);
                                 break;
                             case 163:
                                 t[153].setVisibility(View.VISIBLE);
                                 t[153].startAnimation(a);
                                 break;
                             case 164:
                                 t[154].setVisibility(View.VISIBLE);
                                 t[154].startAnimation(a);
                                 break;
                             case 165:
                                 t[155].setVisibility(View.VISIBLE);
                                 t[155].startAnimation(a);
                                 break;
                             case 166:
                                 t[156].setVisibility(View.VISIBLE);
                                 t[156].startAnimation(a);
                                 break;
                             case 167:
                                 t[157].setVisibility(View.VISIBLE);
                                 t[157].startAnimation(a);
                                 break;
                             case 168:
                                 t[158].setVisibility(View.VISIBLE);
                                 t[158].startAnimation(a);
                                 break;
                             case 169:
                                 t[159].setVisibility(View.VISIBLE);
                                 t[159].startAnimation(a);
                                 break;
                             case 170:
                                 t[160].setVisibility(View.VISIBLE);
                                 t[160].startAnimation(a);
                                 break;
                             case 171:
                                 t[161].setVisibility(View.VISIBLE);
                                 t[161].startAnimation(a);
                                 break;
                             case 172:
                                 t[162].setVisibility(View.VISIBLE);
                                 t[162].startAnimation(a);
                                 break;
                             case 173:
                                 t[163].setVisibility(View.VISIBLE);
                                 t[163].startAnimation(a);
                                 break;
                             case 174:
                                 t[164].setVisibility(View.VISIBLE);
                                 t[164].startAnimation(a);
                                 break;
                             case 175:
                                 t[165].setVisibility(View.VISIBLE);
                                 t[165].startAnimation(a);
                                 break;
                             case 176:
                                 t[166].setVisibility(View.VISIBLE);
                                 t[166].startAnimation(a);
                                 break;
                             case 177:
                                 t[167].setVisibility(View.VISIBLE);
                                 t[167].startAnimation(a);
                                 break;
                             case 178:
                                 t[168].setVisibility(View.VISIBLE);
                                 t[168].startAnimation(a);
                                 break;
                             case 179:
                                 t[169].setVisibility(View.VISIBLE);
                                 t[169].startAnimation(a);
                                 break;
                             case 180:
                                 t[170].setVisibility(View.VISIBLE);
                                 t[170].startAnimation(a);
                                 break;
                             case 181:
                                 t[171].setVisibility(View.VISIBLE);
                                 t[171].startAnimation(a);
                                 break;
                             case 182:
                                 t[172].setVisibility(View.VISIBLE);
                                 t[172].startAnimation(a);
                                 break;
                             case 183:
                                 t[173].setVisibility(View.VISIBLE);
                                 t[173].startAnimation(a);
                                 break;
                             case 184:
                                 t[174].setVisibility(View.VISIBLE);
                                 t[174].startAnimation(a);
                                 break;
                             case 185:
                                 t[175].setVisibility(View.VISIBLE);
                                 t[175].startAnimation(a);
                                 break;
                             case 186:
                                 t[176].setVisibility(View.VISIBLE);
                                 t[176].startAnimation(a);
                                 break;
                             case 187:
                                 t[177].setVisibility(View.VISIBLE);
                                 t[177].startAnimation(a);
                                 break;
                             case 188:
                                 t[178].setVisibility(View.VISIBLE);
                                 t[178].startAnimation(a);
                                 break;
                             case 189:
                                 t[179].setVisibility(View.VISIBLE);
                                 t[179].startAnimation(a);
                                 break;
                             case 190:
                                 t[180].setVisibility(View.VISIBLE);
                                 t[180].startAnimation(a);
                                 break;
                             case 191:
                                 t[181].setVisibility(View.VISIBLE);
                                 t[181].startAnimation(a);
                                 break;
                             case 192:
                                 t[182].setVisibility(View.VISIBLE);
                                 t[182].startAnimation(a);
                                 break;
                             case 193:
                                 b[6].setVisibility(View.VISIBLE);
                                 b[6].startAnimation(a);
                                 b[7].setVisibility(View.VISIBLE);
                                 b[7].startAnimation(a);
                                 b[6].setOnClickListener(new View.OnClickListener() {
                                     @Override
                                     public void onClick(View v) {
                                         try {
                                             if (f == 0) {
                                                 f = 1;
                                                 t[183].setVisibility(View.VISIBLE);
                                                 t[183].startAnimation(a);
                                                 t[184].setVisibility(View.GONE);
                                             }
                                         } catch (Exception e) {
                                         }
                                     }
                                 });
                                 b[7].setOnClickListener(new View.OnClickListener() {
                                     @Override
                                     public void onClick(View v) {
                                         try {
                                             if (f == 0) {
                                                 f = 1;
                                                 t[184].setVisibility(View.VISIBLE);
                                                 t[184].startAnimation(a);
                                                 t[183].setVisibility(View.GONE);
                                             }
                                         } catch (Exception e) {
                                         }
                                     }
                                 });
                                 break;
                             case 194:
                                 t[185].setVisibility(View.VISIBLE);
                                 t[185].startAnimation(a);
                                 break;
                             case 197:
                                 t[186].setVisibility(View.VISIBLE);
                                 t[186].startAnimation(a);
                                 break;
                             case 198:
                                 b[8].setVisibility(View.VISIBLE);
                                 b[8].startAnimation(a);
                                 b[9].setVisibility(View.VISIBLE);
                                 b[9].startAnimation(a);
                                 b[8].setOnClickListener(new View.OnClickListener() {
                                     @Override
                                     public void onClick(View v) {
                                         try {
                                             if (y == 0) {
                                                 y = 1;
                                                 t[187].setVisibility(View.VISIBLE);
                                                 t[187].startAnimation(a);

                                             }
                                         } catch (Exception e) {
                                         }
                                     }
                                 });
                                 b[9].setOnClickListener(new View.OnClickListener() {
                                     @Override
                                     public void onClick(View v) {
                                         try {
                                             if (y == 0) {
                                                 y = 1;
                                                 t[187].setVisibility(View.GONE);
                                             }
                                         } catch (Exception e) {
                                         }
                                     }
                                 });
                                 break;
                             case 199:
                                 t[188].setVisibility(View.VISIBLE);
                                 t[188].startAnimation(a);
                                 break;
                             case 200:
                                 t[189].setVisibility(View.VISIBLE);
                                 t[189].startAnimation(a);
                                 break;
                             case 201:
                                 t[190].setVisibility(View.VISIBLE);
                                 t[190].startAnimation(a);
                                 break;
                             case 202:
                                 t[191].setVisibility(View.VISIBLE);
                                 t[191].startAnimation(a);
                                 break;
                             case 203:
                                 t[192].setVisibility(View.VISIBLE);
                                 t[192].startAnimation(a);
                                 break;
                             case 204:
                                 t[193].setVisibility(View.VISIBLE);
                                 t[193].startAnimation(a);
                                 break;
                             case 205:
                                 t[194].setVisibility(View.VISIBLE);
                                 t[194].startAnimation(a);
                                 break;
                             case 206:
                                 t[195].setVisibility(View.VISIBLE);
                                 t[195].startAnimation(a);
                                 break;
                             case 207:
                                 t[196].setVisibility(View.VISIBLE);
                                 t[196].startAnimation(a);
                                 break;
                             case 208:
                                 t[197].setVisibility(View.VISIBLE);
                                 t[197].startAnimation(a);
                                 break;
                             case 209:
                                 t[198].setVisibility(View.VISIBLE);
                                 t[198].startAnimation(a);
                                 break;
                             case 210:
                                 t[199].setVisibility(View.VISIBLE);
                                 t[199].startAnimation(a);
                                 break;
                             case 211:
                                 d[10].setVisibility(View.VISIBLE);
                                 d[10].startAnimation(a);
                                 break;
                             case 212:
                                 t[200].setVisibility(View.VISIBLE);
                                 t[200].startAnimation(a);
                                 break;
                             case 213:
                                 t[201].setVisibility(View.VISIBLE);
                                 t[201].startAnimation(a);
                                 break;
                             case 214:
                                 t[202].setVisibility(View.VISIBLE);
                                 t[202].startAnimation(a);
                                 break;
                             case 215:
                                 t[203].setVisibility(View.VISIBLE);
                                 t[203].startAnimation(a);
                                 break;
                             case 216:
                                 t[204].setVisibility(View.VISIBLE);
                                 t[204].startAnimation(a);
                                 break;
                             case 217:
                                 t[205].setVisibility(View.VISIBLE);
                                 t[205].startAnimation(a);
                                 break;
                             case 218:
                                 t[206].setVisibility(View.VISIBLE);
                                 t[206].startAnimation(a);
                                 break;
                             case 219:
                                 t[207].setVisibility(View.VISIBLE);
                                 t[207].startAnimation(a);
                                 break;
                             case 220:
                                 t[208].setVisibility(View.VISIBLE);
                                 t[208].startAnimation(a);
                                 break;
                             case 221:
                                 t[209].setVisibility(View.VISIBLE);
                                 t[209].startAnimation(a);
                                 break;
                             case 222:
                                 d[11].setVisibility(View.VISIBLE);
                                 d[11].startAnimation(a);
                                 break;
                             case 223:
                                 t[210].setVisibility(View.VISIBLE);
                                 t[210].startAnimation(a);
                                 break;
                             case 224:
                                 t[211].setVisibility(View.VISIBLE);
                                 t[211].startAnimation(a);
                                 break;
                             case 225:
                                 t[212].setVisibility(View.VISIBLE);
                                 t[212].startAnimation(a);
                                 break;
                             case 226:
                                 t[213].setVisibility(View.VISIBLE);
                                 t[213].startAnimation(a);
                                 break;
                             case 227:
                                 t[214].setVisibility(View.VISIBLE);
                                 t[214].startAnimation(a);
                                 break;
                             case 228:
                                 d[12].setVisibility(View.VISIBLE);
                                 d[12].startAnimation(a);
                                 break;
                             case 229:
                                 b[10].setVisibility(View.VISIBLE);
                                 b[10].startAnimation(a);
                                 b[11].setVisibility(View.VISIBLE);
                                 b[11].startAnimation(a);
                                 b[10].setOnClickListener(new View.OnClickListener() {
                                     @Override
                                     public void onClick(View v) {
                                         try {
                                             if (j == 0) {
                                                 j = 1;
                                                 t[215].setVisibility(View.GONE);
                                             }
                                         } catch (Exception e) {
                                         }
                                     }
                                 });
                                 b[11].setOnClickListener(new View.OnClickListener() {
                                     @Override
                                     public void onClick(View v) {
                                         try {
                                             if (j == 0) {
                                                 j = 1;
                                                 t[215].setVisibility(View.VISIBLE);
                                                 t[215].startAnimation(a);
                                             }
                                         } catch (Exception e) {
                                         }
                                     }
                                 });
                                 break;
                             case 230:
                                 t[216].setVisibility(View.VISIBLE);
                                 t[216].startAnimation(a);
                                 break;
                             case 231:
                                 t[217].setVisibility(View.VISIBLE);
                                 t[217].startAnimation(a);
                                 break;
                             case 232:
                                 t[218].setVisibility(View.VISIBLE);
                                 t[218].startAnimation(a);
                                 break;
                             case 233:
                                 b[12].setVisibility(View.VISIBLE);
                                 b[12].startAnimation(a);
                                 b[13].setVisibility(View.VISIBLE);
                                 b[13].startAnimation(a);
                                 b[12].setOnClickListener(new View.OnClickListener() {
                                     @Override
                                     public void onClick(View v) {
                                         try {
                                             if (u == 0) {
                                                 u = 1;
                                                 t[219].setVisibility(View.VISIBLE);
                                                 t[219].startAnimation(a);
                                                 t[220].setVisibility(View.GONE);
                                             }
                                         } catch (Exception e) {
                                         }
                                     }
                                 });
                                 b[13].setOnClickListener(new View.OnClickListener() {
                                     @Override
                                     public void onClick(View v) {
                                         try {
                                             if (u == 0) {
                                                 u = 1;
                                                 t[220].setVisibility(View.VISIBLE);
                                                 t[220].startAnimation(a);
                                                 t[219].setVisibility(View.GONE);
                                             }
                                         } catch (Exception e) {
                                         }
                                     }
                                 });
                                 break;
                             case 234:
                                 t[221].setVisibility(View.VISIBLE);
                                 t[221].startAnimation(a);
                                 break;
                             case 235:
                                 t[222].setVisibility(View.VISIBLE);
                                 t[222].startAnimation(a);
                                 break;
                             case 236:
                                 t[223].setVisibility(View.VISIBLE);
                                 t[223].startAnimation(a);
                                 break;
                             case 237:
                                 t[224].setVisibility(View.VISIBLE);
                                 t[224].startAnimation(a);
                                 break;
                             case 238:
                                 b[14].setVisibility(View.VISIBLE);
                                 b[14].startAnimation(a);
                                 b[15].setVisibility(View.VISIBLE);
                                 b[15].startAnimation(a);
                                 b[16].setVisibility(View.VISIBLE);
                                 b[16].startAnimation(a);
                                 b[14].setOnClickListener(new View.OnClickListener() {
                                     @Override
                                     public void onClick(View v) {
                                         try {
                                             if (k == 0) {
                                                 k = 1;
                                                 t[225].setVisibility(View.VISIBLE);
                                                 t[225].startAnimation(a);
                                             }
                                         } catch (Exception e) {
                                         }
                                     }
                                 });
                                 b[15].setOnClickListener(new View.OnClickListener() {
                                     @Override
                                     public void onClick(View v) {
                                         try {
                                             if (k == 0) {
                                                 k = 1;
                                                 t[225].setVisibility(View.VISIBLE);
                                                 t[225].startAnimation(a);
                                             }
                                         } catch (Exception e) {
                                         }
                                     }
                                 });
                                 b[16].setOnClickListener(new View.OnClickListener() {
                                     @Override
                                     public void onClick(View v) {
                                         try {
                                             if (k == 0) {
                                                 k = 1;
                                                 t[225].setVisibility(View.VISIBLE);
                                                 t[225].startAnimation(a);
                                             }
                                         } catch (Exception e) {
                                         }
                                     }
                                 });
                                 break;
                             case 239:
                                 t[226].setVisibility(View.VISIBLE);
                                 t[226].startAnimation(a);
                                 break;
                             case 240:
                                 t[227].setVisibility(View.VISIBLE);
                                 t[227].startAnimation(a);
                                 break;
                             case 241:
                                 t[228].setVisibility(View.VISIBLE);
                                 t[228].startAnimation(a);
                                 break;
                             case 242:
                                 t[229].setVisibility(View.VISIBLE);
                                 t[229].startAnimation(a);
                                 break;
                             case 243:
                                 t[230].setVisibility(View.VISIBLE);
                                 t[230].startAnimation(a);
                                 break;
                             case 244:
                                 t[231].setVisibility(View.VISIBLE);
                                 t[231].startAnimation(a);
                                 break;
                             case 245:
                                 t[232].setVisibility(View.VISIBLE);
                                 t[232].startAnimation(a);
                                 break;
                             case 246:
                                 t[233].setVisibility(View.VISIBLE);
                                 t[233].startAnimation(a);
                                 break;
                             case 247:
                                 t[234].setVisibility(View.VISIBLE);
                                 t[234].startAnimation(a);
                                 break;
                             case 248:
                                 t[235].setVisibility(View.VISIBLE);
                                 t[235].startAnimation(a);
                                 break;
                             case 249:
                                 t[236].setVisibility(View.VISIBLE);
                                 t[236].startAnimation(a);
                                 break;
                             case 250:
                                 t[237].setVisibility(View.VISIBLE);
                                 t[237].startAnimation(a);
                                 break;
                             case 251:
                                 t[238].setVisibility(View.VISIBLE);
                                 t[238].startAnimation(a);
                                 break;
                             case 252:
                                 t[239].setVisibility(View.VISIBLE);
                                 t[239].startAnimation(a);
                                 break;
                             case 253:
                                 t[240].setVisibility(View.VISIBLE);
                                 t[240].startAnimation(a);
                                 break;
                             case 254:
                                 d[13].setVisibility(View.VISIBLE);
                                 d[13].startAnimation(a);
                                 break;
                             case 255:
                                 t[241].setVisibility(View.VISIBLE);
                                 t[241].startAnimation(a);
                                 break;
                             case 256:
                                 t[242].setVisibility(View.VISIBLE);
                                 t[242].startAnimation(a);
                                 break;
                             case 257:
                                 t[243].setVisibility(View.VISIBLE);
                                 t[243].startAnimation(a);
                                 break;
                             case 258:
                                 t[244].setVisibility(View.VISIBLE);
                                 t[244].startAnimation(a);
                                 break;
                             case 259:
                                 t[245].setVisibility(View.VISIBLE);
                                 t[245].startAnimation(a);
                                 break;
                             case 260:
                                 t[246].setVisibility(View.VISIBLE);
                                 t[246].startAnimation(a);
                                 break;
                             case 261:
                                 t[247].setVisibility(View.VISIBLE);
                                 t[247].startAnimation(a);
                                 break;
                             case 262:
                                 t[248].setVisibility(View.VISIBLE);
                                 t[248].startAnimation(a);
                                 break;
                             case 263:
                                 t[249].setVisibility(View.VISIBLE);
                                 t[249].startAnimation(a);
                                 break;
                             case 264:
                                 t[250].setVisibility(View.VISIBLE);
                                 t[250].startAnimation(a);
                                 break;
                             case 265:
                                 t[251].setVisibility(View.VISIBLE);
                                 t[251].startAnimation(a);
                                 break;
                             case 266:
                                 t[252].setVisibility(View.VISIBLE);
                                 t[252].startAnimation(a);
                                 break;
                             case 267:
                                 d[14].setVisibility(View.VISIBLE);
                                 d[14].startAnimation(a);
                                 break;
                             case 268:
                                 t[253].setVisibility(View.VISIBLE);
                                 t[253].startAnimation(a);
                                 break;
                             case 269:
                                 t[254].setVisibility(View.VISIBLE);
                                 t[254].startAnimation(a);
                                 break;
                             case 270:
                                 t[255].setVisibility(View.VISIBLE);
                                 t[255].startAnimation(a);
                                 break;
                             case 271:
                                 t[256].setVisibility(View.VISIBLE);
                                 t[256].startAnimation(a);
                                 break;
                             case 272:
                                 t[257].setVisibility(View.VISIBLE);
                                 t[257].startAnimation(a);
                                 break;
                             case 273:
                                 t[258].setVisibility(View.VISIBLE);
                                 t[258].startAnimation(a);
                                 break;
                             case 274:
                                 t[259].setVisibility(View.VISIBLE);
                                 t[259].startAnimation(a);
                                 break;
                             case 275:
                                 t[260].setVisibility(View.VISIBLE);
                                 t[260].startAnimation(a);
                                 break;
                             case 276:
                                 t[261].setVisibility(View.VISIBLE);
                                 t[261].startAnimation(a);
                                 break;
                             case 277:
                                 t[262].setVisibility(View.VISIBLE);
                                 t[262].startAnimation(a);
                                 break;
                             case 278:
                                 t[263].setVisibility(View.VISIBLE);
                                 t[263].startAnimation(a);
                                 break;
                             case 279:
                                 t[264].setVisibility(View.VISIBLE);
                                 t[264].startAnimation(a);
                                 break;
                             case 280:
                                 t[265].setVisibility(View.VISIBLE);
                                 t[265].startAnimation(a);
                                 break;
                             case 281:
                                 t[266].setVisibility(View.VISIBLE);
                                 t[266].startAnimation(a);
                                 break;
                             case 282:
                                 t[267].setVisibility(View.VISIBLE);
                                 t[267].startAnimation(a);
                                 break;
                             case 283:
                                 t[268].setVisibility(View.VISIBLE);
                                 t[268].startAnimation(a);
                                 break;
                             case 284:
                                 t[269].setVisibility(View.VISIBLE);
                                 t[269].startAnimation(a);
                                 break;
                             case 285:
                                 t[270].setVisibility(View.VISIBLE);
                                 t[270].startAnimation(a);
                                 break;
                             case 286:
                                 t[271].setVisibility(View.VISIBLE);
                                 t[271].startAnimation(a);
                                 break;
                             case 287:
                                 t[272].setVisibility(View.VISIBLE);
                                 t[272].startAnimation(a);
                                 break;
                             case 288:
                                 t[273].setVisibility(View.VISIBLE);
                                 t[273].startAnimation(a);
                                 break;
                             case 289:
                                 t[274].setVisibility(View.VISIBLE);
                                 t[274].startAnimation(a);
                                 break;
                             case 290:
                                 t[275].setVisibility(View.VISIBLE);
                                 t[275].startAnimation(a);
                                 break;
                             case 291:
                                 t[276].setVisibility(View.VISIBLE);
                                 t[276].startAnimation(a);
                                 break;
                             case 292:
                                 t[277].setVisibility(View.VISIBLE);
                                 t[277].startAnimation(a);
                                 break;
                             case 293:
                                 d[15].setVisibility(View.VISIBLE);
                                 d[15].startAnimation(a);
                                 break;
                             case 294:
                                 t[278].setVisibility(View.VISIBLE);
                                 t[278].startAnimation(a);
                                 break;
                             case 295:
                                 t[279].setVisibility(View.VISIBLE);
                                 t[279].startAnimation(a);
                                 break;
                             case 296:
                                 t[280].setVisibility(View.VISIBLE);
                                 t[280].startAnimation(a);
                                 break;

                         }
                     }}

     protected void onPause(){
         super.onPause();
         mySong.release();
     }
 }




 package com.example.myapplication2;

 import android.content.ContentValues;
 import android.database.sqlite.SQLiteDatabase;
 import android.os.Bundle;
 import android.view.View;
 import android.widget.Button;
 import android.widget.EditText;

 import androidx.appcompat.app.AppCompatActivity;

 public class Registration extends AppCompatActivity implements View.OnClickListener{

     Button btn1;
     EditText Name,Email,Password;
     DBHelper dbHelper;

      @Override
     protected void onCreate(Bundle savedInstanceState) {
         super.onCreate(savedInstanceState);
         setContentView(R.layout.registration);
         btn1 = (Button) findViewById(R.id.button);
         btn1.setOnClickListener((View.OnClickListener) this);

         Name = (EditText) findViewById(R.id.Name);
         Email = (EditText) findViewById(R.id.Email);
         Password = (EditText) findViewById(R.id.Password);

         dbHelper = new DBHelper(this);
     }

     @Override
     public void onClick (View v) {
          String name = Name.getText().toString();
          String email = Email.getText().toString();
          String pass = Password.getText().toString();
         SQLiteDatabase database = dbHelper.getWritableDatabase();
         ContentValues contentValues = new ContentValues();

           switch (v.getId()){
               case R.id.button:
                   contentValues.put(DBHelper.KEY_NAME, name);
                   contentValues.put(DBHelper.KEY_EMAIL, email);
                   contentValues.put(DBHelper.KEY_PASSWORD, pass);

                   database.insert(DBHelper.TABLE_CONTACTS,null,contentValues);
                   break;

           }

     }

 }
package com.example.nilima.myapplication6;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {


    ListView simpleList;
    String bookName[] = {"Java", "C++", "C#", "C", "Hindi", "English","Marathi","AsP.net","VB.net","Java", "C++", "C#", "C", "Hindi", "English"};
    int bookImage[] = {R.drawable.bookicon,R.drawable.bookicon,R.drawable.bookicon,R.drawable.bookicon,R.drawable.bookicon,R.drawable.bookicon,R.drawable.bookicon,R.drawable.bookicon,R.drawable.bookicon,R.drawable.bookicon,R.drawable.bookicon,R.drawable.bookicon,R.drawable.bookicon,R.drawable.bookicon,R.drawable.bookicon};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        simpleList = (ListView) findViewById(R.id.simpleListView);
        CustomAdapter customAdapter=new CustomAdapter(getApplication(), bookName,bookImage);
        simpleList.setAdapter(customAdapter);
    }


    }

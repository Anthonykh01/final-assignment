package com.lau.finalassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView list_view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        list_view = (ListView) findViewById(R.id.listview);
        ArrayList<String> course_names = new ArrayList<>(), course_links = new ArrayList<>();

        try {
            SQLiteDatabase sql_lite_db = this.openOrCreateDatabase("coursesdb", MODE_PRIVATE, null);
            sql_lite_db.execSQL("CREATE Table if not exists courses (name VARCHAR, link VARCHAR)");
            sql_lite_db.execSQL("INSERT INTO courses(name, link) VALUES ('Mobile', 'https://developer.android.com/docs'), ('discrete2', 'http://discrete.openmathbooks.org/dmoi3.html'), ('cp3', 'https://www.programiz.com/dsa#:~:text=A%20data%20structure%20is%20a,efficient%20and%20optimized%20computer%20programs.')");

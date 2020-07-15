package com.testprep.utmetestprep;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.testprep.questionsDbHelper;

import java.util.ArrayList;

import static com.testprep.questionsContract.SubjectContract;

public class ItemListSubject extends AppCompatActivity {

    SQLiteDatabase sqLiteDatabase;
    private ArrayList<String> QuestionNumber, QuestionsText, A, B, C, D;
    private SubjectsAdapter subjectsAdapter;
    private RecyclerView itemRecyclerView;
    private questionsDbHelper myDBHelper;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.subject_list_item);

        itemRecyclerView = (RecyclerView) findViewById(R.id.subjects_recyclerview);

        myDBHelper = new questionsDbHelper(this);
        QuestionsText = new ArrayList<>();
        QuestionNumber = new ArrayList<>();
       /* A = new ArrayList<>();
        B = new ArrayList<>();
        C = new ArrayList<>();
        D = new ArrayList<>();*/


        // storeDataInArray();
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        // itemRecyclerView.setHasFixedSize(true);
        // subjectsAdapter = new SubjectsAdapter(this,QuestionNumber, QuestionsText, A, B,C,D);
        itemRecyclerView.setLayoutManager(layoutManager);
        subjectsAdapter = new SubjectsAdapter(this, readAllItems());
        itemRecyclerView.setAdapter(subjectsAdapter);
    }


    private Cursor readAllItems() {
        return sqLiteDatabase.query(SubjectContract.TABLE_NAME, null,
                null,
                null,
                null,
                null,
                SubjectContract._ID);
    }

    /*private void storeDataInArray() {
        Cursor cursor = (Cursor) myDB.readAllQuestions();
        if (cursor.getCount()==0){
            Toast.makeText(getBaseContext(), "No data available", Toast.LENGTH_SHORT).show();
        }else {
            while(cursor.moveToNext()){
                QuestionNumber.add(cursor.getString(1));
                QuestionsText.add(cursor.getString(2));
                A.add(cursor.getString(3));
                B.add(cursor.getString(4));
                C.add(cursor.getString(5));
                D.add(cursor.getString(6));
            }
        }
    }*/
}

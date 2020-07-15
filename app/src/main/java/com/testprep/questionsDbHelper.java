package com.testprep;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import com.testprep.questionsContract.SubjectContract;
import com.testprep.utmetestprep.QuestionsUtil;

import java.util.ArrayList;
import java.util.List;

public class questionsDbHelper extends SQLiteOpenHelper {

    private static final String TAG = "questionsDbHelper";
    private static final String DATABASE_NAME = "questions.db";
    private static final int DATABASE_VERSION = 1;
    SQLiteDatabase db;


    public questionsDbHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    //Find out how to reuse this SGLCREATE statment rather than writing it severally for each table;
    // An option could be creating a class returning an instance of the
    // SQL_CREATE_SUBJECT_QUESTIONS_TABLE statment. Every String subject takes an instance and assigns its own values.
    @Override
    public void onCreate(SQLiteDatabase db) {
        this.db = db;

        final String SQL_CREATE_SUBJECT_QUESTIONS_TABLE = "CREATE TABLE " + SubjectContract.TABLE_NAME + " ( " +
                SubjectContract._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " + SubjectContract.QUESTION + " TEXT NOT NULL, " +
                SubjectContract.A + " TEXT, " + SubjectContract.B + " TEXT, " +
                SubjectContract.C + " TEXT, " + SubjectContract.D + " TEXT, " +
                SubjectContract.RESULT + " TEXT NOT NULL" + ")";

        db.execSQL(SQL_CREATE_SUBJECT_QUESTIONS_TABLE);
        fillQuestionsTable();

        Log.d(TAG, "onCreate: JOSSY");
    }

    //adds questions to the db
    private void addQuestionsToDB(QuestionsUtil question) {
        ContentValues cv = new ContentValues();
        cv.put(SubjectContract.QUESTION, QuestionsUtil.getQuestion());
        cv.put(SubjectContract.A, QuestionsUtil.getA());
        cv.put(SubjectContract.B, QuestionsUtil.getB());
        cv.put(SubjectContract.C, QuestionsUtil.getC());
        cv.put(SubjectContract.D, QuestionsUtil.getD());
        cv.put(SubjectContract.RESULT, QuestionsUtil.getResult());
        db.insert(SubjectContract.TABLE_NAME, null, cv);
    }

    private void fillQuestionsTable() {
        // PUT THESE QUESTIONS INTO EITHER JSON OR CSV FILE
        QuestionsUtil Q1 = new QuestionsUtil("Whats economics", "Study of the economy", "Not sure", "all of the above", "None", "Study of the economy");
        addQuestionsToDB(Q1);
        QuestionsUtil Q2 = new QuestionsUtil("In a planned economy the emphasis is on", "individual choice and decisions", "public ownership and control", "private ownership and control", "prices and competition", "prices and competition");
        addQuestionsToDB(Q1);
        QuestionsUtil Q3 = new QuestionsUtil("Price elasticity of supply is a ratio of the change in",
                "quantity supplied to the c change in demand",
                "original quantity to a change in new quantity",
                "quantity supplied to the change in price",
                "price to the change in quantity supplied.",
                "quantity supplied to the change in price");
        QuestionsUtil Q4 = new QuestionsUtil("Price elasticity of supply is a ratio of the change in",
                "quantity supplied to the c change in demand",
                "original quantity to a change in new quantity",
                "quantity supplied to the change in price",
                "price to the change in quantity supplied.",
                "quantity supplied to the change in price");
        QuestionsUtil Q5 = new QuestionsUtil("Whats economics", "Study of the economy", "Not sure", "all of the above", "None", "Study of the economy");
        QuestionsUtil Q6 = new QuestionsUtil("In a planned economy the emphasis is on", "individual choice and decisions", "public ownership and control", "private ownership and control", "prices and competition", "prices and competition");
        QuestionsUtil Q7 = new QuestionsUtil("Price elasticity of supply is a ratio of the change in",
                "quantity supplied to the c change in demand",
                "original quantity to a change in new quantity",
                "quantity supplied to the change in price",
                "price to the change in quantity supplied.",
                "quantity supplied to the change in price");
        QuestionsUtil Q8 = new QuestionsUtil("Whats economics", "Study of the economy", "Not sure", "all of the above", "None", "Study of the economy");
        QuestionsUtil Q9 = new QuestionsUtil("In a planned economy the emphasis is on", "individual choice and decisions", "public ownership and control", "private ownership and control", "prices and competition", "prices and competition");
        QuestionsUtil Q10 = new QuestionsUtil("Price elasticity of supply is a ratio of the change in",
                "quantity supplied to the c change in demand",
                "original quantity to a change in new quantity",
                "quantity supplied to the change in price",
                "price to the change in quantity supplied.",
                "quantity supplied to the change in price");
        QuestionsUtil Q11 = new QuestionsUtil("Whats economics", "Study of the economy", "Not sure", "all of the above", "None", "Study of the economy");
        QuestionsUtil Q12 = new QuestionsUtil("In a planned economy the emphasis is on", "individual choice and decisions", "public ownership and control", "private ownership and control", "prices and competition", "prices and competition");
        QuestionsUtil Q13 = new QuestionsUtil("Price elasticity of supply is a ratio of the change in",
                "quantity supplied to the c change in demand",
                "original quantity to a change in new quantity",
                "quantity supplied to the change in price",
                "price to the change in quantity supplied.",
                "quantity supplied to the change in price");
        QuestionsUtil Q14 = new QuestionsUtil("Whats economics", "Study of the economy", "Not sure", "all of the above", "None", "Study of the economy");
        QuestionsUtil Q15 = new QuestionsUtil("In a planned economy the emphasis is on", "individual choice and decisions", "public ownership and control", "private ownership and control", "prices and competition", "prices and competition");
        QuestionsUtil Q16 = new QuestionsUtil("Price elasticity of supply is a ratio of the change in",
                "quantity supplied to the c change in demand",
                "original quantity to a change in new quantity",
                "quantity supplied to the change in price",
                "price to the change in quantity supplied.",
                "quantity supplied to the change in price");
        QuestionsUtil Q17 = new QuestionsUtil("Whats economics", "Study of the economy", "Not sure", "all of the above", "None", "Study of the economy");
        QuestionsUtil Q18 = new QuestionsUtil("In a planned economy the emphasis is on", "individual choice and decisions", "public ownership and control", "private ownership and control", "prices and competition", "prices and competition");
        QuestionsUtil Q19 = new QuestionsUtil("Price elasticity of supply is a ratio of the change in",
                "quantity supplied to the c change in demand",
                "original quantity to a change in new quantity",
                "quantity supplied to the change in price",
                "price to the change in quantity supplied.",
                "quantity supplied to the change in price");
        QuestionsUtil Q20 = new QuestionsUtil("Whats economics", "Study of the economy", "Not sure", "all of the above", "None", "Study of the economy");
        QuestionsUtil Q21 = new QuestionsUtil("In a planned economy the emphasis is on", "individual choice and decisions", "public ownership and control", "private ownership and control", "prices and competition", "prices and competition");
        QuestionsUtil Q22 = new QuestionsUtil("Price elasticity of supply is a ratio of the change in",
                "quantity supplied to the c change in demand",
                "original quantity to a change in new quantity",
                "quantity supplied to the change in price",
                "price to the change in quantity supplied.",
                "quantity supplied to the change in price");
        QuestionsUtil Q23 = new QuestionsUtil("Whats economics", "Study of the economy", "Not sure", "all of the above", "None", "Study of the economy");
        QuestionsUtil Q24 = new QuestionsUtil("In a planned economy the emphasis is on", "individual choice and decisions", "public ownership and control", "private ownership and control", "prices and competition", "prices and competition");
        QuestionsUtil Q25 = new QuestionsUtil("Price elasticity of supply is a ratio of the change in",
                "quantity supplied to the c change in demand",
                "original quantity to a change in new quantity",
                "quantity supplied to the change in price",
                "price to the change in quantity supplied.",
                "quantity supplied to the change in price");

        addQuestionsToDB(Q3);
        addQuestionsToDB(Q4);
        addQuestionsToDB(Q5);
        addQuestionsToDB(Q6);
        addQuestionsToDB(Q7);
        addQuestionsToDB(Q8);
        addQuestionsToDB(Q9);
        addQuestionsToDB(Q10);
        addQuestionsToDB(Q11);
        addQuestionsToDB(Q12);
        addQuestionsToDB(Q13);
        addQuestionsToDB(Q14);
        addQuestionsToDB(Q15);
        addQuestionsToDB(Q16);
        addQuestionsToDB(Q17);
        addQuestionsToDB(Q18);
        addQuestionsToDB(Q19);
        addQuestionsToDB(Q20);
        addQuestionsToDB(Q21);
        addQuestionsToDB(Q22);
        addQuestionsToDB(Q23);
        addQuestionsToDB(Q24);
        addQuestionsToDB(Q25);
    }
    //CREATE TABLLE new_table AS (SELECT * FROM old_table);

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + SubjectContract.TABLE_NAME);
        onCreate(db);
    }

    //reads the questions from the db
    public List<QuestionsUtil> readAllQuestions() {
        List<QuestionsUtil> questionList = new ArrayList<>();
        db = getReadableDatabase();
        Cursor cursor = db.rawQuery("SELECT * FROM " + SubjectContract.TABLE_NAME, null);
        DatabaseUtils.dumpCursor(cursor);
        if (cursor.moveToFirst()) {
            do {
                QuestionsUtil questionsUtil = new QuestionsUtil();
                //questionsUtil.setId(cursor.getInt(cursor.getColumnIndex(SubjectContract.COLUMN_ID)));
                questionsUtil.setQuestion(cursor.getString(cursor.getColumnIndex(SubjectContract.QUESTION)));
                questionsUtil.setA(cursor.getString(cursor.getColumnIndex(SubjectContract.A)));
                questionsUtil.setB(cursor.getString(cursor.getColumnIndex(SubjectContract.B)));
                questionsUtil.setC(cursor.getString(cursor.getColumnIndex(SubjectContract.C)));
                questionsUtil.setD(cursor.getString(cursor.getColumnIndex(SubjectContract.D)));
                questionsUtil.setResult(cursor.getString(cursor.getColumnIndex(SubjectContract.A)));
                questionList.add(questionsUtil);
            } while (cursor.moveToNext());
        }
        cursor.close();
        return questionList;
    }
}
/*1



the long-run average cost curve is called a planning curve because it shows what happens to costs when.
A. variable inputs are increased
B. fixed factors are increased
C. different sizes of plants are built
D. a bigger size of plants is built

13. Imperfect market is characterized by
A. many buyers and few sellers
B. a large number of buyers and sellers
C. non-preferential treatment
D. perfect mobility of factors of production

14. Short-run period in production is a period for a firm to be able to change its
A. variable inputs
B. total outputs
C. total revenue
D. scale of operation
*/
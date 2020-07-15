package com.testprep.utmetestprep;

import android.content.res.ColorStateList;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.testprep.questionsDbHelper;

import java.util.List;

public class ItemActivity extends AppCompatActivity {

    // CourseActivity(String English, String Mathematics, String Physics, String Chemistry, String Biology){}

    TextView QuestionNumber, QuestionTextview;
    RadioButton RBa, RBb, RBc, RBd;
    RadioGroup radioGroup;
    List<QuestionsUtil> questionsUtilList;
    ColorStateList CorrectTextColor;
    SQLiteDatabase db;
    private int questionCounter;
    private int questionCountTotal;
    private QuestionsUtil currentQuestion;
    private int score;
    private boolean answered;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item);

        QuestionNumber = findViewById(R.id.number_textView);
        QuestionTextview = findViewById(R.id.Question_textView);
        radioGroup = findViewById(R.id.radioGroup);
        RBa = findViewById(R.id.radioButtonA);
        RBb = findViewById(R.id.radioButtonB);
        RBc = findViewById(R.id.radioButtonC);
        RBd = findViewById(R.id.radioButtonD);

        questionsDbHelper DbHelper = new questionsDbHelper(this);
        questionsUtilList = DbHelper.readAllQuestions();
        /*questionCountTotal = questionsUtilList.size();

        //to get the results in random order. This would be implemented in the mock test
        Collections.shuffle(questionsUtilList);*/

        nextQuestion();
    }

    private void nextQuestion() {
        // This ..
        //  if(questionCounter<questionCountTotal) {
        //   currentQuestion = questionsUtilList.get(questionCounter);

        //QuestionNumber.setText(QuestionsUtil.getId());
        QuestionTextview.setText(QuestionsUtil.getQuestion());
        RBa.setText(QuestionsUtil.getA());
        RBb.setText(QuestionsUtil.getB());
        RBc.setText(QuestionsUtil.getC());
        RBd.setText(QuestionsUtil.getD());

        //  this clears the old selections made for the new question
        radioGroup.clearCheck();

        questionCounter++;
        //  }
    }
}


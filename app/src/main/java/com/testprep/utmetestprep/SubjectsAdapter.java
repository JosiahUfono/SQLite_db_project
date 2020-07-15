package com.testprep.utmetestprep;

import android.content.Context;
import android.database.Cursor;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.testprep.questionsContract;

import java.util.ArrayList;

public class SubjectsAdapter extends RecyclerView.Adapter<SubjectsAdapter.subjectViewHolder> {

    private static final String TAG = "SubjectsAdapter";
    private Context context;
    private ArrayList QuestionNumber, QuestionTextview, A, B, C, D, Result;
    private Cursor mCursor;

    SubjectsAdapter(Context context, Cursor cursor) {
        this.context = context;
        // this.QuestionNumber = QuestionNumber;
        this.mCursor = cursor;
        this.QuestionTextview = QuestionTextview;
       /* this.A = A;
        this.B = B;
        this.C = C;
        this.D = D;*/
        //this.Result = Result;
    }

    @NonNull
    @Override
    public subjectViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.activity_item, viewGroup, false);
        subjectViewHolder subjectViewHolder = new subjectViewHolder(view);
        return subjectViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull subjectViewHolder holder, int position) {
       /* holder.QuestionNumber.setText(String.valueOf(QuestionNumber.get(position)));
        holder.QuestionTextVIew.setText(String.valueOf(QuestionTextview.get(position)));
        holder.ARadioButton.setText(String.valueOf(A.get(position)));
        holder.BRadioButton.setText(String.valueOf(B.get(position)));
        holder.CRadioButton.setText(String.valueOf(C.get(position)));
        holder.DRadioButton.setText(String.valueOf(D.get(position)));*/

        //String QuestionNumber = mCursor.getString(mCursor.getColumnIndex(questionsContract.SubjectContract.COLUMN_ID));
        String Question = mCursor.getString(mCursor.getColumnIndex(questionsContract.SubjectContract.QUESTION));
        String A = mCursor.getString(mCursor.getColumnIndex(questionsContract.SubjectContract.A));
        String B = mCursor.getString(mCursor.getColumnIndex(questionsContract.SubjectContract.B));
        String C = mCursor.getString(mCursor.getColumnIndex(questionsContract.SubjectContract.C));
        String D = mCursor.getString(mCursor.getColumnIndex(questionsContract.SubjectContract.D));
        //String Result = mCursor.getString(mCursor.getColumnIndex(questionsContract.SubjectContract.RESULT));
        // holder.QuestionNumber.setText(QuestionNumber);

        Log.d(TAG, "onBindViewHolder: Jossy " + A);

        holder.QuestionTextVIew.setText(Question);
        holder.ARadioButton.setText(A);
        holder.BRadioButton.setText(B);
        holder.CRadioButton.setText(C);
        holder.DRadioButton.setText(D);
        //holder.Result.setText(Result);
        if (!mCursor.moveToPosition(position)) {
            return;
        }
    }

    @Override
    public int getItemCount() {
        return mCursor.getCount();
    }

    class subjectViewHolder extends RecyclerView.ViewHolder {
        TextView QuestionNumber, QuestionTextVIew, Result;
        RadioButton ARadioButton, BRadioButton, CRadioButton, DRadioButton;

        public subjectViewHolder(@NonNull View itemView) {
            super(itemView);
            QuestionNumber = (TextView) itemView.findViewById(R.id.number_textView);
            QuestionTextVIew = (TextView) itemView.findViewById(R.id.Question_textView);
            ARadioButton = itemView.findViewById(R.id.radioButtonA);
            BRadioButton = itemView.findViewById(R.id.radioButtonB);
            CRadioButton = itemView.findViewById(R.id.radioButtonC);
            DRadioButton = itemView.findViewById(R.id.radioButtonD);
        }
    }
}

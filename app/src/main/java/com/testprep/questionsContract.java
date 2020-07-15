package com.testprep;

import android.provider.BaseColumns;

public class questionsContract {

    public questionsContract() {
    }

    public static final class SubjectContract implements BaseColumns {
        public static final String TABLE_NAME = "T2020";
        public static final String COLUMN_ID = _ID;
        public static final String QUESTION = "question";
        public static final String A = "a";
        public static final String B = "b";
        public static final String C = "c";
        public static final String D = "d";
        public static final String RESULT = "result";
    }
}

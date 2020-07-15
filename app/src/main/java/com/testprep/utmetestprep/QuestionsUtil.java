package com.testprep.utmetestprep;

public class QuestionsUtil {
    /*public static final String Question = "question";
    public static final String A = "A";
    public static final String AB = "B";
    public static final String C = "C";
    public static final String D = "D";
    public static final String result = "result";*/

    private static int _ID;
    private static String question;
    private static String a;
    private static String b;
    private static String c;
    private static String d;
    private static String result;

    public QuestionsUtil() {
    }

    public QuestionsUtil(String question, String a, String b, String c, String d, String result) {
        //this._ID = _ID;
        QuestionsUtil.question = question;
        QuestionsUtil.a = a;
        QuestionsUtil.b = b;
        QuestionsUtil.c = c;
        QuestionsUtil.d = d;
        QuestionsUtil.result = result;
    }

    public static String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        QuestionsUtil.question = question;
    }

    /* public static int getId() {
         return _ID;
     }

     public static void setId(int Id) {
         _ID = Id;
     }
 */
    public static String getA() {
        return a;
    }

    public void setA(String a) {
        QuestionsUtil.a = a;
    }

    public static String getB() {
        return b;
    }

    public void setB(String b) {
        QuestionsUtil.b = b;
    }

    public static String getC() {
        return c;
    }

    public void setC(String c) {
        QuestionsUtil.c = c;
    }

    public static String getD() {
        return d;
    }

    public void setD(String d) {
        QuestionsUtil.d = d;
    }

    public static String getResult() {
        return result;
    }

    public void setResult(String result) {
        QuestionsUtil.result = result;
    }

}

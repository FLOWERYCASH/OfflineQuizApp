package com.example.offlinequizapp;

import java.util.ArrayList;
import java.util.List;

public class Questionbank {

    public static List<QuestionList> javaQuestions(){

        final List<QuestionList> questionLists = new ArrayList<>();

        // create object of QuestionList class and pass a questions along with options and answer
        final QuestionList question1 = new QuestionList("what is the size of int variable?","16 bit","8 bit","32 bit","64 bit","32bit","");
        final QuestionList question2 = new QuestionList("what is the default  value of boolean variable?","true","false","null","not defined","false","");
        final QuestionList question3 = new QuestionList("what is the default value of an instance variable?","Depends upon the type of variable","null","0","not assigned","Depends upon the type of variable","");
        final QuestionList question4 = new QuestionList("what is the reserved word in java programming language?","method","native","references","array","native","");
        final QuestionList question5 = new QuestionList("which of the following is NOT a keyword or a reserved word in java?","if","then","goto","while","then","");
        final QuestionList question6 = new QuestionList("which is the valid declaration within an interface declaration?","public double method();","public final double method();","static void method(double d)","protected void method(double d);","publiic double method();","");

        //add all questions to List<QuestionList>
        questionLists.add(question1);
        questionLists.add(question2);
        questionLists.add(question3);
        questionLists.add(question4);
        questionLists.add(question5);
        questionLists.add(question6);

        return questionLists;
    }
    private static List<QuestionList> phpQuestions(){

        final List<QuestionList> questionLists = new ArrayList<>();

        //create object of QuestionList class and pass a question along with option and answer
        final QuestionList question1= new QuestionList("what does php stands for?","Professional Home Page","Hypertext Preprocessor","Pretext Hypertext processor","preprocessor Home Page","Hypertext Preprocessor","");
        final QuestionList question2= new QuestionList("who is the father of php?","Rasmus Lerdorf","William Makepiece","Drek Kolkevi","List Barely","Rasmus Lerdorf","");
        final QuestionList question3= new QuestionList("php files have a default extension of.?",".html",".php",".xml",".json",".php","");
        final QuestionList question4= new QuestionList("A php script should start with  ______ and end with _____?","< php >","<php />","< ? ? >","< ? php ? >","< ? php ? >","");
        final QuestionList question5= new QuestionList("which version of php introduced try/catch exception?","php 4","php 5","php 6","php 5.3","php 5","");
        final QuestionList question6= new QuestionList("id $a = 12 what will be returned when($a ==12) ? 5 : 1 is executed ?","12","1","5","error","5","");

        //add all question to List<QuestionList>
        questionLists.add(question1);
        questionLists.add(question2);
        questionLists.add(question3);
        questionLists.add(question4);
        questionLists.add(question5);
        questionLists.add(question6);

        return questionLists;
    }

    private static List<QuestionList> htmlQuestions(){

        final List<QuestionList> questionLists = new ArrayList<>();

        //create object of QuestionList class and pass a question along with option and answer
        final QuestionList question1= new QuestionList("html stands for?","Hypertext Markup Language","Hypertext Preprocessor","Pretext Hypertext processor","preprocessor Home Page","Hypertext Preprocessor","");
        final QuestionList question2= new QuestionList("which of the following tag is used to mark the beginning of a paragraph?","<TD>","<br>","<p>","<TR>","<p>","");
        final QuestionList question3= new QuestionList("from which tag descriptive list starts?","<LL>","<DD>","<DL>","<DS>","<DL>","");
        final QuestionList question4= new QuestionList("correct html tag for the largest heading is","<h1>","<large>","<h6>","<heading>","<h1>","");
        final QuestionList question5= new QuestionList("the attribute of <form> tag","Method","Action","both (a)&(b)","None of the following","both (a)&(b)","");
        final QuestionList question6= new QuestionList("Markup tags tell the web browser","How to organise the page","How to display the page","How to display message box in a page","None of the above","How to display the page","");

        //add all question to List<QuestionList>
        questionLists.add(question1);
        questionLists.add(question2);
        questionLists.add(question3);
        questionLists.add(question4);
        questionLists.add(question5);
        questionLists.add(question6);

        return questionLists;
    }

    private static List<QuestionList> androidQuestions(){

        final List<QuestionList> questionLists = new ArrayList<>();

        //create object of QuestionList class and pass a question along with option and answer
        final QuestionList question1= new QuestionList("Select a component is NOT part of Android architecture","Android Framework","Libraries","Linux Kernel","Android Document","Linux Kernel","");
        final QuestionList question2= new QuestionList("A ______ makes a specific set of the application data available to other applications","Content Provider","Broadcast receivers","Intent","None of these","Rasmus Lerdorf","");
        final QuestionList question3= new QuestionList("Which among these are NOT a part of Android's native libraries?","WebKit","Dalvik","OpenGl","SQLite","Dalvik","");
        final QuestionList question4= new QuestionList("During an Activity life cycle, What is the first callback method invoked by the system?","onStop()","onStart()","onCreate()","onRestore()","onCreate()","");
        final QuestionList question5= new QuestionList("what Activity method would you use to retrieve a reference to an Android view by using the id attribute of a resource XML?","finfViewBYReference(int id)","findViewById(int id)","findViewById(String id)","retrieveResourceById(int id)","findViewById(int id)","");
        final QuestionList question6= new QuestionList("The requests from Content Provider class is handled by method","onCreate","onSelect","ContentResolver","onClick","ContentResolver","");

        //add all question to List<QuestionList>
        questionLists.add(question1);
        questionLists.add(question2);
        questionLists.add(question3);
        questionLists.add(question4);
        questionLists.add(question5);
        questionLists.add(question6);

        return questionLists;
    }
    public static List<QuestionList> getQuestions(String selectedTopicName){
        switch(selectedTopicName){

            case "java":
                return javaQuestions();
            case "php":
                return phpQuestions();
            case "html":
                return htmlQuestions();
            case "android":
                return androidQuestions();
            default:
                return htmlQuestions();
        }
    }


}

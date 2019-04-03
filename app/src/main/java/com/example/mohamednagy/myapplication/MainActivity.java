package com.example.mohamednagy.myapplication;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.format.DateFormat;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Calendar;
import java.util.Locale;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    /// ToDO: use this variable to check if the use already clicked on the button or not.
    /// Be creative and do it without if-condition if you can.
    int checked = -1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /// Don't remove the next line
        addRandomLikes();
        /// ..................

        /*
         * Circle yellow button id           -> like_button
         * Text within the yellow button id  -> like_text_view
         * EditText of comment id            -> feedback_edit_text
         * Button for adding the feedback    -> add_comment_button
         * Comment textview id               -> user_comment
         * The ids of views are existed in the picture of the facebook post.
         * Please check it out carefully. Or check out the repository of the project on
         * github: https://github.com/MohamedNagyMostafa/Student-Assignment
         */

        //TODO: Assign variables(objects) for each view items you will use.
        // Hint: TextView object_name = findViewById(R.id.[view_id])

        // Write the task's code below











        //TODO: Assign Listener to the 'add comment' button that will add the comment of the user
        //TODO: from the EditText to the TextView (user_comment)
        //TODO: call 'displayCommentLayout' method within the onClick function of the listener
        //     Hint: setOnClickListener(new View.OnClickListener() {
        //            @Override
        //            public void onClick(View v) {
        //                displayCommentLayout();
        //                // Your Code
        //
        //            }
        //        });

        /// Write the task's code below ...










        //TODO: Assign Listener to the circle yellow button that will increase the number of likes
        //TODO: by one when the user clicks on it, and decreases (remove the user like) the number of likes by one
        //TODO: when the user click on the button again.

        // Remember: getText().toString() return  String data type not a number,
        // therefore you will need to convert the string to number.
        // Also setText() takes only String data type not number

        // Hint: you can use 'textToNumber(String)' function to convert a text to number.
        // Hint: you can use 'numberToText(Int)' function to convert a number to text.

        /// Write the task's code below ...











    }


    private String numberToText(int number){
        return String.valueOf(number);
    }

    private int textToNumber(String text){
        return Integer.valueOf(text);
    }

    private void displayCommentLayout(){
        findViewById(R.id.comment_layout).setVisibility(View.VISIBLE);

        ((TextView)findViewById(R.id.date)).setText(getDateAsString());
    }

    private static String getDateAsString() {

        Calendar calendar = Calendar.getInstance(Locale.ENGLISH);

        return DateFormat.format("EEE, MMM d, h:mm a" , calendar).toString();
    }

    private void addRandomLikes(){
        ((TextView)findViewById(R.id.like_text_view)).setText(String.valueOf(new Random().nextInt(98)));
    }
}

















package com.shubhamjitiya.mad.practical_3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.shubhamjitiya.mad.R;

public class SecondActivity extends AppCompatActivity {

    public static final String EXTRA_REPLY =
            "com.shubhamjitiya.mad.practical_3.extra.REPLY";
    private EditText mReply;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        // Initialize view variables.
        mReply = findViewById(R.id.editText_second);

        // Get the intent that launched this activity, and the message in
        // the intent extra.
        Intent intent = getIntent();
        String message = intent.getStringExtra(Practical_3.EXTRA_MESSAGE);

        // Put that message into the text_message TextView
        TextView textView = findViewById(R.id.text_message);
        textView.setText(message);

    }

    public void returnReply(View view) {
        // Get the reply message from the edit text.
        String reply = mReply.getText().toString();

        // Create a new intent for the reply, add the reply message to it
        // as an extra, set the intent result, and close the activity.
        Intent replyIntent = new Intent();
        replyIntent.putExtra(EXTRA_REPLY, reply);
        setResult(RESULT_OK, replyIntent);
        finish();
    }

}
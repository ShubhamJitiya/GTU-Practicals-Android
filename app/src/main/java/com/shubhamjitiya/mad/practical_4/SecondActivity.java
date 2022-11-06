package com.shubhamjitiya.mad.practical_4;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.shubhamjitiya.mad.R;

public class SecondActivity extends AppCompatActivity {
    // Unique tag for the intent reply.
    public static final String EXTRA_REPLY =
            "com.shubhamjitiya.mad.practical_4.extra.REPLY";
    // Class name for Log tag.
    private static final String LOG_TAG
            = SecondActivity.class.getSimpleName();
    // EditText for the reply.
    private EditText mReply;

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "Second Activity: onStart", Toast.LENGTH_SHORT).show();
        Log.d(LOG_TAG, "onStart");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second2);

        // Initialize view variables.
        mReply = findViewById(R.id.editText_second);

        // Get the intent that launched this activity, and the message in
        // the intent extra.
        Intent intent = getIntent();
        String message = intent.getStringExtra(Practical_4.EXTRA_MESSAGE);

        // Put that message into the text_message TextView.
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
        Toast.makeText(this, "Second Activity: Finish", Toast.LENGTH_SHORT).show();
        Log.d(LOG_TAG, "End SecondActivity");
        finish();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "Second Activity: onPause", Toast.LENGTH_SHORT).show();
        Log.d(LOG_TAG, "onPause");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this, "Second Activity: onRestart", Toast.LENGTH_SHORT).show();
        Log.d(LOG_TAG, "onRestart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "Second Activity: onResume", Toast.LENGTH_SHORT).show();
        Log.d(LOG_TAG, "onResume");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "Second Activity: onStop", Toast.LENGTH_SHORT).show();
        Log.d(LOG_TAG, "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "Second Activity: onDestroy", Toast.LENGTH_SHORT).show();
        Log.d(LOG_TAG, "onDestroy");
    }
}
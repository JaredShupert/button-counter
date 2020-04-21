package com.example.buttoncounterapp;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText userInput;
    private Button button;
    private TextView textView;
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d(TAG, "onCreate: Start");

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        userInput = findViewById(R.id.editText);
        button = findViewById(R.id.button);
        textView = findViewById(R.id.textView);
        textView.setText("");
        textView.setMovementMethod(new ScrollingMovementMethod());
        View.OnClickListener ourOnClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String result = userInput.getText().toString();
                result += "\n";
                textView.append(result);
                userInput.setText("");
            }
        };
        button.setOnClickListener(ourOnClickListener);
        Log.d(TAG, "onCreate: End");
    }

    @Override
    protected void onStart() {
        Log.d(TAG, "onStart: Start");
        super.onStart();
        Log.d(TAG, "onStart: End");
    }

    @Override
    protected void onDestroy() {
        Log.d(TAG, "onDestroy: Start");
        super.onDestroy();
        Log.d(TAG, "onDestroy: End");
    }

    @Override
    protected void onResume() {
        Log.d(TAG, "onResume: Start");
        super.onResume();
        Log.d(TAG, "onResume: End");
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        Log.d(TAG, "onRestoreInstanceState: Start");
        super.onRestoreInstanceState(savedInstanceState);
        Log.d(TAG, "onRestoreInstanceState: End");
    }

    @Override
    protected void onPause() {
        Log.d(TAG, "onPause: Start");
        super.onPause();
        Log.d(TAG, "onPause: End");
    }

    @Override
    protected void onStop() {
        Log.d(TAG, "onStop: Start");
        super.onStop();
        Log.d(TAG, "onStop: End");
    }

    @Override
    protected void onRestart() {
        Log.d(TAG, "onRestart: Start");
        super.onRestart();
        Log.d(TAG, "onRestart: End");
    }

}

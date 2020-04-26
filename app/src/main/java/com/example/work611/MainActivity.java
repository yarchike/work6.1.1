package com.example.work611;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "Lifecycle";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, new Object(){}.getClass().getEnclosingMethod().getName() + ": " + savedInstanceState);
        TextView textView = findViewById(R.id.textViev);
        textView.append("\n" + new Object(){}.getClass().getEnclosingMethod().getName() + ": " + savedInstanceState);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, new Object(){}.getClass().getEnclosingMethod().getName());
        TextView textView = findViewById(R.id.textViev);
        textView.append("\n" + new Object(){}.getClass().getEnclosingMethod().getName());
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, new Object(){}.getClass().getEnclosingMethod().getName());
        TextView textView = findViewById(R.id.textViev);
        textView.append("\n" + new Object(){}.getClass().getEnclosingMethod().getName());
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
        Log.d(TAG, new Object(){}.getClass().getEnclosingMethod().getName());
        TextView textView = findViewById(R.id.textViev);
        textView.append("\n" + new Object(){}.getClass().getEnclosingMethod().getName());
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, new Object(){}.getClass().getEnclosingMethod().getName());
        TextView textView = findViewById(R.id.textViev);
        textView.append("\n" + new Object(){}.getClass().getEnclosingMethod().getName());
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, new Object(){}.getClass().getEnclosingMethod().getName());
        TextView textView = findViewById(R.id.textViev);
        textView.append("\n" + new Object(){}.getClass().getEnclosingMethod().getName());
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, new Object(){}.getClass().getEnclosingMethod().getName());
        TextView textView = findViewById(R.id.textViev);
        textView.append("\n" + new Object(){}.getClass().getEnclosingMethod().getName());
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, new Object(){}.getClass().getEnclosingMethod().getName());
        TextView textView = findViewById(R.id.textViev);
        textView.append("\n" + new Object(){}.getClass().getEnclosingMethod().getName());
    }

    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        Log.d(TAG, new Object(){}.getClass().getEnclosingMethod().getName());
        TextView textView = findViewById(R.id.textViev);
        textView.append("\n" + new Object(){}.getClass().getEnclosingMethod().getName());
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        Log.d(TAG, new Object(){}.getClass().getEnclosingMethod().getName());
        TextView textView = findViewById(R.id.textViev);
        textView.append("\n" + new Object(){}.getClass().getEnclosingMethod().getName());

        return true;//super.onKeyDown(keyCode, event);

    }

    @Override
    public boolean onKeyLongPress(int keyCode, KeyEvent event) {
        Log.d(TAG, new Object(){}.getClass().getEnclosingMethod().getName());
        TextView textView = findViewById(R.id.textViev);
        return super.onKeyLongPress(keyCode, event);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Log.d(TAG, new Object(){}.getClass().getEnclosingMethod().getName());
        TextView textView = findViewById(R.id.textViev);
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.d(TAG, new Object(){}.getClass().getEnclosingMethod().getName());
        TextView textView = findViewById(R.id.textViev);
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.d(TAG, new Object(){}.getClass().getEnclosingMethod().getName());
        TextView textView = findViewById(R.id.textViev);
    }
}

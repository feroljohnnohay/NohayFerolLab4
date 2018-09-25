package com.example.feroljohnnohay.nohayferollab4;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        super.onStart();

        Log.d("Lab4", "onStart() has Executed");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Lab4", "onResume() has Executed");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Lab4", "onPause() has Executed");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Lab4", "onStop() has Executed");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("Lab4", "onRestart() has Executed");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Lab4", "onDestroy() has Executed");
    }

    public void showToast(View v){
        Toast.makeText(this,"This is TOAST.", Toast.LENGTH_LONG).show();
        Log.d("Lab4", "Toast has been shown");
    }

    public void showSnackbar(View v1){
        Snackbar.make(v1,"This is the SNACKBAR!", Snackbar.LENGTH_LONG).show();
        Log.d("Lab4", "SNACKBAR has been shown");
    }
}

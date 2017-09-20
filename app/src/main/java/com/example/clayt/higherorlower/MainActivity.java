package com.example.clayt.higherorlower;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int n;

    public void makeToast(String string) {

        Toast.makeText(this, string, Toast.LENGTH_SHORT).show();

    }

    public void guess(View v) {

        EditText num = (EditText) findViewById(R.id.enterNumber);

        int userGuess = Integer.parseInt(num.getText().toString());

        if (userGuess > n) {

            makeToast("Lower");

        } else if (userGuess < n) {

            makeToast("Higher");

        } else {

            makeToast("You got it! Try again!");

            Random r = new Random();

            n = r.nextInt(20) + 1;

        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Random r = new Random();

        n = r.nextInt(20) + 1;
    }
}

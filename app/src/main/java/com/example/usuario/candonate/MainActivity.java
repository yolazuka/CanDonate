package com.example.usuario.candonate;

import android.app.ActionBar;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import static com.example.usuario.candonate.R.id.button_go_test;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonToQuizz = (Button) findViewById(R.id.button_go_test);
        buttonToQuizz.setOnClickListener(new View.OnClickListener() {

            @Override public void onClick(View v) {
            Intent intent = new Intent (v.getContext(),Activity_Quizz.class);
            startActivityForResult(intent, 0); } });     }
}

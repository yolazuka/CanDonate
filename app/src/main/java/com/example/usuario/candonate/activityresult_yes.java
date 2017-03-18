package com.example.usuario.candonate;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import static com.example.usuario.candonate.R.string.email_header;

public class activityresult_yes extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activityresult_yes);
    }


    EditText userName = (EditText) findViewById(R.id.name);
    String user_Name = userName.getText().toString();

    EditText emailAddress = (EditText) findViewById(R.id.email_address);
    String email_Address = emailAddress.getText().toString();

    EditText userAge = (EditText) findViewById(R.id.age);
    String user_Age = userAge.getText().toString();

    TextView testResume =(TextView) findViewById(R.id.testresume);
    String resumenDeTest = testResume.getText().toString();

    public void send_results_mail (View view){

        /***Create the strings for the test details  */

        String resumenDeTest = getString(R.string.email_header) + "\n" + getString(R.string.amount_incompatibilities) + Activity_Quizz.totalScore +"\n" + getString(R.string.Thank_you);

    /* Create an intent in order to get the order in an opened email, where the mail body is the
        test Resume and the subject is an specific one
         */

        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto:" + email_Address)); // only email apps should handle this*
        intent.putExtra(Intent.EXTRA_SUBJECT, getString(R.string.Subject));
        intent.putExtra(Intent.EXTRA_TEXT, resumenDeTest);

        /* We write the line below to avoid the Crash just in case the app can not find a proper
        external app
       */
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }
}

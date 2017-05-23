package com.example.usuario.candonate;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class activityresult_yes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activityresult_yes);
    }

    public void send_results_mail(View view) {

        /***Creates the strings for the test details that will go into the email  */

        String resumenDeTest = getString(R.string.email_header) + " " + getIntent().getExtras().getString("Name") + "\n" + getString(R.string.age) + " " + getIntent().getExtras().getString("Age") + "\n" + getString(R.string.amount_incompatibilities) + " " + Activity_Quizz.totalScore + "\n" + getString(R.string.Thank_you);

        /***Creates the email including all the parameters  */

        Intent SendToEmail = new Intent(Intent.ACTION_SENDTO);
        SendToEmail.setData(Uri.parse("mailto:" + getIntent().getExtras().getString("Email"))); // only email apps should handle this*
        SendToEmail.putExtra(Intent.EXTRA_SUBJECT, getString(R.string.Subject) + " " + getIntent().getExtras().get("Name"));
        SendToEmail.putExtra(Intent.EXTRA_TEXT, resumenDeTest);

        /* We write the line below to avoid the Crash just in case the app can not find a proper
        external app*/

        if (SendToEmail.resolveActivity(getPackageManager()) != null) {
            startActivity(SendToEmail);
        }
    }

    public void buttonToFindCenters(View view) {

        Intent goToMap = new Intent(Intent.ACTION_VIEW);
        goToMap.setData(Uri.parse("https://www.google.es/maps/search/centro+donacion+sangre/@37.8180688,-1.4733224,5z/data=!3m1!4b1?hl=es"));
        startActivity(goToMap);

        /* We write the line below to avoid the Crash just in case the app can not find a proper
        external app*/

        if (goToMap.resolveActivity(getPackageManager()) != null) {
            startActivity(goToMap);
        }
    }

    /**
     * Button to go the quiz app and repet the test. Reset the totalscore to zero
     **/
    public void buttonToBackToQuizz(View view) {

        Activity_Quizz.totalScore = 0;
        Intent goToQuizz = new Intent(this, Activity_Quizz.class);
        startActivity(goToQuizz);

    }

}





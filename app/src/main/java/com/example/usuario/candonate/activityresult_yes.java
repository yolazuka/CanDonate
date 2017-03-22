package com.example.usuario.candonate;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import static com.example.usuario.candonate.R.string.Subject;
import static com.example.usuario.candonate.R.string.name;

public class activityresult_yes extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activityresult_yes);
    }

    public void send_results_mail (View view) {

        /* Create an intent in order to get the parameters from the Activity_Quizz.java
         */

        Intent GoToResultYes = getIntent();
        Bundle bundle = GoToResultYes.getExtras();

        /***Create the strings for the test details that will go into the email  */

        String resumenDeTest = getString(R.string.email_header) + "Age: " + bundle.getInt("Age") + "\n" + getString(R.string.amount_incompatibilities) + Activity_Quizz.totalScore + "\n" + getString(R.string.Thank_you);

        /***Create the intent for the email including all the parameters  */

        Intent SendToEmail = new Intent(Intent.ACTION_SENDTO);
        SendToEmail.setData(Uri.parse("mailto:" + bundle.getString("Email"))); // only email apps should handle this*
        SendToEmail.putExtra(Intent.EXTRA_SUBJECT, getString(R.string.Subject) + bundle.getString("Nombre"));
        SendToEmail.putExtra(Intent.EXTRA_TEXT, resumenDeTest);

        /* We write the line below to avoid the Crash just in case the app can not find a proper
        external app*/

        if (SendToEmail.resolveActivity(getPackageManager()) != null) {
            startActivity(SendToEmail);
        }
    }


    public void buttonToFindCenters (View view) {

            Intent goToMap = new Intent(Intent.ACTION_VIEW);
            goToMap.setData(Uri.parse("https://www.google.es/maps/search/centro+donacion+sangre/@37.8180688,-1.4733224,5z/data=!3m1!4b1?hl=es"));
            startActivity(goToMap);

        /* We write the line below to avoid the Crash just in case the app can not find a proper
        external app*/

        if (goToMap.resolveActivity(getPackageManager()) != null) {
            startActivity(goToMap);
        }
    }

}





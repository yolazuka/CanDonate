package com.example.usuario.candonate;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import static android.provider.AlarmClock.EXTRA_MESSAGE;
import static java.security.AccessController.getContext;

public class Activity_Quizz extends AppCompatActivity {

    /**Variable used on the app */

    private static final String TOTAL_TEST_SCORE = "Total_Score";
    public static int totalScore = 0;
    public EditText user_Age;
    public EditText email_Address;
    public EditText user_Name;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__quizz);

        /**Reference to the layouts objects */

        Button Check_results =(Button) findViewById(R.id.button_check_results);
        EditText userName = (EditText) findViewById(R.id.name);
        String user_Name = userName.getText().toString();
        EditText emailAddress = (EditText) findViewById(R.id.email_address);
        String email_Address = emailAddress.getText().toString();
        EditText userAge = (EditText) findViewById(R.id.age);
        String user_Age = userAge.getText().toString();


    }

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        // Save the current state

        savedInstanceState.putInt(TOTAL_TEST_SCORE, totalScore);

        // Always call the superclass so it can save the view hierarchy state
        super.onSaveInstanceState(savedInstanceState);
    }

    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState) {
        // Always call the superclass so it can restore the view hierarchy
        super.onRestoreInstanceState(savedInstanceState);


        // Restore state members from saved instance
        totalScore = savedInstanceState.getInt(TOTAL_TEST_SCORE);

    }


    public void onClickQuestionOne(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.Q1yes:
                if (checked) {
                    totalScore = totalScore + 1;
                }
                break;
            case R.id.Q1no:
                if (checked) {
                    totalScore = totalScore + 0;
                }
        }

    }

    public void onClickQuestionTwo(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.Q2yes:
                if (checked) {
                    totalScore = totalScore + 1;
                }
                break;
            case R.id.Q2no:
                if (checked) {
                    totalScore = totalScore + 0;
                }
        }
    }

    public void onClickQuestionThree(View view) {
        boolean checked = ((CheckBox) view).isChecked();
        switch (view.getId()) {
            case R.id.ans1Q3:
                if (checked) {
                    totalScore = totalScore + 1;
                } else {

                    totalScore = totalScore + 0;
                }
            case R.id.ans2Q3:
                if (checked) {
                    totalScore = totalScore + 1;
                } else {

                    totalScore = totalScore + 0;
                }

            case R.id.ans3Q3:
                if (checked) {
                    totalScore = totalScore + 1;
                } else {

                    totalScore = totalScore + 0;
                }

            case R.id.ans4Q3:
                if (checked) {
                    totalScore = totalScore + 1;
                } else {

                    totalScore = totalScore + 0;
                }

            case R.id.ans5Q3:
                if (checked) {
                    totalScore = totalScore + 1;
                } else {

                    totalScore = totalScore + 0;
                }

            case R.id.ans6Q3:
                if (checked) {
                    totalScore = totalScore + 1;
                } else {

                    totalScore = totalScore + 0;
                }

            case R.id.ans7Q3:
                if (checked) {
                    totalScore = totalScore + 1;
                } else {

                    totalScore = totalScore + 0;
                }

            case R.id.ans8Q3:
                if (checked) {
                    totalScore = totalScore + 1;
                } else {

                    totalScore = totalScore + 0;
                }

            case R.id.ans9Q3:
                if (checked) {
                    totalScore = totalScore + 1;
                } else {

                    totalScore = totalScore + 0;
                }

            case R.id.ans10Q3:
                if (checked) {
                    totalScore = totalScore + 1;
                } else {

                    totalScore = totalScore + 0;
                }

            case R.id.ans11Q3:
                if (checked) {
                    totalScore = totalScore + 1;
                } else {

                    totalScore = totalScore + 0;
                }


        }
    }

    public void onClickQuestionFour(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.Q4yes:
                if (checked) {
                    totalScore = totalScore + 1;
                }
                break;
            case R.id.Q4no:
                if (checked) {
                    totalScore = totalScore + 0;
                }
        }
    }

    public void onClickQuestionFive(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.Q5yes:
                if (checked) {
                    totalScore = totalScore + 1;
                }
                break;
            case R.id.Q5no:
                if (checked) {
                    totalScore = totalScore + 0;
                }
        }
    }

    public void onClickQuestionSix(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.Q6yes:
                if (checked) {
                    totalScore = totalScore + 1;
                }
                break;
            case R.id.Q6no:
                if (checked) {
                    totalScore = totalScore + 0;
                }
        }
    }

    public void onClickQuestionSeven(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.Q7yes:
                if (checked) {
                    totalScore = totalScore + 1;
                }
                break;
            case R.id.Q7no:
                if (checked) {
                    totalScore = totalScore + 0;
                }
        }
    }

    public void onClickQuestionEight(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.Q8yes:
                if (checked) {
                    totalScore = totalScore + 1;
                }
                break;
            case R.id.Q8no:
                if (checked) {
                    totalScore = totalScore + 0;
                }
        }
    }

    public void onClickQuestionNine(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.Q9yes:
                if (checked) {
                    totalScore = totalScore + 1;
                }
                break;
            case R.id.Q9no:
                if (checked) {
                    totalScore = totalScore + 0;
                }
        }
    }

    public void onClickQuestionTen(View view) {
        boolean checked = ((CheckBox) view).isChecked();
        switch (view.getId()) {
            case R.id.ans1Q10:
                if (checked) {
                    totalScore = totalScore + 1;
                } else {

                    totalScore = totalScore + 0;
                }
            case R.id.ans2Q10:
                if (checked) {
                    totalScore = totalScore + 0;
                } else {

                    totalScore = totalScore + 0;
                }

            case R.id.ans3Q10:
                if (checked) {
                    totalScore = totalScore + 1;
                } else {

                    totalScore = totalScore + 0;
                }

            case R.id.ans4Q10:
                if (checked) {
                    totalScore = totalScore + 0;
                } else {

                    totalScore = totalScore + 0;
                }

            case R.id.ans5Q10:
                if (checked) {
                    totalScore = totalScore + 0;
                } else {

                    totalScore = totalScore + 0;
                }
        }
    }


    /*** This method is called when the button "CHECK THE RESULTS" is clicked **/

    public void Check_results(View view) {


        String mensajeTestnegativo = "You have declared " + totalScore + "incompatibilities with blood donation, sorry!";
        String mensajeTestpositivo = " Congratulations you dont have incompatibilities, you can donate!";

        if (totalScore >= 1) {

            //*** Displays the test result on the toast */
            Toast.makeText(this, mensajeTestnegativo, Toast.LENGTH_LONG).show();


            //*** It takes you to the screen activity_result_no */

            Intent GoToresultNo = new Intent(this, activity_result_no.class);
            Bundle bundle = new Bundle();
            bundle.putString("Name", user_Name.getText().toString());
            bundle.putString("Email", email_Address.getText().toString());
            bundle.putInt("Age", 0);
            startActivity(GoToresultNo);


        } else {

            //*** Displays the test result on the toast */
            Toast.makeText(this, mensajeTestpositivo, Toast.LENGTH_LONG).show();

            //*** It takes you to the screen activityresult_yes */

            Intent GoToResultYes = new Intent(this, activityresult_yes.class);
            Bundle bundle = new Bundle();
            bundle.putString("Name", user_Name.getText().toString());
            bundle.putString("Email", email_Address.getText().toString());
            bundle.putInt("Age", 0);
            startActivity(GoToResultYes);

        }


        Button buttonToBackToMain = (Button) findViewById(R.id.button_back);
        buttonToBackToMain.setOnClickListener(new View.OnClickListener() {

            @Override public void onClick(View v) {
            Intent intent2 = new Intent (v.getContext(), MainActivity.class);
            startActivityForResult(intent2, 0); } });     }

}



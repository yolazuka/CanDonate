package com.example.usuario.candonate;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Activity_Quizz extends AppCompatActivity {

    private static final String TOTAL_TEST_SCORE = "Total_Score";
    public static int totalScore = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__quizz);

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
            return;

            //*** It takes you to the screen Activityresult_no */
            Intent intent1 = new Intent(v.getContext(), activity_result_no.class);
            startActivityForResult(intent1, 0);

        } else {

            //*** Displays the test result on the toast */
            Toast.makeText(this, mensajeTestpositivo, Toast.LENGTH_LONG).show();
            return;
            //*** It takes you to the screen Activityresult_yes */
            Intent intent3 = new Intent(v.getContext(), activityresult_yes.class);
            startActivityForResult(intent3, 0);


        }


        Button buttonToBackToMain = (Button) findViewById(R.id.button_back);
        buttonToBackToMain.setOnClickListener(new View.OnClickListener() {

            @Override public void onClick(View v) {
            Intent intent2 = new Intent (v.getContext(), MainActivity.class);
            startActivityForResult(intent2, 0); } });     }

}



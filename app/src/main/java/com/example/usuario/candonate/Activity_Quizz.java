package com.example.usuario.candonate;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class Activity_Quizz extends AppCompatActivity {

    /**
     * Variable used on the app
     */

    private static final String TOTAL_TEST_SCORE = "Total_Score";
    public static int totalScore = 0;
    Test test;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__quizz);
        test = new Test();

        /**Reference to the layouts objects */

        Button Check_results = (Button) findViewById(R.id.button_check_results);

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
                break;
        }
        test.setPregunta1(true);

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
                break;
        }
        test.setPregunta2(true);
    }

    public void onClickQuestionThree(View view) {
        boolean checked = ((CheckBox) view).isChecked();
        switch (view.getId()) {
            case R.id.ans1Q3:
                if (checked) {
                    totalScore = totalScore + 1;

                }

                break;

            case R.id.ans2Q3:
                if (checked) {
                    totalScore = totalScore + 1;

                }

                break;

            case R.id.ans3Q3:
                if (checked) {
                    totalScore = totalScore + 1;

                }

                break;

            case R.id.ans4Q3:
                if (checked) {
                    totalScore = totalScore + 1;

                }

                break;

            case R.id.ans5Q3:
                if (checked) {
                    totalScore = totalScore + 1;

                }

                break;

            case R.id.ans6Q3:
                if (checked) {
                    totalScore = totalScore + 1;

                }

                break;

            case R.id.ans7Q3:
                if (checked) {
                    totalScore = totalScore + 1;

                }

                break;

            case R.id.ans8Q3:
                if (checked) {
                    totalScore = totalScore + 1;


                }

                break;

            case R.id.ans9Q3:
                if (checked) {
                    totalScore = totalScore + 1;

                    break;
                }

            case R.id.ans10Q3:
                if (checked) {
                    totalScore = totalScore + 1;

                }

                break;

            case R.id.ans11Q3:
                if (checked) {
                    totalScore = totalScore + 1;

                }

                break;

            case R.id.ans12Q3:
                if (checked) {
                    totalScore = totalScore + 0;

                }

                break;

        }
        test.setPregunta3(true);
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
        test.setPregunta4(true);
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
        test.setPregunta5(true);
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
        test.setPregunta6(true);
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
        test.setPregunta7(true);
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
        test.setPregunta8(true);
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
        test.setPregunta9(true);
    }

    public void onClickQuestionTen(View view) {
        boolean checked = ((CheckBox) view).isChecked();
        switch (view.getId()) {
            case R.id.ans1Q10:
                if (checked) {
                    totalScore = totalScore + 1;

                }

                break;


            case R.id.ans3Q10:
                if (checked) {
                    totalScore = totalScore + 1;

                }

                break;

        }
        test.setPregunta10(true);
    }

    /*** This method is called when the button "CHECK THE RESULTS" is clicked **/

    public void Check_results(View view) {

        if (test.todasContestadas()) {

            String mensajeTestnegativo = "You have declared " + totalScore + "incompatibilities with blood donation, sorry!";
            String mensajeTestpositivo = " Congratulations you dont have incompatibilities, you can donate!";

            //** Declare and link with xml the EditText content  *//

            EditText userName = (EditText) findViewById(R.id.name);
            EditText emailAddress = (EditText) findViewById(R.id.email_address);
            EditText userAge = (EditText) findViewById(R.id.age);

            if (totalScore >= 1) {

                //*** Displays the test result on the toast */
                Toast.makeText(this, mensajeTestnegativo, Toast.LENGTH_LONG).show();

                //*** It takes you to the screen activity_result_no */

                Intent GoToresultNo = new Intent(this, activity_result_no.class);

                //**Store the values into a key and string **//
                GoToresultNo.putExtra("Name", userName.getText().toString());
                GoToresultNo.putExtra("Email", emailAddress.getText().toString());
                GoToresultNo.putExtra("Age", userAge.getText().toString());

                startActivity(GoToresultNo);

            } else {

                //*** Displays the test result on the toast */
                Toast.makeText(this, mensajeTestpositivo, Toast.LENGTH_LONG).show();

                //*** It takes you to the screen activityresult_yes */

                Intent GoToResultYes = new Intent(this, activityresult_yes.class);
                //**Store the values into a key and string **//
                GoToResultYes.putExtra("Name", userName.getText().toString());
                GoToResultYes.putExtra("Email", emailAddress.getText().toString());
                GoToResultYes.putExtra("Age", userAge.getText().toString());

                startActivity(GoToResultYes);

            }

        } else {

            Toast.makeText(this, getString(R.string.text_not_all_checked), Toast.LENGTH_LONG).show();

        }

        Button buttonToBackToMain = (Button) findViewById(R.id.button_back);
        buttonToBackToMain.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(v.getContext(), MainActivity.class);
                startActivity(intent2);
            }
        });

    }

    public class Test {

        //** Check if all the questions have been replied **//
        private boolean pregunta1, pregunta2, pregunta3, pregunta4, pregunta5, pregunta6, pregunta7, pregunta8, pregunta9, pregunta10;

        public Test() {
            pregunta1 = false;
            pregunta2 = false;
            pregunta3 = false;
            pregunta4 = false;
            pregunta5 = false;
            pregunta6 = false;
            pregunta7 = false;
            pregunta8 = false;
            pregunta9 = false;
            pregunta10 = false;
        }

        public void setPregunta1(boolean contestada) {
            pregunta1 = contestada;
        }

        public void setPregunta2(boolean contestada) {
            pregunta2 = contestada;
        }

        public void setPregunta3(boolean contestada) {
            pregunta3 = contestada;
        }

        public void setPregunta4(boolean contestada) {
            pregunta4 = contestada;
        }

        public void setPregunta5(boolean contestada) {
            pregunta5 = contestada;
        }

        public void setPregunta6(boolean contestada) {
            pregunta6 = contestada;
        }

        public void setPregunta7(boolean contestada) {
            pregunta7 = contestada;
        }

        public void setPregunta8(boolean contestada) {
            pregunta8 = contestada;
        }

        public void setPregunta9(boolean contestada) {
            pregunta9 = contestada;
        }

        public void setPregunta10(boolean contestada) {
            pregunta10 = contestada;
        }

        public boolean todasContestadas() {
            boolean todasLasPreguntasContestadas = false;
            if (pregunta1 && pregunta2 && pregunta3 && pregunta4 && pregunta5 && pregunta6 && pregunta7 && pregunta8 && pregunta9 && pregunta10) {
                todasLasPreguntasContestadas = true;
            } else {
                todasLasPreguntasContestadas = false;
            }
            return todasLasPreguntasContestadas;
        }

    }

}



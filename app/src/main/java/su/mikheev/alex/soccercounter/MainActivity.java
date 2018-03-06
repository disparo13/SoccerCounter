package su.mikheev.alex.soccercounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;
    int warnTeamA = 0;
    int penaltyTeamA = 0;
    int warnTeamB = 0;
    int penaltyTeamB = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayScoreForTeamA(scoreTeamA);
        displayScoreForTeamB(scoreTeamB);
        displayWarnsForTeamA(warnTeamA);
        displayWarnsForTeamB(warnTeamB);
        displayPenaltiesForTeamA(penaltyTeamA);
        displayPenaltiesForTeamB(penaltyTeamB);
    }

    /**
     * This method is called when the score button for Team A is clicked.
     */
    public void scoreForTeamA(View view) {
        scoreTeamA = scoreTeamA + 1;
        displayScoreForTeamA(scoreTeamA);
    }

    /**
     * This method is called when the score button for Team B is clicked.
     */
    public void scoreForTeamB(View view) {
        scoreTeamB = scoreTeamB + 1;
        displayScoreForTeamB(scoreTeamB);
    }


    /**
     * This method is called when the warning button for team A is clicked.
     */
    public void warnForTeamA(View view) {
        warnTeamA = warnTeamA + 1;
        displayWarnsForTeamA(warnTeamA);
    }

    /**
     * This method is called when the warning button for Team B is clicked.
     */
    public void warnForTeamB(View view) {
        warnTeamB = warnTeamB + 1;
        displayWarnsForTeamB(warnTeamB);
    }


    /**
     * This method is called when the penalty button for Team A is clicked.
     */
    public void penaltyForTeamA(View view) {
        penaltyTeamA = penaltyTeamA + 1;
        displayPenaltiesForTeamA(penaltyTeamA);
    }

    /**
     * This method is called when the penalty button for Team B is clicked.
     */
    public void penaltyForTeamB(View view) {
        penaltyTeamB = penaltyTeamB + 1;
        displayPenaltiesForTeamB(penaltyTeamB);
    }

    /**
     * Reset scores and penalties
     */
    public void resetScores(View view) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        warnTeamA = 0;
        penaltyTeamA = 0;
        warnTeamB = 0;
        penaltyTeamB = 0;
        displayScoreForTeamA(scoreTeamA);
        displayScoreForTeamB(scoreTeamB);
        displayWarnsForTeamA(warnTeamA);
        displayWarnsForTeamB(warnTeamB);
        displayPenaltiesForTeamA(penaltyTeamA);
        displayPenaltiesForTeamB(penaltyTeamB);

    }

    /**
     * Displays the given score for Team A.
     */
    public void displayScoreForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayScoreForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Display the given warns for Team A
     */
    public void displayWarnsForTeamA(int warnTeamA) {
        TextView warnView = (TextView) findViewById(R.id.team_a_warns);
        warnView.setText(String.valueOf(warnTeamA));
    }

    /**
     * Display the given warns for Team B
     */
    public void displayWarnsForTeamB(int warnTeamB) {
        TextView warnView = (TextView) findViewById(R.id.team_b_warns);
        warnView.setText(String.valueOf(warnTeamB));
    }

    /**
     * Display the given penalties for Team A
     */
    public void displayPenaltiesForTeamA(int penaltyTeamA) {
        TextView penalView = (TextView) findViewById(R.id.team_a_penalties);
        penalView.setText(String.valueOf(penaltyTeamA));
    }

    /**
     * Display the given penalties for Team B
     */
    public void displayPenaltiesForTeamB(int penaltyTeamB) {
        TextView penalView = (TextView) findViewById(R.id.team_b_penalties);
        penalView.setText(String.valueOf(penaltyTeamB));
    }

}

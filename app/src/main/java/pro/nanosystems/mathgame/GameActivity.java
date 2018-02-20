package pro.nanosystems.mathgame;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;

public class GameActivity extends AppCompatActivity {
      TextView partA, partB;
      int mPartA, mPartB, mCorrectAnswer, mWrongAnswer1, mWrongAnswer2;
      Button mAnswer1, mAnswer2, mAnswer3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        mPartA = 5;
        mPartB = 6;
        mCorrectAnswer = mPartA * mPartB;
        mWrongAnswer1 = mCorrectAnswer -1;
        mWrongAnswer2= mCorrectAnswer +1;
        partA = findViewById(R.id.partAView);
        partA.setText(mPartA + "");


        partB = findViewById(R.id.partBView);
        partB.setText(mPartB + "");

        mAnswer1 = findViewById(R.id.answer1);
        mAnswer1.setText(mCorrectAnswer + "");
        mAnswer2 = findViewById(R.id.answer2);
        mAnswer2.setText(mWrongAnswer2 + "");
        mAnswer3 = findViewById(R.id.answer3);
        mAnswer3.setText(mWrongAnswer1 + "");

    }
}

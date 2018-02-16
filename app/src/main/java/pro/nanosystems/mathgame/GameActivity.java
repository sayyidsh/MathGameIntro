package pro.nanosystems.mathgame;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class GameActivity extends AppCompatActivity {
      TextView partA, partB;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        partA = findViewById(R.id.partAView);
        partA.setText("8");

        partB = findViewById(R.id.partBView);
        partB.setText("2");

    }
}

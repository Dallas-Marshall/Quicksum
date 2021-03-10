package au.edu.jcu.cp3406.quicksum;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private int sum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buttonClicked(View view) {
        Button button = (Button) view;
        int number = Integer.parseInt(button.getText().toString());
        sum += number;

        TextView sumDisplay = findViewById(R.id.sum);
        String result = "" + sum;
        sumDisplay.setText(result);
    }

    public void clearSumDisplay(View view) {
        TextView sumDisplay = findViewById(R.id.sum);
        sum = 0;
        String result = "0";
        sumDisplay.setText(result);
    }
}
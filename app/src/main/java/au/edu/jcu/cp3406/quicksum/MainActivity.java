package au.edu.jcu.cp3406.quicksum;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

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
}
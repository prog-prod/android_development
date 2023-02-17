package it_school.sumdu.edu.counterhomework;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int count = 0;
    protected TextView countView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        countView = (TextView) findViewById(R.id.countTextView);

    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        // put string value
        outState.putInt("count", count);
        super.onSaveInstanceState(outState);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        count = savedInstanceState.getInt("count");
        countView.setText(Integer.toString(count));

        super.onRestoreInstanceState(savedInstanceState);
    }

    public void increaseCount(View view) {
        count++;
        if(countView != null) {
            countView.setText(Integer.toString(count));
        }
    }
}
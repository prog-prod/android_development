package it_school.sumdu.edu.hellotoast;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SayHello extends AppCompatActivity {

    @SuppressLint("SetTextI18n")
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.say_hello);
        TextView textCount = findViewById(R.id.textViewCount);
        int count = getIntent().getIntExtra("mCount", 0);
        textCount.setText(Integer.toString(count));
    }
}

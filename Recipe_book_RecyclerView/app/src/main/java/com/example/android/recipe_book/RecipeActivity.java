package com.example.android.recipe_book;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class RecipeActivity extends AppCompatActivity {

    ImageView iv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recipe);
        iv = findViewById(R.id.imageView);
        Bundle extras = getIntent().getExtras();
        setTitle(extras.get("head").toString());
        int drawableId = this.getResources().getIdentifier(extras.get("image").toString(), "drawable", getApplicationContext().getPackageName());
        iv.setImageResource(drawableId);
        TextView textrecipeFull = (TextView) findViewById(R.id.recipeFull);
        textrecipeFull.setText(extras.get("content").toString());
    }
}
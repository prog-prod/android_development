package space.game.drawabletest;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private int chargedOn = 0;
    private Drawable battery;
    private ImageView batteryImg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        batteryImg = findViewById(R.id.imageView);
        batteryImg.setImageLevel(chargedOn);
    }


    public void decreaseBattery(View view) {
        // Get the ID of the button that was clicked.
        int viewID = view.getId();
        if(chargedOn > 0){
            chargedOn -= 1;
            batteryImg.setImageLevel(chargedOn);
            Log.d("", ""+chargedOn);
        }
    }

    public void increaseBattery(View view) {
        // Get the ID of the button that was clicked
        int viewID = view.getId();

        if(chargedOn < 7) {
            chargedOn += 1;
            batteryImg.setImageLevel(chargedOn);
            Log.d("", ""+chargedOn);
        }
    }
}
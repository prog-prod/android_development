package com.android.checklists;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Button btnShowToast;
    String toastMsg;
    ArrayList<CheckBox> items = new ArrayList();
    CheckBox box1, box2, box3, box4, box5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnShowToast = (Button) findViewById(R.id.show_toast);
        box1 = (CheckBox) findViewById(R.id.checkBox);
        box2 = (CheckBox) findViewById(R.id.checkBox2);
        box3 = (CheckBox) findViewById(R.id.checkBox3);
        box4 = (CheckBox) findViewById(R.id.checkBox4);
        box5 = (CheckBox) findViewById(R.id.checkBox5);
        items.add(box1);
        items.add(box2);
        items.add(box3);
        items.add(box4);
        items.add(box5);
//        System.out.println("qqqqqq----------------");
//        System.out.println(items.get(1));
        for(int i=0;i<5;i++){
            System.out.println(items.get(i).getText().toString());
        }
    }

    public void displayToast(View v) {
        toastMsg = "Toppings: ";
        for(int i=0;i<5;i++){
            System.out.println(items.get(i));
            if (items.get(i).isChecked()) {
                toastMsg+= " " + items.get(i).getText().toString();
            }
        }
        if (toastMsg == "Toppings: ") {
            toastMsg = "No toppings selected";
        }

        Toast.makeText(getApplicationContext(), toastMsg,
                Toast.LENGTH_SHORT).show();
    }

}

package com.example.sherifr2ft.test2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    Button b1,b2,b3,b4;
    String[] s1;
    String[] s2;
    String[] s3;
    String[] s4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        s1 = getResources().getStringArray(R.array.b1);
        s2 = getResources().getStringArray(R.array.b2);
        s3 = getResources().getStringArray(R.array.b3);
        s4 = getResources().getStringArray(R.array.b4);
        b1 = (Button) findViewById(R.id.b1);
        b2 = (Button) findViewById(R.id.b2);
        b3 = (Button) findViewById(R.id.b3);
        b4 = (Button) findViewById(R.id.b4);


    }

    public void addone1(View view) {

        int numtest = Integer.parseInt(s1[1]);
        numtest += 1;
        s1[1] = Integer.toString(numtest);
        b1.setText(s1[0]+" \n " + s1[1]);

    }
    public void addone2(View view) {

        int numtest = Integer.parseInt(s2[1]);
        numtest += 1;
        s2[1] = Integer.toString(numtest);
        b2.setText(s2[0]+" \n " +s2[1]);

    }
    public void addone3(View view) {

        int numtest = Integer.parseInt(s3[1]);
        numtest += 1;
        s3[1] = Integer.toString(numtest);
        b3.setText(s3[0] +" \n " + s3[1]);

    }
    public void addone4(View view) {

        int numtest = Integer.parseInt(s4[1]);
        numtest += 1;
        s4[1] = Integer.toString(numtest);
        b4.setText(s4[0] +" \n " + s4[1]);

    }
}

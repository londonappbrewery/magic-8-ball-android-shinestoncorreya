package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button tellButton;

        tellButton=(Button) findViewById(R.id.askButton);

        final ImageView Ball1=(ImageView) findViewById(R.id.ball1);

        final int[] ballArray={R.drawable.ball1,
        R.drawable.ball2,
        R.drawable.ball3,
        R.drawable.ball4,
        R.drawable.ball5};

        tellButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("8ball","Hiiiiii Button has been pressed");

                Random randomNumberGenerator = new Random();
                int number=randomNumberGenerator.nextInt(5);
                Ball1.setImageResource(ballArray[number]);


            }
        });


    }
}

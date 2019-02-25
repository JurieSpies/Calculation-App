package com.jurie.android.calculationapp;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.TextView;
        import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final TextView num1 = (TextView) findViewById(R.id.number1);
        final TextView num2 = (TextView) findViewById(R.id.number2);
        final TextView total = (TextView) findViewById(R.id.answerText);

        final String[] num1String = {num1.getText().toString()};
        final String[] num2String = {num2.getText().toString()};

        final int[] num1Int = {Integer.parseInt(num1String[0])};
        final int[] num2Int = {Integer.parseInt(num2String[0])};



        // create button listener for generator Button
        Button btnGenerateRandomNumbers = (Button) findViewById(R.id.generateRandomNumbersButton);
        btnGenerateRandomNumbers.setOnClickListener(new View.OnClickListener() {

            // method
            @Override
            public void onClick(View v) {
                Random randm = new Random();

                int number = randm.nextInt(100) + 1;
                num1String[0] = String.valueOf(number);
                num1.setText(num1String[0]);

                int number2 = randm.nextInt(100) + 1;
                num2String[0] = String.valueOf(number2);
                num2.setText(num2String[0]);
            }
        });



        // create button listener for +
        Button btnPlus = (Button) findViewById(R.id.plusButton);
        btnPlus.setOnClickListener(new View.OnClickListener() {

            //set answer of +
            @Override
            public void onClick(View v) {
                total.setText(num1String[0] + "+" + num2String[0] + " = " + (Integer.parseInt(num1String[0]) + Integer.parseInt(num2String[0])) );

            }
        });



        // create button listener for -
        Button btnMinus = (Button)findViewById(R.id.minusButton);
        btnMinus.setOnClickListener(new View.OnClickListener() {

            //set answer of -
            @Override
            public void onClick(View v) {
                total.setText(num1String[0] + "-" + num2String[0] + " = " + (Integer.parseInt(num1String[0]) - Integer.parseInt(num2String[0])) );

            }
        });

    }

}


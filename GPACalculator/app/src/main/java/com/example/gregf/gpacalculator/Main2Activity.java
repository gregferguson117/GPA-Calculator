package com.example.gregf.gpacalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

    }

    public void calculate(View view)
    {

        /////////////////////////////////////////////////////////////////////

        /*                          Credit Hours                   */

        ///////////////////////////////////////////////////////////////////

        EditText editText1 = (EditText) findViewById(R.id.editText2);
        EditText editText2 = (EditText) findViewById(R.id.editText3);
        EditText editText3 = (EditText) findViewById(R.id.editText4);
        EditText editText4 = (EditText) findViewById(R.id.editText5);
        EditText editText5 = (EditText) findViewById(R.id.editText6);
        String data1 = editText1.getText().toString();
        String data2 = editText2.getText().toString();
        String data3 = editText3.getText().toString();
        String data4 = editText4.getText().toString();
        String data5 = editText5.getText().toString();
        int [] arr3 = new int[5];
        int class1 =Integer.parseInt(data1);
        int class2 =Integer.parseInt(data2);
        int class3 =Integer.parseInt(data3);
        int class4 =Integer.parseInt(data4);
        int class5 =Integer.parseInt(data5);
        arr3[0] = class1;
        arr3[1] = class2;
        arr3[2] = class3;
        arr3[3] = class4;
        arr3[4] = class5;

        /////////////////////////////////////////////////////////////////////

        /*                          Letter Grades                       */

        ///////////////////////////////////////////////////////////////////

        EditText editText6 = (EditText) findViewById(R.id.editText7);
        EditText editText7 = (EditText) findViewById(R.id.editText8);
        EditText editText8 = (EditText) findViewById(R.id.editText9);
        EditText editText9 = (EditText) findViewById(R.id.editText10);
        EditText editText10 = (EditText) findViewById(R.id.editText11);
        String data6 = editText6.getText().toString();
        String data7 = editText7.getText().toString();
        String data8 = editText8.getText().toString();
        String data9 = editText9.getText().toString();
        String data10 = editText10.getText().toString();
        int letter_grade1;
        int letter_grade2;
        int letter_grade3;
        int letter_grade4;
        int letter_grade5;
        int [] arr2 = new int[5];

        String [] arr = new String [5];
        arr[0] = data6;
        arr[1] = data7;
        arr[2] = data8;
        arr[3] = data9;
        arr[4] = data10;
        for(int i =0;i<5;i++)
            if (arr[i].equalsIgnoreCase("A")) {
                arr2[i] = 4 * arr3[i];
            } else if (arr[i].equalsIgnoreCase("B")) {
                arr2[i] = 3 * arr3[i];
            } else if (arr[i].equalsIgnoreCase("C")) {
                arr2[i] = 2 * arr3[i];
            } else if (arr[i].equalsIgnoreCase("D")) {
                arr2[i] = 1 * arr3[i];
            } else {
                arr2[i] = 0 * arr3[i];
            }
        letter_grade1 = arr2[0];
        letter_grade2 = arr2[1];
        letter_grade3 = arr2[2];
        letter_grade4 = arr2[3];
        letter_grade5 = arr2[4];


        /////////////////////////////////////////////////////////////////////

        /*                          Calculate GPA                   */

        ///////////////////////////////////////////////////////////////////



        float total_hours = class1 + class2 + class3 + class4 + class5;
        float grade_points = letter_grade1 + letter_grade2 + letter_grade3 + letter_grade4 + letter_grade5;


        float gpa = grade_points/total_hours;
        String display_gpa = Float.toString(gpa);


        TextView textView = findViewById(R.id.textView4);
        textView.setText(display_gpa);



    }
}

package com.example.raynand.htechcalculatorproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button      btndel , btnClear ,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0;
    private  Button     btnDot,btnEquals,btnAdd,btnsubstract,btnMultiply,btndivision;
    private TextView Result,History;
    private String op;
    private Double firstvalue ,secondvalue ,answer;
    private char operator;

   /* private TextView screen;
    private TextView result;
    private String str1,str2,str3,equals,str,sign;
    private Double a,b;
*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        typeCast();

        btnClear.setOnClickListener(this);
        btndel.setOnClickListener(this);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);
        btn0.setOnClickListener(this);
        btnEquals.setOnClickListener(this);
        btnDot.setOnClickListener(this);
        btnAdd.setOnClickListener(this);
        btnsubstract.setOnClickListener(this);
        btndivision.setOnClickListener(this);
        btnMultiply.setOnClickListener(this);


     /*   screen = (TextView)findViewById(R.id.txtHistory);
        result = (TextView) findViewById(R.id.txtResult);
        str = "";

        clear();
    }

    public void delete (View v)
    {

    }
    public void onClick(View v){
        Button button = (Button) v;
        str += button.getText().toString();
        screen.setText(str);
        a = Double.parseDouble(str);
    }
    public void onClickSigns(View v)
    {
        Button button = (Button) v;
        sign = ((Button) v).getText().toString();
        screen.setText(sign);
        str="";
    }
    public void calculate(View v){
        Button button = (Button) v;
        str2 = screen.getText().toString();
        b = Double.parseDouble(str2);
        if (sign .equals("+")){
            equals = a+b+"";
        }
        else if (sign .equals("-")){
            equals = a-b+"";
        }
        else if (sign .equals("X")){
            equals = a*b+"";
         }
        else if (sign .equals("÷")){
            equals = a/b+"";
        }
        else{
            equals = "Something went wrong";
        }
        result.setText(equals);

    }
    public void clear(View v)
    {

        TextView txtHistory = (TextView) findViewById(R.id.txtHistory);
        TextView txtResult = (TextView)findViewById(R.id.txtResult);
        txtHistory.setText("0");
        txtResult.setText("0");


    }

*/

}

    public void typeCast()
    {
        History = (TextView) findViewById(R.id.txtHistory);
        Result = (TextView)findViewById(R.id.txtResult);
        btndel = (Button) findViewById(R.id.btndelete);
        btnClear = (Button) findViewById(R.id.btnc);
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);
        btn5 = (Button) findViewById(R.id.btn5);
        btn6 = (Button) findViewById(R.id.btn6);
        btn7 = (Button) findViewById(R.id.btn7);
        btn8 = (Button) findViewById(R.id.btn8);
        btn9 = (Button) findViewById(R.id.btn9);
        btn0 = (Button) findViewById(R.id.btn0);
        btnDot = (Button) findViewById(R.id.btndot);
        btnEquals = (Button) findViewById(R.id.btnequals);
        btnAdd = (Button) findViewById(R.id.btnadd);
        btnsubstract = (Button) findViewById(R.id.btnsubtract);
        btndivision = (Button) findViewById(R.id.btndivide);
        btnMultiply = (Button) findViewById(R.id.btnmultiply);


    }

    @Override
    public void onClick(View v)
    {

    if (v.getId() == R.id.btn1)
    {
        History.setText(History.getText()+"1");
    }

    else if (v.getId() == R.id.btn2)
        {
            History.setText(History.getText()+"2");
        }

    else    if (v.getId() == R.id.btn3)
        {
            History.setText(History.getText()+"3");
        }

        else if (v.getId() == R.id.btn4)
        {
            History.setText(History.getText()+"4");
        }

        else if (v.getId() == R.id.btn5)
        {
            History.setText(History.getText()+"5");
        }

        else if (v.getId() == R.id.btn6)
        {
            History.setText(History.getText()+"6");
        }
        else if (v.getId() == R.id.btn7)
        {
            History.setText(History.getText()+"7");
        }

        else if (v.getId() == R.id.btn8)
        {
            History.setText(History.getText()+"8");
        }

        else if (v.getId() == R.id.btn9)
        {
            History.setText(History.getText()+"9");
        }

        else if (v.getId() == R.id.btn0)
        {
            History.setText(History.getText()+"0");
        }

        else if (v.getId() == R.id.btndot)
        {
            History.setText(History.getText()+".");
        }

        else if (v.getId() == R.id.btndelete)
        {
        if (!History.getText().toString().equals(""))
        {
            String value = History.getText().toString();


            if (value.length() > 0)
            {
                value = value.substring(0, value.length() - 1);
                History.setText(value);


            }
        }



        }


        else if (v.getId() == R.id.btnc)
    {

        Result.setText("");
        History.setText("");

    }


      else  if (v.getId() == R.id.btnadd)
        {
            firstvalue = Double.parseDouble(History.getText().toString());
            //History.setText("");
            History.setText(History.getText() + "+");
            operator = '+';

        }
        else if (v.getId() == R.id.btnsubtract)
        {
            firstvalue = Double.parseDouble(History.getText().toString());
            operator = '-';
            //History.setText("");
            History.setText(History.getText() + "-");
        }

        else if (v.getId() == R.id.btnmultiply)
        {
            firstvalue = Double.parseDouble(History.getText().toString());
            operator = 'x';
            History.setText("");
            //History.setText(History.getText() + "x");
        }

        else if (v.getId() == R.id.btndivide)
        {
            firstvalue = Double.parseDouble(History.getText().toString());
            operator = '/';
            History.setText("");

            // /History.setText(History.getText() + "/");
        }

        else if (v.getId() == R.id.btnequals)
        {


            //History.getText().toString().split("+");
            secondvalue = Double.parseDouble(History.getText().toString());
            answer = Double.parseDouble(History.getText().toString());



            switch (operator)
            {
                case '+':


                    answer = firstvalue+secondvalue;
                    History.setText(answer+"");
                    //DisplayHistory();

                {

                }
                    break;

                case '-':

                    answer = firstvalue-secondvalue;
                    Result.setText(answer+"");
                    DisplayHistory();
                    break;


                case 'x':

                    answer = firstvalue*secondvalue;
                    Result.setText(answer+"");
                    DisplayHistory();
                    break;


                case '/':

                    answer = firstvalue/secondvalue;
                    Result.setText(answer+"");
                    DisplayHistory();
                    break;

            }
        }
    }


    public void Signout (View v)
    {
        Intent intent = new Intent(MainActivity.this,Login.class);
        startActivity(intent);
        finish();
    }

    public void DisplayHistory()
    {
        History.setText(firstvalue + " " + operator + " " + secondvalue + " = ");


    }



    public  void anotherOne()
    {

        switch (operator)
        {

        }
    }
    }

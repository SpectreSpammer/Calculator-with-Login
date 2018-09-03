package com.example.raynand.htechcalculatorproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.ZoomButtonsController;

import org.w3c.dom.Text;

public class Login extends AppCompatActivity {


    private EditText Username;
    private EditText Password;
    private TextView attempts;
    private Button login;
    private int counter = 5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Username = (EditText)findViewById(R.id.etUsername);
        Password = (EditText)findViewById(R.id.etPassword);
        attempts = (TextView)findViewById(R.id.txtAttempts);
        login = (Button)findViewById(R.id.btnlogin);

        attempts.setText("Login Attempts : 5");
        login.setOnClickListener(   new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 validate(Username.getText().toString(), Password.getText().toString());
            }
        });
    }
    public void clickExit (View v)
    {
        Intent intent = new Intent(Login.this,Login.class);
        startActivity(intent);
        moveTaskToBack(true);
        android.os.Process.killProcess(android.os.Process.myPid());

        System.exit(1);
        finish();

    }


    private void validate (String username , String password)
    {
        if((username .equals("raynand") ) && (password .equals("pogi") ))
        {
            Intent intent = new Intent(Login.this,MainActivity.class);
            startActivity(intent);

        }
        else if ((username .equals("edgar")) && (password .equals("admin123")))
        {
            Intent intent = new Intent(Login.this,MainActivity.class);
            startActivity(intent);
        }

        else if ((username .equals("melvin")) && (password .equals("admin456")))
        {
            Intent intent = new Intent(Login.this,MainActivity.class);
            startActivity(intent);
        }
        else
        {
            counter--;
            attempts.setText("Login Attempts : "+String.valueOf(counter));
            if (counter == 0)
            {
                login.setEnabled(false);
            }
        }
    }
}

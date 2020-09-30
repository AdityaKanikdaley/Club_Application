package com.example.clubpage;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class Login extends AppCompatActivity {

    Button signUp,signIn;
    EditText reg2,password;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        signUp = (Button)findViewById(R.id.signup);
        signIn = (Button)findViewById(R.id.signin);
        reg2 = (EditText)findViewById(R.id.regno_login);
        password = (EditText)findViewById(R.id.password);

        signIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Signing In....",Toast.LENGTH_LONG).show();
            }
        });


        signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1 = new Intent(Login.this,Registration.class);
                startActivity(i1);
                Toast.makeText(getApplicationContext(),"Sign Up Page Opening....",Toast.LENGTH_LONG).show();
            }
        });
    }
}
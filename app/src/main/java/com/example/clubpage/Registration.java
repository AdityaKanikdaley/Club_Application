package com.example.clubpage;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class Registration extends AppCompatActivity {

    EditText reg1,name,dept;
    Button clear,submit;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registration);
        reg1 = (EditText)findViewById(R.id.regno_reg);
        name = (EditText)findViewById(R.id.name);
        dept = (EditText)findViewById(R.id.dept);
        clear = (Button) findViewById(R.id.clear);
        submit = (Button) findViewById(R.id.submit);

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                reg1.setText("");
                name.setText("");
                dept.setText("");
                Toast.makeText(getApplicationContext(), "Cleared ! ", Toast.LENGTH_LONG).show();
            }
        });

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Credentials Saved ! ", Toast.LENGTH_LONG).show();
            }
        });

    }
}
package com.example.clubpage;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static android.telephony.SmsManager.getDefault;

public class Message extends AppCompatActivity {

    TextView tv1;
    EditText sms;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message);

        tv1=(TextView)findViewById(R.id.TextView1);
        sms=(EditText)findViewById(R.id.editTextTextPersonName);

        tv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ActivityCompat.requestPermissions(Message.this,new String[]{Manifest.permission.SEND_SMS}, PackageManager.PERMISSION_GRANTED);
                String phone = "9876543210";

                    try {
                        SmsManager smsManager= getDefault();
                        smsManager.sendTextMessage(phone, null, sms.getText().toString(), null, null );
                        Toast.makeText(getApplicationContext(),"Sent Succesfuly",Toast.LENGTH_LONG).show();
                    }
                    catch (Exception e) {
                        Toast.makeText(getApplicationContext(),"Sending Failed",Toast.LENGTH_LONG).show();
                    }

            }
        });
    }
}
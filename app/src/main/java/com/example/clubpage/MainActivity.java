package com.example.clubpage;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    Button b1,b2;
    TextView tv1;
    ImageView iv1,iv2;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=(Button)findViewById(R.id.reg);
        b2=(Button)findViewById(R.id.login);

        iv1=(ImageView)findViewById(R.id.calling);
        iv2=(ImageView)findViewById(R.id.msg);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1 = new Intent(MainActivity.this,Registration.class);
                startActivity(i1);
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i2 = new Intent(MainActivity.this,Login.class);
                startActivity(i2);
            }
        });

        iv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String number = "9876543210";
                String dial = "tel:" + number;
                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
            }
    });

        iv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    Intent intent = new Intent(MainActivity.this,Message.class);
                    startActivity(intent);
            }
        });


    } // On create end












    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.options,menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()){

            case R.id.wifi_on: {
                WifiManager wifiManager=(WifiManager)getApplicationContext().getSystemService(getApplicationContext().WIFI_SERVICE);
                wifiManager.setWifiEnabled(true);
                Toast.makeText(getApplicationContext(),"Wifi On",Toast.LENGTH_LONG).show();
                return true; }

            case R.id.wifi_off: {
                WifiManager wifiManager=(WifiManager)getApplicationContext().getSystemService(getApplicationContext().WIFI_SERVICE);
                wifiManager.setWifiEnabled(false);
                Toast.makeText(getApplicationContext(),"Wifi Off",Toast.LENGTH_LONG).show();
                return true; }
        }
        return super.onOptionsItemSelected(item);
    }

}
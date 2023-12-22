package com.example.checkinternet;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button button;
    TextView textView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=findViewById(R.id.button);
        textView=findViewById(R.id.textView);



        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ConnectivityManager connectivityManager= (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
                NetworkInfo networkInfo=connectivityManager.getActiveNetworkInfo();

                if(networkInfo!=null && networkInfo.isConnected()){

                    new AlertDialog.Builder(MainActivity.this)
                            .setTitle(" Internet Abale able")
                            .setMessage(" Connet is Internet")
                            .show();
                }else {

                    new AlertDialog.Builder(MainActivity.this)
                            .setTitle("No Internet")
                            .setMessage("please Connet to Internet")
                            .show();




                }



            }
        });




    }
}
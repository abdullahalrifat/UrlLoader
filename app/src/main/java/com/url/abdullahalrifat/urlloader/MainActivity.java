package com.url.abdullahalrifat.urlloader;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button load;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        load=(Button)findViewById(R.id.load);
        load.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getApplicationContext(), DisplayWebPage.class);

                // getting page url
                String page_url = ("www.google.com");
                //Toast.makeText(myContext, page_url, Toast.LENGTH_SHORT).show();
                in.putExtra("page_url", page_url);
                startActivity(in);
            }
        });
    }
}

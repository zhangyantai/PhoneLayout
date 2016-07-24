package com.example.lsx.phonelayout;



import android.content.Intent;

import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    EditText number = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        number = (EditText) findViewById(R.id.edit_txt);
    }

    public void dial(View v) {
        String result = number.getText().toString().trim();
        if (result.equals("") || result == null) {
            Toast.makeText(this, "电话号码不能为空", Toast.LENGTH_LONG).show();
            return;
        }
        Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + result));
        startActivity(intent);
    }



}

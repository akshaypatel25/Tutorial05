package com.rku_18fotca11039.tutorial05;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView txtv;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Bundle bundle  = getIntent().getExtras();

        String fname = bundle.getString("fname");
        String lname = bundle.getString("lname");
        String emailadd  = bundle.getString("email");
        String password  = bundle.getString("password");
        String  select = bundle.getString("branch");
        String  radiobtn = bundle.getString("radio");
        String  scountry  = bundle.getString("City");
        String  checkbox = bundle.getString("status");

            txtv = findViewById(R.id.txtv);

        txtv.setText(fname+"\n"+lname+"\n"+emailadd+"\n"+password+"\n"+select+"\n"+radiobtn+"\n"+scountry+"\n"+checkbox);
    }
}
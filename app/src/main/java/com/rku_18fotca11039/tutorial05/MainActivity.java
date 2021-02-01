package com.rku_18fotca11039.tutorial05;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {

    EditText fname,lname,emailadd,password;
    Button submit;
    RadioGroup sex;
    RadioButton radioButton;
    Spinner spinner;
    CheckBox checkBox;
    Switch branch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fname = findViewById(R.id.edtfname);
        lname = findViewById(R.id.edtlname);
        emailadd = findViewById(R.id.edtemailadd);
        password = findViewById(R.id.edtpassword);
        submit = findViewById(R.id.btnRegister);
        spinner = findViewById(R.id.spinner);
        checkBox = findViewById(R.id.checkBox);
        sex= (RadioGroup)findViewById(R.id.radiosex);
        branch = findViewById(R.id.branch);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int selectdid = sex.getCheckedRadioButtonId();
                radioButton = (RadioButton) findViewById(selectdid);
                String sfname = fname.getText().toString();
                String slname = lname.getText().toString();
                String semailadd = emailadd.getText().toString();
                String spassword = password.getText().toString();
                String City = spinner.getSelectedItem().toString();
                String stat = "";
                String select = "";
                if(branch.isChecked())
                {
                    select = branch.getTextOn().toString();
                }
                else
                {
                    select = branch.getTextOff().toString();
                }
                if(checkBox.isChecked())
                {
                    stat = "Active";
                }
                else
                {
                    stat = "Inactive";
                }

                Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                intent.putExtra("fname",fname.getText().toString());
                intent.putExtra("lname",lname.getText().toString());
                intent.putExtra("email",emailadd.getText().toString());
                intent.putExtra("password",password.getText().toString());
                intent.putExtra("status",stat);
                intent.putExtra("City",City);
                intent.putExtra("radio",radioButton.getText().toString());
                intent.putExtra("branch",select);


                startActivity(intent);
                finish();
            }
        });
    }
}
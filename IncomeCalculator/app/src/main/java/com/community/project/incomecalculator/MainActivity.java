package com.community.project.incomecalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText User;
    EditText Password;
    EditText Mail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        User     = (EditText) findViewById(R.id.EdTe_nameUser);
        Password = (EditText) findViewById(R.id.EdTe_password);
        Mail     = (EditText) findViewById(R.id.EdTe_mail);
    }
    public void onClickResMail(View view){}
    public void onClickRePass(View view){}
    public void onClickResUser(View view){}
}

package com.example.flame.fillup;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SignUp extends AppCompatActivity {

    private EditText name,email,password,confirmPassword;
    private static Button signUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        //initialization of the ui elements

        signUp =(Button) findViewById(R.id.SignUp);

        //action listeners
        signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /**submit data to sql tables*
                 * and open dilog box to confirm progress
                 * negative feedback will note whether passwords match or
                 * if sign up was successful**/

                //

                //dialog box
                //AlertDialog.Builder dialog= new AlertDialog.Builder();
            }
        });
    }
}

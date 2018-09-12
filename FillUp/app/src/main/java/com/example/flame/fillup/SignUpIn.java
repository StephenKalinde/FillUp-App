package com.example.flame.fillup;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SignUpIn extends AppCompatActivity {

    private static Button signUp,loginBtn, fbkBtn,googleplusBtn; //declaring all buttons

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up_in);

        //initialising all ui elements
        signUp= (Button) findViewById(R.id.signUpBtn);


        //onclick actions
        signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SignUpIn.this,SignUp.class));
            }
        });
    }
}

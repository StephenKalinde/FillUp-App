package com.example.flame.fillup;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class SignUp extends AppCompatActivity implements AdapterView.OnItemSelectedListener{

    private EditText name,email,password,confirmPassword;
    private static  Spinner genderSpinner;
    private static Button signUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        //initialization of the ui elements

        signUp =(Button) findViewById(R.id.SignUp);
        name=(EditText) findViewById(R.id.name);
        email=(EditText) findViewById(R.id.emailAdd);
        password=(EditText)findViewById(R.id.password);
        confirmPassword=(EditText) findViewById(R.id.confirmPassword);
        genderSpinner=(Spinner) findViewById(R.id.gender);



        //setting values for gender for the spinner
        ArrayAdapter<CharSequence> adapter=ArrayAdapter.createFromResource(this,R.array.genderValues,android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        genderSpinner.setAdapter(adapter);
        genderSpinner.setOnItemSelectedListener(this);



        //action listeners

        /** submitting sign up details to the server **/
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

                startActivity(new Intent(SignUp.this,HomeScreen.class));
            }
        });
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

        /** setting the selected value **/
            String text=parent.getItemAtPosition(position).toString();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

        /** if value not selected boolean returened**/    }
}

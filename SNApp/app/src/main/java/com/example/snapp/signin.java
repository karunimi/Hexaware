package com.example.snapp;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class signin extends AppCompatActivity {

    private EditText editTextUsername, editTextPassword;
    private Button buttonLogin;
    private CheckBox checkBoxRememberMe;
    private TextView textViewForgotPassword, textViewRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);


                // Initialize views
                editTextUsername = findViewById(R.id.editTextUsername); // Assuming these IDs match the EditTexts
                editTextPassword = findViewById(R.id.editTextPassword);
                buttonLogin = findViewById(R.id.buttonLogin);
                checkBoxRememberMe = findViewById(R.id.checkBoxRememberMe);
                textViewForgotPassword = findViewById(R.id.textViewForgotPassword);
                textViewRegister = findViewById(R.id.textViewRegister);

                // Set click listener for the login button
                buttonLogin.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String username = editTextUsername.getText().toString().trim();
                        String password = editTextPassword.getText().toString().trim();

                        // Default credentials check
                        if (username.equals("user") && password.equals("password")) {
                            // Credentials are correct, navigate to the next activity
                            Intent intent = new Intent(signin.this, home.class); // Replace NextActivity with your actual next activity
                            startActivity(intent);
                            finish();
                        } else {
                            // Show error message
                            Toast.makeText(signin.this, "Invalid credentials! Please try again.", Toast.LENGTH_SHORT).show();
                        }
                    }
                });

                
            }
        }

    }
}
package com.asking.impacton

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class SignupActivity : AppCompatActivity() {

    private lateinit var nameInput: EditText
    private lateinit var emailInput: EditText
    private lateinit var passwordInput: EditText
    private lateinit var signupButton: Button
    private lateinit var loginRedirect: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        nameInput = findViewById(R.id.nameInput)
        emailInput = findViewById(R.id.emailInput)
        passwordInput = findViewById(R.id.passwordInput)
        signupButton = findViewById(R.id.signupButton)
        loginRedirect = findViewById(R.id.loginRedirect)

        signupButton.setOnClickListener {
            // Add sign-up logic here
            val name = nameInput.text.toString()
            val email = emailInput.text.toString()
            val password = passwordInput.text.toString()

            // Example validation
            if (name.isNotEmpty() && email.isNotEmpty() && password.isNotEmpty()) {
                // TODO: Handle user registration (e.g., save user info to server or database)
                // For now, just show a message and go back to login
                // You can implement actual registration logic here
                Toast.makeText(this, "Inscription réussie pour $name!", Toast.LENGTH_SHORT).show()
                finish() // Close signup activity
            } else {
                Toast.makeText(this, "Veuillez remplir tous les champs.", Toast.LENGTH_SHORT).show()
            }
        }

        loginRedirect.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }
    }
}
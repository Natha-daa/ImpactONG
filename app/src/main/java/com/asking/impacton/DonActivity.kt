package com.asking.impacton

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class DonActivity : AppCompatActivity() {

    private lateinit var donationAmountInput: EditText
    private lateinit var donateButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_don)

        donationAmountInput = findViewById(R.id.donationAmountInput)
        donateButton = findViewById(R.id.donateButton)

        donateButton.setOnClickListener {
            val amount = donationAmountInput.text.toString()

            if (amount.isNotEmpty()) {

                // Exemple de message de confirmation
                Toast.makeText(this, "Merci pour votre don de $amount !", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Veuillez saisir un montant valide.", Toast.LENGTH_SHORT).show()
            }
        }
    }
}

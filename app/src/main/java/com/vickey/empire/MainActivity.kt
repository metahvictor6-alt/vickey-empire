package com.vickey.empire

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val titleText: TextView = findViewById(R.id.titleText)
        val openButton: Button = findViewById(R.id.openButton)

        titleText.text = getString(R.string.welcome_text)

        openButton.setOnClickListener {
            Toast.makeText(this, "Welcome to Vickey Empire!", Toast.LENGTH_SHORT).show()

            val url = "https://example.com"
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))

            if (intent.resolveActivity(packageManager) != null) {
                startActivity(intent)
            } else {
                Toast.makeText(this, "No browser found on this device.", Toast.LENGTH_SHORT).show()
            }
        }
    }
}

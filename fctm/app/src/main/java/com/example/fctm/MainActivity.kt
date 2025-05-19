package com.example.fctm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.fctm.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    // Multiline text shown in the Toast
    private val permissionMsg = """
        This app requires access to your camera 
    to simulate the fake camera functionality.

    Please grant camera permission to continue.
    """.trimIndent()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // ---------- ViewBinding setup ----------
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        // ---------------------------------------

        // Optional: set static fake‑camera image (already in XML, but OK to set again)
        binding.fakeCameraPreview.setImageResource(R.drawable.cam)

        // Show Toast when button is pressed
        binding.btnRequestPermission.setOnClickListener {
            Toast.makeText(this, permissionMsg, Toast.LENGTH_LONG).show()
        }

    }
}
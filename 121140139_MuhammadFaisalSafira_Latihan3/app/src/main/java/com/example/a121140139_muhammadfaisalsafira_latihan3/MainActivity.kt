package com.example.a121140139_muhammadfaisalsafira_latihan3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.example.a121140139_muhammadfaisalsafira_latihan3.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding // Variabel binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.textView.text = "Hello, View Binding!"

        binding.showDialogButton.setOnClickListener {
            val customDialog = CustomDialog(this)
            customDialog.show()
        }

        binding.showFragmentButton.setOnClickListener {
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainer, ExampleFragment())
                .commit()
        }
    }
}

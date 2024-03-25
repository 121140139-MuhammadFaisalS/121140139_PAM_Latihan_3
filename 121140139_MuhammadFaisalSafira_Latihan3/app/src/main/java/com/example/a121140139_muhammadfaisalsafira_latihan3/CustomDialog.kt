package com.example.a121140139_muhammadfaisalsafira_latihan3

import android.app.Dialog
import android.content.Context
import android.os.Bundle
import com.example.a121140139_muhammadfaisalsafira_latihan3.databinding.DialogLayoutBinding

class CustomDialog(context: Context) : Dialog(context) {

    private lateinit var binding: DialogLayoutBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DialogLayoutBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.dialogTitle.text = "Custom Dialog"
        binding.dialogButton.setOnClickListener {
            dismiss()
        }
    }
}

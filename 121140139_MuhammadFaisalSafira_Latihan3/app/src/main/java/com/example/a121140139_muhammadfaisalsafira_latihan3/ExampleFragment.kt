package com.example.a121140139_muhammadfaisalsafira_latihan3

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.a121140139_muhammadfaisalsafira_latihan3.databinding.FragmentExampleBinding

class ExampleFragment : Fragment() {

    private lateinit var binding: FragmentExampleBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentExampleBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.textView.text = "Hello from Fragment"
    }
}

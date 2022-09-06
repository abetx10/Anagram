package com.example.anagram

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.EditText
import android.widget.TextView
import com.example.anagram.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    lateinit var edText: EditText
    lateinit var tvAnagram: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        edText = binding.etText
        tvAnagram = binding.tvAnagram


        edText.addTextChangedListener(object : TextWatcher {

            override fun afterTextChanged(s: Editable) {

            }

            override fun beforeTextChanged(
                s: CharSequence, start: Int,
                count: Int, after: Int
            ) {

            }

            override fun onTextChanged(
                s: CharSequence, start: Int,
                before: Int, count: Int
            ) {
//                val anagramText = binding.etText.text.toString()
//                anagram.setText(anagramText)
                val text = binding.etText.text.toString()
                val filter = binding.etFilter.text.toString()
                var anagramText = Reverse()
                tvAnagram.setText(anagramText.reverseAnagram(text, filter))

            }
        })
        
    }

}












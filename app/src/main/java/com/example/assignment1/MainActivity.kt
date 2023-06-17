package com.example.assignment1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.assignment1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener{
            val inputS = binding.inputSField.text.toString()
            val inputT = binding.inputTField.text.toString()
            binding.output.text = minWindow(inputS, inputT)
        }
    }

    private fun minWindow(s: String, t: String): String {
        val freq = IntArray(128){ 0 }
        t.forEach { freq[it.code]++ }

        var res = ""
        var count = t.length
        var l = 0; var r = 0

        while (r < s.length) {
            if (freq[s[r].code]-- > 0) count--

            while (count == 0) {
                if (res.isEmpty() || res.length > r - l + 1) {
                    res = s.substring(l, r + 1)
                }
                if (++freq[s[l++].code] > 0) count++
            }
            r++
        }
        return res
    }
}
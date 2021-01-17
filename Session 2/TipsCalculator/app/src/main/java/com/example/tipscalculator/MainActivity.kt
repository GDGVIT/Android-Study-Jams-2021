package com.example.tipscalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.tipscalculator.databinding.ActivityMainBinding
import java.text.NumberFormat

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.calculateButton.setOnClickListener {
            val inputAmount = binding.costEdittext.text.toString().toDoubleOrNull()

            if (inputAmount == null) {
                binding.tipAmountText.text = ""
                return@setOnClickListener
            }

            val percent = when (binding.serviceRadio.checkedRadioButtonId) {
                R.id.amazing -> 0.20
                R.id.good -> 0.18
                else -> 0.15
            }
            var tipAmount = inputAmount * percent

            if (binding.roundUpSwitch.isChecked) {
                tipAmount = kotlin.math.ceil(tipAmount)
            }

            val formattedTip = NumberFormat.getCurrencyInstance().format(tipAmount)

            binding.tipAmountText.text = "Tip amount: $formattedTip"
        }
    }
}
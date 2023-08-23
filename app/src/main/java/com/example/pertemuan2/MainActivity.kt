package com.example.pertemuan2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.pertemuan2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private var number = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        with(binding) {
            txtNumber.text= number.toString()

            //CHANGE BACKGROUND COLOUR

            txtNumber.setBackgroundResource(R.color.teal_700)

            val email = "sdssa"
            val pass = "pw123"

            btnGetText.setOnClickListener {
                val valueText = editEmail.text.toString()
                //show toast
                Toast.makeText(
                    this@MainActivity,
                    valueText,
                    Toast.LENGTH_SHORT
                ).show()
            }

            btnCount.setOnClickListener {
                number++
                txtNumber.text = number.toString()
            }

            btnToast.setOnClickListener {
                Toast.makeText(this@MainActivity, number.toString(), Toast.LENGTH_SHORT)
            }
        }
    }
}
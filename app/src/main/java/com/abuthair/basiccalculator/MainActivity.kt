package com.abuthair.basiccalculator

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var btnAdd = findViewById<Button>(R.id.btnAdd)
        var btnSub = findViewById<Button>(R.id.btnSub)
        var btnMulti = findViewById<Button>(R.id.btnMulti)
        var EtTextNum1 = findViewById<EditText>(R.id.EtTextNum1)
        var EtTextNum2 = findViewById<EditText>(R.id.EtTextNum2)
        var TvResult = findViewById<TextView>(R.id.TvResult)

        btnAdd.setOnClickListener {
            try {
                var num1 = EtTextNum1.text.toString().toInt()
                var num2 = EtTextNum2.text.toString().toInt()
                var sum = num1 + num2
                TvResult.text = "RESULT : $sum"
            } catch (e: java.lang.NumberFormatException) {
                AlertDialog.Builder(this)
                    .setTitle("Error")
                    .setMessage("PLEASE ENTER A VALID NUMBER")
                    .setPositiveButton("OK",null)
                    .show()
            }


        }

        btnSub.setOnClickListener {
            try {
                var num1 = EtTextNum1.text.toString().toInt()
                var num2 = EtTextNum2.text.toString().toInt()
                var sub = num1 - num2
                TvResult.text = "RESULT : $sub"
            } catch (e: java.lang.NumberFormatException) {
                AlertDialog.Builder(this)
                    .setTitle("Error")
                    .setMessage("PLEASE ENTER A VALID NUMBER")
                    .setPositiveButton("OK",null)

                    .show()
            }
            btnMulti.setOnClickListener {
                try {
                    var num1 = EtTextNum1.text.toString().toInt()
                    var num2 = EtTextNum2.text.toString().toInt()
                    var Mult = num1 * num2
                    TvResult.text = "RESULT : $Mult"
                } catch (e: java.lang.NumberFormatException) {
                    AlertDialog.Builder(this)
                        .setTitle("Error")
                        .setMessage("PLEASE ENTER A VALID NUMBER")
                        .setPositiveButton("OK",null)

                        .show()
                }
            }

        }

    }
}
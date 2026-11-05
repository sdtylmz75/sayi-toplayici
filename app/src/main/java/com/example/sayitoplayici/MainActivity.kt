package com.example.sayitoplayici

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etSayi1 = findViewById<EditText>(R.id.etSayi1)
        val etSayi2 = findViewById<EditText>(R.id.etSayi2)
        val btnTopla = findViewById<Button>(R.id.btnTopla)
        val tvSonuc = findViewById<TextView>(R.id.tvSonuc)

        btnTopla.setOnClickListener {
            val sayi1Str = etSayi1.text.toString()
            val sayi2Str = etSayi2.text.toString()

            if (sayi1Str.isEmpty() || sayi2Str.isEmpty()) {
                tvSonuc.text = "Lütfen her iki sayıyı da girin!"
                return@setOnClickListener
            }

            val sayi1 = sayi1Str.toDoubleOrNull()
            val sayi2 = sayi2Str.toDoubleOrNull()

            if (sayi1 == null || sayi2 == null) {
                tvSonuc.text = "Geçersiz sayı girdiniz!"
                return@setOnClickListener
            }

            val toplam = sayi1 + sayi2
            val sonucMetni = if (toplam == toplam.toLong().toDouble()) {
                toplam.toLong().toString()
            } else {
                toplam.toString()
            }
            tvSonuc.text = "Sonuç: $sonucMetni"
        }
    }
}

package com.example.baklr4

import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        title = "Бак Роман" // Заголовок програми
        setContentView(R.layout.activity_main)

        // Отримуємо елементи за ID
        val textView: TextView = findViewById(R.id.textView)
        val editText: EditText = findViewById(R.id.editText)
        val checkBox: CheckBox = findViewById(R.id.checkBox)
        val button: Button = findViewById(R.id.button)

        // Обробник події для CheckBox
        checkBox.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                Toast.makeText(this, "Ви підтвердили введення!", Toast.LENGTH_SHORT).show()
            }
        }

        // Обробник події для Button
        button.setOnClickListener {
            val inputText = editText.text.toString()
            if (checkBox.isChecked) {
                Toast.makeText(this, "Введений текст: $inputText", Toast.LENGTH_LONG).show()
            } else {
                Toast.makeText(this, "Підтвердьте введення перед відправкою!", Toast.LENGTH_LONG).show()
            }
        }
    }
}

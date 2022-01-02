package ru.gb.lesson1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.FileUtils.copy
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import ru.gb.lesson1.R
import java.util.Collections.copy

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        var btn1: Button = findViewById(R.id.button)
        btn1.setOnClickListener(View.OnClickListener {
            Toast.makeText(this, "Hello world", Toast.LENGTH_SHORT).show()
        })

        var s1 = DataClass("Gachi Boss", 300)

        var txtView: TextView = findViewById(R.id.textView)
        txtView.text = s1.name

        var txtView2: TextView = findViewById(R.id.textView2)
        txtView2.text = s1.number.toString()


        var txtView3: TextView = findViewById(R.id.textView3)
        txtView3.text = Rep.r2.toString()

        for(i in 1..6){
            print("Hi boyz")
        }

        for(i in 6 downTo 1 step 3){
            print("Bye boyz")
        }
    }
}
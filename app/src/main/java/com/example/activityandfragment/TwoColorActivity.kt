package com.example.activityandfragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class TwoColorActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_two_color)

        settingButtons()
    }

    private fun settingButtons() {
        val button_red = findViewById<Button>(R.id.button_red_fragment)
        val button_blue = findViewById<Button>(R.id.button_blue_fragment)

        button_red.setOnClickListener {
            val fragmentTransaction = supportFragmentManager.beginTransaction() // 프래그먼트트랜잭션 객체 리턴
            fragmentTransaction.replace(R.id.frame_layout, RedFragment())
            fragmentTransaction.commit()
        }

        button_blue.setOnClickListener {
            val fragmentTransaction = supportFragmentManager.beginTransaction() // 프래그먼트트랜잭션 객체 리턴
            fragmentTransaction.replace(R.id.frame_layout, BlueFragment())
            fragmentTransaction.commit()
        }
    }
}
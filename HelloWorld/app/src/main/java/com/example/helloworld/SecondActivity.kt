package com.example.helloworld

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.*
import kotlinx.android.synthetic.main.calcualator.*

class SecondActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.calcualator)
        image.setImageResource(R.drawable.farmor)
    }
}


package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.ActionBar
import kotlinx.android.synthetic.main.activity_first.*

class FirstActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)
        val actionBar = supportActionBar
        actionBar!!.hide()
        btn_add.setOnClickListener {
            val strN1 = edt_firstnumber.text.toString()
            if(strN1.isNullOrBlank()){
              edt_firstnumber.requestFocus()
                return@setOnClickListener
            }
            val strN2 = edt_secondnumber.text.toString()
            if(strN2.isNullOrBlank()){
                edt_secondnumber.requestFocus()
                return@setOnClickListener
            }
            val n1 = strN1.toInt()
            val n2 = strN2.toInt()
            val result = n1 + n2
            txt_result.text = "Result: $result"
            
        }
        btn_Subtraction.setOnClickListener {
            var n1 : Int = (edt_firstnumber.text.toString()).toInt()
            var n2 : Int = (edt_secondnumber.text.toString()).toInt()
            val result = n1 + n2
            txt_result.text = result.toString()
        }
    }


}
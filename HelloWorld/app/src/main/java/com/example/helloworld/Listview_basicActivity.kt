package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.*
import kotlinx.android.synthetic.main.activity_listview_basic.*

class Listview_basicActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_listview_basic)
        var name: List<String> = listOf("Tu1","Tu2","Tu3","Tu4","Tu5","Tu6","Tu7","Tu8","Tu9","Tu10","Tu1","Tu2","Tu3","Tu4","Tu5","Tu6","Tu7","Tu8","Tu9","Tu10")
        list_lv.adapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,name)
    }
}
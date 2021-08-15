package com.example.helloworld
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn_first.setOnClickListener {
            val Intent = Intent(applicationContext,FirstActivity::class.java)
            startActivity(Intent)
        }
        btn_second.setOnClickListener {
            val Intent = Intent(applicationContext,SecondActivity::class.java)
            startActivity(Intent)
        }
        btn_listview.setOnClickListener {
                val Intent = Intent(applicationContext,Listview_basicActivity::class.java)
            startActivity(Intent)
        }
        var s1 : Person = Person("Tu",22,"Hung Yen")
      Log.d("ss","name" + s1.getAge())
//        for(i in 0..10){
//            Log.d("aaa","Chao Tu"+i)
//        }
//        var a: Int = 10
//        for(x in 0 until a){
//            Log.d("bbb","Vi tri hien tai"+x)
//        }
//        var b: Int = 5
//        for(y in 0 downTo b){
//            Log.d("ccc", "gia tri lap lai"+y)
//        }
        var c: Int = 10
        for(z in 0..c step 2){
            Log.d("ccc", "so lan thuc hien"+z)
        }

 // mảng
        // cách 1
//        var mangso: IntArray = intArrayOf(1,2,3,4,5,6,7,8,9,10)
//        mangso.get(2)
        // cach 2
//        var mangten: List<String> = listOf("tu","tuan","tien")
//        mangten.get(2)
        // cách 3
//        var mangten: ArrayList<String> = ArrayList()
//        mangten.add("Tu")
//        mangten.add("Tuan")
//        mangten.add("Tien")
//        mangten.set(2,"Phuong")
//        Log.d("aaa",mangten.get(2))
    }

}
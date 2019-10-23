package com.example.kotin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var course= arrayOf("aaa","bbb","ccc")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener() {
            textView.setText("hello")
            checkBox.setOnCheckedChangeListener { compoundButton, b ->
                if (b==true){
                    textView.setText("checked")
                    Toast.makeText(this@MainActivity,"checked",Toast.LENGTH_SHORT).show()
                } else{
                    Toast.makeText(this@MainActivity,"unchecked",Toast.LENGTH_SHORT).show()
                    textView.setText("unchecked")
                }
            }
            var adp=ArrayAdapter(this@MainActivity,android.R.layout.simple_expandable_list_item_1,course)
            list.setAdapter(adp)

        }
    }
}

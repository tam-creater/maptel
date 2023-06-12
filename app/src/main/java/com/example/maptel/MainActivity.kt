package com.example.maptel

import android.content.Intent
import android.content.res.Resources
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    //地図連携関数
    fun map(view: View) {
        //文字列取得
        val res: Resources = resources
        val address: String = res.getString(R.string.map_address)
        //地図インテント
        val intent: Intent = Uri.parse("geo:0,0?q=$address").let { address ->
            Intent(Intent.ACTION_VIEW, address)
        }
        startActivity(intent)
    }
    //電話連携関数
    fun call(view: View) {
        //電話番号取得
        val textInput: EditText = findViewById(R.id.editText1)
        val call: String = textInput.text.toString()
        //電話インテント
        val intent: Intent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:$call"))
        startActivity(intent)
    }
}
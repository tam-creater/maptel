package com.example.maptel

import android.content.Intent
import android.content.res.Resources
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

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
        lateinit var intent: Intent
        intent.action = Intent.ACTION_VIEW
        intent.data = Uri.parse("geo:0,0?q=$address")
        startActivity(intent)
    }
}
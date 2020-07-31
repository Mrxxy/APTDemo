package com.adam.demo.apt

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.adam.demo.annotation.Adam


@Adam(path = "/app/main")
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
package com.example.jitpackproj

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.testlib.ToastClass

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ToastClass.showToast(this, "안녕하세요");
    }
}
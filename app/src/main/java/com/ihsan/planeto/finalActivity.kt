package com.ihsan.planeto


import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class finalActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_final)
        window.decorView.apply { systemUiVisibility=
        View.SYSTEM_UI_FLAG_HIDE_NAVIGATION or View.SYSTEM_UI_FLAG_FULLSCREEN }
    }
}
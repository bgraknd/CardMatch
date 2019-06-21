package com.example.hafizaoyunu2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_lose.*

class LoseActivity : AppCompatActivity(), View.OnClickListener {
    override fun onClick(p0: View?) {
        val intent = Intent(this@LoseActivity, MainActivity::class.java)
        startActivity(intent)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lose)

        bttnAnaSayfa.setOnClickListener(this)

    }
}

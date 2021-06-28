package com.example.provabaglie

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class DetailUserActivity : AppCompatActivity() {
    companion object {
        private const val KEY_USER = "user"
        fun newIntent(context: Context, user: String) : Intent {
            val intent = Intent(context, DetailUserActivity::class.java)
            intent.putExtra(KEY_USER, user)
            return intent
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_user)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        findViewById<View>(R.id.detail_user)
    }
}
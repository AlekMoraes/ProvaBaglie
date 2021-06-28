package com.example.provabaglie

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity(),  Adapter.OnItemClickListener {
    private val userList = ArrayList<User>()
    private val adapter = Adapter(userList, this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.title = "Conversas"

        val recyclerViewHorizontal = findViewById<RecyclerView>(R.id.recycler_Horizontal)
        val recyclerViewVertical = findViewById<RecyclerView>(R.id.recycler_Vertical)
        val count = 0

        recyclerViewHorizontal.adapter = adapter
        recyclerViewHorizontal.layoutManager = GridLayoutManager(this, 3, GridLayoutManager.HORIZONTAL, false)

        recyclerViewVertical.adapter = adapter
        recyclerViewVertical.layoutManager = LinearLayoutManager(this)
    }

    override fun onItemClick(position: Int) {
        startActivity(DetailUserActivity.newIntent(this, user = "ASDF"))
    }
}
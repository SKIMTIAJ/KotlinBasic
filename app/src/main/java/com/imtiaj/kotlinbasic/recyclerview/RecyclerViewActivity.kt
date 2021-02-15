package com.imtiaj.kotlinbasic.recyclerview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.imtiaj.kotlinbasic.R
import com.imtiaj.kotlinbasic.recyclerview.adapter.RecyclerViewAdapter
import com.imtiaj.kotlinbasic.recyclerview.model.User
import kotlinx.android.synthetic.main.activity_recycler_view.*

class RecyclerViewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_view)

        val bundle:Bundle = intent.extras!!
        val title:String = bundle.get("nextActivity").toString()
        caption.setText(title).toString()

        val recyclerView = findViewById(R.id.recyclerView) as RecyclerView

        recyclerView.layoutManager = LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);

        val usersItem = ArrayList<User>();

        usersItem.add(User("Imtiaj", "Arambagh"))
        usersItem.add(User("Asif", "Bolpur"))
        usersItem.add(User("Avoy","Bankura"))
        usersItem.add(User("Maynak","Bankura"))
        usersItem.add(User("alimul","Mursidabad"))
        usersItem.add(User("Miraj", "Bardhman"))
        usersItem.add(User("Sumon", "Bankura"))
        usersItem.add(User("Deiyan","Mednipur"))
        usersItem.add(User("Mostain","Balurghat"))
        usersItem.add(User("Samsul","Mursidabad"))

        val adapter = RecyclerViewAdapter(usersItem)
        recyclerView.adapter = adapter

    }
}
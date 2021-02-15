package com.imtiaj.kotlinbasic.recyclerview.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.imtiaj.kotlinbasic.R
import com.imtiaj.kotlinbasic.recyclerview.model.User
import kotlinx.android.synthetic.main.list_item.view.*

class RecyclerViewAdapter(val userList:ArrayList<User>): RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>() {
    class ViewHolder(itemView:View): RecyclerView.ViewHolder(itemView){
        fun bindItems(user:User){
            val nameItem = itemView.findViewById(R.id.namePerson) as TextView
            val addressItem = itemView.findViewById(R.id.addressPerson) as TextView

            nameItem.setText(user.name)
            addressItem.setText(user.address)
        }

    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerViewAdapter.ViewHolder {
        //TODO("Not yet implemented")
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_item,parent,false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        //TODO("Not yet implemented")
        return userList.size
    }

    override fun onBindViewHolder(holder: RecyclerViewAdapter.ViewHolder, position: Int) {
        //TODO("Not yet implemented")
        holder.bindItems(userList[position])
    }
}
package com.example.w6_kotlin_listview

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageButton
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CustomAdapter(private var list:List<ItemData>): RecyclerView.Adapter<CustomAdapter.MyViewHolder>() {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val contexts = activity.layoutInflater   //layoutInflater laf 1 component, chuyen layout xml thanh view trong layout
        val rowView = contexts.inflate(R.layout.list_item,parent, false)

        val sender = rowView.findViewById<TextView>(R.id.sender)
        val content = rowView.findViewById<TextView>(R.id.content)
        val time = rowView.findViewById<TextView>(R.id.time)
        val symbol = rowView.findViewById<TextView>(R.id.symbol)
        sender.text = list[position].sender
        content.text = list[position].content
        time.text = list[position].time
        symbol.text = list[position].symbol
        return rowView
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)
        return MyViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentItem = list[position]
        holder.
        val appAdapter = CustomAdapter(currentItem.apps as ArrayList<ItemData>)
        holder.childRecyclerView.adapter = appAdapter
    }

    class MyViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val titleDepartment: TextView = itemView.findViewById(R.id.title_department)
        val childRecyclerView: RecyclerView = itemView.findViewById(R.id.child_recyclerView)


    }
}
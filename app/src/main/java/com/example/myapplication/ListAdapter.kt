package com.example.myapplication

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ListAdapter(var dataSet: ArrayList<String>) :
    RecyclerView.Adapter<ListAdapter.ListViewHolder>() {

    class ListViewHolder(view: View) : RecyclerView.ViewHolder(view){
        val tv=view.findViewById<TextView>(R.id.textView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view=LayoutInflater.from(parent.context).inflate(R.layout.item_list,parent,false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        holder.tv.text=dataSet[position]
    }

    override fun getItemCount(): Int = dataSet.size

}
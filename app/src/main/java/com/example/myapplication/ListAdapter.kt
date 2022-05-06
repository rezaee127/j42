package com.example.myapplication

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView

typealias ItemClickHandler=(String)->Unit
class ListAdapter2(var onShowItemClick:ItemClickHandler) :
    ListAdapter<String,ListAdapter2.ListViewHolder>(ListDiffCallBack) {

    class ListViewHolder(view: View) : RecyclerView.ViewHolder(view){
        val tv=view.findViewById<TextView>(R.id.textView)
        fun bind(str:String,onShowItemClick:ItemClickHandler){
            tv.text=str
            tv.setOnClickListener {
                onShowItemClick.invoke(str)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view= LayoutInflater.from(parent.context).inflate(R.layout.item_list,parent,false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        holder.bind(getItem(position),onShowItemClick)
    }


    object ListDiffCallBack : DiffUtil.ItemCallback<String>(){
        override fun areItemsTheSame(oldItem: String, newItem: String): Boolean {
            return oldItem==newItem
        }

        override fun areContentsTheSame(oldItem: String, newItem: String): Boolean {
            return oldItem==newItem
        }
    }



}
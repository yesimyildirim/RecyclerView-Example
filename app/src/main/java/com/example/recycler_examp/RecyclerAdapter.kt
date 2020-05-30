package com.example.recycler_examp

import android.content.Context


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.recycler_view_item.view.*

class RecyclerAdapter(private var nameArray:ArrayList<String>, private val phoneArray:ArrayList<String>, private val emailArray:ArrayList<String>, context: Context): RecyclerView.Adapter<PostHolder>() {
//

    private val colors: Array<String> = arrayOf("#13bd27","#29c1e1","#b129e1","#d3df13","#f6bd0c","#a1fb93","#0d9de3","#ffe48f")

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostHolder {
        val inflater=LayoutInflater.from(parent.context)
        val view=inflater.inflate(R.layout.recycler_view_item,parent,false)
        return PostHolder(view)
    }


    override fun getItemCount(): Int {

        return nameArray.size
    }

    override fun onBindViewHolder(holder: PostHolder, position: Int) {

        holder?.recyclerNameText?.text=nameArray.get(position)
        holder?.recyclerPhoneText?.text=phoneArray.get(position)
        holder?.recyclerEmailText?.text=emailArray.get(position)
    }

}
class PostHolder (view:View):RecyclerView.ViewHolder(view){


    val recyclerNameText: TextView =view.nameT
    val recyclerPhoneText: TextView =view.phoneT
    val recyclerEmailText: TextView =view.emailT

}
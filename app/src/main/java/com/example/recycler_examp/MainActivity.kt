package com.example.recycler_examp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var recyclerAdapter:RecyclerAdapter?=null

    var nameList:ArrayList<String> = ArrayList()
    var phoneList:ArrayList<String> = ArrayList()
    var emailList:ArrayList<String> = ArrayList()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setData()
        var layoutManager= LinearLayoutManager(this)
        recyclerView.layoutManager=layoutManager
        recyclerAdapter=RecyclerAdapter(nameList,phoneList,emailList,this)
        recyclerView.adapter=recyclerAdapter
    }
    fun setData(){
        nameList.add(0,"Kuzey")
        nameList.add(1,"Lucifer")
        nameList.add(2,"nemenem")

        phoneList.add(0,"aaaaa")
        phoneList.add(1,"bbbbb")
        phoneList.add(2,"ccccc")

        emailList.add(0,"abc@gmail.com")
        emailList.add(1,"bbb@gmail.com")
        emailList.add(2,"ccc@gmail.com")

    }
}
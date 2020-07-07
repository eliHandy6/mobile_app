package com.example.application2.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.application2.models.Hobby
import com.example.application2.R
import kotlinx.android.synthetic.main.list_item.view.*

class HobbiesAdapter(val context:Context, private var hobbies:List<Hobby>):RecyclerView.Adapter<HobbiesAdapter.MyViewHolder>(){
    inner class MyViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){

        fun setData(hobby: Hobby?, position: Int){
            itemView.txvTitle.text=hobby!!.title
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {

      var view= LayoutInflater.from(context).inflate(R.layout.list_item,parent,false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
        return hobbies.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        var hobby=hobbies[position]
        holder.setData(hobby,position)
    }
}

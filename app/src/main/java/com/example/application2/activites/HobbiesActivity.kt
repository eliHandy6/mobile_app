package com.example.application2.activites

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.application2.adapters.HobbiesAdapter
import com.example.application2.R
import com.example.application2.models.Suppplier
import kotlinx.android.synthetic.main.activity_hobbies.*

class HobbiesActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hobbies)

        setUpRecyclerView()


    }

    private fun setUpRecyclerView() {
        var layoutManager=LinearLayoutManager(this)
        layoutManager.orientation=LinearLayoutManager.VERTICAL
        recyclerView.layoutManager=layoutManager
        var adapter= HobbiesAdapter(
            this,
            Suppplier.hobbies
        )
        recyclerView.adapter=adapter

    }
}

package com.example.application2.activites

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.application2.Constants
import com.example.application2.R
import com.example.application2.showToast
import kotlinx.android.synthetic.main.activity_second.*

class  SecondActivity:AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)



        //avoiding null exception
        //safe call ?.
        //safe call with ?.let{}


        var bundle:Bundle?=intent.extras

        bundle?.let{

            var message =bundle!!.getString(Constants.USER_MSG_KEY)
    //        Toast.makeText(this,message, Toast.LENGTH_SHORT).show()

            showToast(message.toString())
            txvUserMessage.text=message
        }

    }


}
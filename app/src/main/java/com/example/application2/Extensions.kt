package com.example.application2

import android.app.Activity
import android.widget.Toast

//application of default parameters
fun Activity.showToast(message:String,duration:Int=Toast.LENGTH_SHORT){
    Toast.makeText(this,message,duration).show()

}
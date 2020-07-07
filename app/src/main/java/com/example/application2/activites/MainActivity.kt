package com.example.application2.activites

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.example.application2.R
import com.example.application2.showToast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

//    companion object{
//        val TAG :String=MainActivity::class.java.simpleName
//    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonShowToast.setOnClickListener{
            //Log .i os useful to the developer to show that a given button was clicked
            Log.i("MainActivity","Button was clicked")
                //toast is used to display data to the user
            //Toast.makeText(this,"Button was clicked",Toast.LENGTH_SHORT).show()
            //Toast can be implimented as extensions

            showToast("Button was clicked")
        }


        buttonSendMesgToNextActivity.setOnClickListener {
            var message = etUserMessage.text.toString()
            Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
            //intent
            //intention to do something
            //its a class
            var intent = Intent(this, SecondActivity::class.java)
            //explicit intent-when you know the  target activity
            intent.putExtra("user_message", message)
            startActivity(intent)
        }
            //implicit intent-no known target
            btnShareToOtherApps.setOnClickListener {
                var message=etUserMessage.text.toString()
                var intent =Intent()
                intent.action=Intent.ACTION_SEND
                intent.putExtra(Intent.EXTRA_TEXT,message);
                intent.type="text/plain"
                startActivity(Intent.createChooser(intent,"Share to"))
            }

        btnRecyclerViewDemo.setOnClickListener {
            var intent=Intent(this,
                HobbiesActivity::class.java)
            startActivity(intent)
        }


        }
    }


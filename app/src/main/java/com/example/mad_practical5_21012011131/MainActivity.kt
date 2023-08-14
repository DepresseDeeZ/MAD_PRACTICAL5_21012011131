package com.example.mad_practical5_21012011131

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager.BadTokenException
import android.widget.Button
import android.widget.EditText
import android.widget.Gallery

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //create onlick event
        val Browsebutton : Button= findViewById(R.id.button)
        val urleditText : EditText= findViewById(R.id.editText)
        Browsebutton.setOnClickListener {
            open_browser(urleditText.text.toString())
        }
        //Tocall button
        val callButton : Button = findViewById(R.id.button2)
        val phonetext: EditText = findViewById(R.id.editText1)

        callButton.setOnClickListener {
            ToCall(phonetext.text.toString())
        }
        //call_log
        val callLogButton : Button = findViewById(R.id.button3)

        callLogButton.setOnClickListener {
            call_log()
        }
        //Gallery
        val GalleryButton : Button = findViewById(R.id.button4)

        GalleryButton.setOnClickListener {
            Gallery()
        }
        //set_alarm
        val alarmButton : Button = findViewById(R.id.button5)

        alarmButton.setOnClickListener {
            Set_alarm()
        }
        //Open_camera
        val cameraButon : Button = findViewById(R.id.button6)

        cameraButon.setOnClickListener {
            Open_camera()
        }


    }

    fun open_browser(url: String) {
    Intent(Intent.ACTION_VIEW, Uri.parse(url)).also { startActivity(it) }
    }
    fun ToCall(no:String){

    }
    fun call_log(){

    }

    fun Gallery(){

    }
    fun Set_alarm(){

    }
    fun Open_camera(){

    }

}

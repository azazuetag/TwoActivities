package com.mtw.alejandro.twoactivities

import android.app.Activity
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {
    //Sirve para Variables estaticas finales
    companion object {
        val EXTRA_REPLY:String = "com.mtw.alejandro.twoactivities.extra.REPLY"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        text_message.text =  intent.getStringExtra(MainActivity.EXTRA_MESSAGE)

    }

    fun returnReply(v: View){
        val replyIntent = Intent()
        val replyMessage = editText_second.text.toString()
        replyIntent.putExtra(EXTRA_REPLY,replyMessage)
        setResult(Activity.RESULT_OK,replyIntent)
        finish() // Termina la actividad
    }
}

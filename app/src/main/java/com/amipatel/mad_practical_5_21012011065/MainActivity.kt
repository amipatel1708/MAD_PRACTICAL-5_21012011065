package com.amipatel.mad_practical_5_21012011065

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val browseButton = findViewById<Button>(R.id.browse_btn)
        val txtBrowse:EditText=findViewById(R.id.url)
        browseButton.setOnClickListener {
            openBrowser(txtBrowse.text.toString())
        }
        val callButton = findViewById<Button>(R.id.call_btn)
        val txtCall:EditText=findViewById(R.id.editTextPhone)
        callButton.setOnClickListener{
            call(txtCall.text.toString())
        }
    }

    fun openBrowser(url : String){
        Intent(Intent.ACTION_VIEW, Uri.parse(url)).also { startActivity(it) }
    }
    fun call(number : String){
        Intent(Intent.ACTION_DIAL).setData(Uri.parse("tel:$number")).also { startActivity(it) }
    }
    fun callLog(){

    }
    fun gallery(){

    }
    fun camera(){

    }
    fun alarm(){

    }
}
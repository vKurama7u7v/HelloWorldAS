package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    /// lateinit solo para var global de vista
    private var tvGreeting: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //var tvGreeting: TextView
        setContentView(R.layout.activity_main)
        tvGreeting = findViewById(R.id.txtSaludo)
        //tvGreeting.text = getString(R.string.despedida)
        cambiarMensaje()
    }

    private fun cambiarMensaje(){
        val mensaje_original:String
        mensaje_original = tvGreeting?.text.toString()
        Toast.makeText(this,"Tu mensaje original era " + mensaje_original + ":)", Toast.LENGTH_LONG).show()
    }

    private fun cambiarMensaje(tipo:Int){
        if(tipo == 1){
            tvGreeting!!.text = getString(R.string.despedida)
        } else {
            Toast.makeText(this,"El tipo es $tipo", Toast.LENGTH_SHORT).show()
        }
    }
}


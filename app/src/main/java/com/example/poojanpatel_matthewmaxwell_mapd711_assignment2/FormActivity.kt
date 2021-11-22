package com.example.poojanpatel_matthewmaxwell_mapd711_assignment2
/*Name: Poojan Patel
ID: 301228811
Name: Matthew Maxwell
ID: 301200258
Course: MAPD-711
Assignment: Assignment-2 */
import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.view.View
import android.widget.Button
import android.widget.RadioGroup
import android.widget.Spinner
import android.widget.TextView

class FormActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_form)


        // Adding spinner (adults)
        val spin = findViewById<View>(R.id.adults_spin) as Spinner
        val spin2 = findViewById<View>(R.id.child_spin) as Spinner
        val submit = findViewById<View>(R.id.buttonguests) as Button

        submit.setOnClickListener{
            val text_sel = spin.selectedView as TextView
            val text_child = spin2.selectedView as TextView

            // get values from previous intent
            val ctype = intent.getStringExtra("Cruise")
            val places = intent.getStringExtra("Places")
            val duration = intent.getStringExtra("Duration")
            val cost = intent.getStringExtra("Price")

            // Creating new intent
            val intent_2 = Intent(this@FormActivity, PaymentActivity::class.java)
            intent_2.putExtra("Cruise",ctype.toString())
            intent_2.putExtra("People",text_sel.text)
            intent_2.putExtra("Places",places.toString())
            intent_2.putExtra("Duration",duration.toString())
            intent_2.putExtra("Price",cost.toString())
            intent_2.putExtra("Adults",text_sel.text)
            intent_2.putExtra("Child",text_child.text)

            startActivity(intent_2)


        }

        }
    }

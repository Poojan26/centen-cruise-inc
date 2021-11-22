package com.example.poojanpatel_matthewmaxwell_mapd711_assignment2
/*Name: Poojan Patel
ID: 301228811
Name: Matthew Maxwell
ID: 301200258
Course: MAPD-711
Assignment: Assignment-2 */
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText

class CheckOut : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_check_out)
    }

    fun cLickSend(view: android.view.View) {

        if (view.id == R.id.buttoncheck) {

            // Fetching values from previous intent
            val ctype = intent.getStringExtra("Cruise")
            val people = intent.getStringExtra("People")
            val places = intent.getStringExtra("Places")
            val duration = intent.getStringExtra("Duration")
            val cost = intent.getStringExtra("Price")
            val adults = intent.getStringExtra("Adults")
            val kids = intent.getStringExtra("Child")

            // Getting values from user
            val name = findViewById<EditText>(R.id.ETname)
            val add = findViewById<EditText>(R.id.ETadd)
            val city = findViewById<EditText>(R.id.ETCity)
            val postcode = findViewById<EditText>(R.id.ETpost)
            val num = findViewById<EditText>(R.id.ETphone)
            val mail = findViewById<EditText>(R.id.ETmail)


            val intent_4 = Intent(this@CheckOut, ReserveActivity::class.java)
            intent_4.putExtra("Cruise",ctype)
            intent_4.putExtra("People",people)
            intent_4.putExtra("Places",places)
            intent_4.putExtra("Duration",duration)
            intent_4.putExtra("Price",cost)
            intent_4.putExtra("Adults",adults)
            intent_4.putExtra("Child",kids)
            intent_4.putExtra("Name",name.text.toString())
            intent_4.putExtra("Address",add.text.toString())
            intent_4.putExtra("City",city.text.toString())
            intent_4.putExtra("Postcode",postcode.text.toString())
            intent_4.putExtra("Number",num.text.toString())
            intent_4.putExtra("Mail",mail.text.toString())

            startActivity(intent_4)
        }

    }
}
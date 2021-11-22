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

class PaymentActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_payment)


    }
    fun pay_button(view:android.view.View) {

        if (view.id == R.id.buttonpay) {

            // Fetching values from previous intent
            val ctype = intent.getStringExtra("Cruise")
            val people = intent.getStringExtra("People")
            val places = intent.getStringExtra("Places")
            val duration = intent.getStringExtra("Duration")
            val cost = intent.getStringExtra("Price")
            val adults = intent.getStringExtra("Adults")
            val kids = intent.getStringExtra("Child")

            //Creating new intent
            val intent_3 = Intent(this@PaymentActivity, CheckOut::class.java)
            intent_3.putExtra("Cruise",ctype)
            intent_3.putExtra("People",people)
            intent_3.putExtra("Places",places)
            intent_3.putExtra("Duration",duration)
            intent_3.putExtra("Price",cost)
            intent_3.putExtra("Adults",adults)
            intent_3.putExtra("Child",kids)
            startActivity(intent_3)
        }
    }
}
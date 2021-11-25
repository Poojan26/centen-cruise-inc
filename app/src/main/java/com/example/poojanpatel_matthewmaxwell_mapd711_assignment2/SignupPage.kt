package com.example.poojanpatel_matthewmaxwell_mapd711_assignment2
/*Name: Poojan Patel
ID: 301228811
Name: Matthew Maxwell
ID: 301200258
Course: MAPD-711
Assignment: Assignment-4 */
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText

class SignupPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup_page)
    }
    // Function of Save button
    fun save_button(view: android.view.View) {

        if (view.id == R.id.btn_save) {

            // Fetching values from user
            val fname = findViewById<EditText>(R.id.ETname)
            val lname = findViewById<EditText>(R.id.ETlname)
            val email = findViewById<EditText>(R.id.ETemail)
            val uname = findViewById<EditText>(R.id.ETuser)
            val password = findViewById<EditText>(R.id.ETpassword)
            val address = findViewById<EditText>(R.id.ETadd)
            val city = findViewById<EditText>(R.id.ETcity)
            val pcode = findViewById<EditText>(R.id.ETpcode)
            val phone = findViewById<EditText>(R.id.ETphone)


            val intent = Intent(this@SignupPage, UserDetails::class.java)
            intent.putExtra("Fname",fname.text.toString())
            intent.putExtra("Lname",lname.text.toString())
            intent.putExtra("Email",email.text.toString())
            intent.putExtra("Username",uname.text.toString())
            intent.putExtra("Password",password.text.toString())
            intent.putExtra("Address",address.text.toString())
            intent.putExtra("City",city.text.toString())
            intent.putExtra("Pcode",pcode.text.toString())
            intent.putExtra("Phone",phone.text.toString())
            startActivity(intent)
        }
    }
}
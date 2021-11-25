package com.example.poojanpatel_matthewmaxwell_mapd711_assignment2
/*Name: Poojan Patel
ID: 301228811
Name: Matthew Maxwell
ID: 301200258
Course: MAPD-711
Assignment: Assignment-4 */
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import com.example.poojanpatel_matthewmaxwell_mapd711_assignment2.data.CustomerViewModel

class UserDetails : AppCompatActivity() {
    lateinit var customerViewModel: CustomerViewModel
    lateinit var context: Context
    lateinit var strFname: String
    lateinit var strLname: String
    lateinit var strUname: String
    lateinit var strPassword: String
    lateinit var strEmail: String
    lateinit var strAddress: String
    lateinit var strCity: String
    lateinit var strPostal: String
    lateinit var strPhone: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_details)

        //consider the Main Activity as a current context
        context = this@UserDetails

        //initializing studentModel Object
        customerViewModel = ViewModelProvider(this).get(CustomerViewModel::class.java)

        // Button reference
        val btnlogin: Button = findViewById<Button>(R.id.blogin)
        // Fetching values from previous intent
        val fname = intent.getStringExtra("Fname")
        val lname = intent.getStringExtra("Lname")
        val email = intent.getStringExtra("Email")
        val uname = intent.getStringExtra("Username")
        val password = intent.getStringExtra("Password")
        val add = intent.getStringExtra("Address")
        val city = intent.getStringExtra("City")
        val pcode = intent.getStringExtra("Pcode")
        val phone = intent.getStringExtra("Phone")


        // getting textview fields to add value
        val first = findViewById<TextView>(R.id.TVname)
        val last = findViewById<TextView>(R.id.TVlname)
        val email_id = findViewById<TextView>(R.id.TVemail)
        val user = findViewById<TextView>(R.id.TVuser)
        val pass = findViewById<TextView>(R.id.TVpassword)
        val address = findViewById<TextView>(R.id.TVadd)
        val city1 = findViewById<TextView>(R.id.TVcity)
        val post_code = findViewById<TextView>(R.id.TVpcode)
        val tel_phone = findViewById<TextView>(R.id.TVphone)


        // Sending values to text view
        first.text = fname.toString()
        last.text = lname.toString()
        email_id.text = email.toString()
        user.text = uname.toString()
        pass.text = password.toString()
        address.text = add.toString()
        city1.text = city.toString()
        post_code.text = pcode.toString()
        tel_phone.text = phone.toString()


    }
    //Function of back to login button
    fun back_login(view: android.view.View) {
    //btnlogin.setOnClickListener{
        if (view.id == R.id.blogin) {

            // getting textview fields to add value
            val first = findViewById<TextView>(R.id.TVname)
            val last = findViewById<TextView>(R.id.TVlname)
            val email_id = findViewById<TextView>(R.id.TVemail)
            val user = findViewById<TextView>(R.id.TVuser)
            val pass = findViewById<TextView>(R.id.TVpassword)
            val address = findViewById<TextView>(R.id.TVadd)
            val city1 = findViewById<TextView>(R.id.TVcity)
            val post_code = findViewById<TextView>(R.id.TVpcode)
            val tel_phone = findViewById<TextView>(R.id.TVphone)

            strUname = user.text.toString().trim()
            strFname = first.text.toString().trim()
            strLname = last.text.toString().trim()
            strPassword = pass.text.toString().trim()
            strEmail = email_id.text.toString().trim()
            strAddress = address.text.toString().trim()
            strCity = city1.text.toString().trim()
            strPostal = post_code.text.toString().trim()
            strPhone = tel_phone.text.toString().trim()


            // Adding data to database using insert customer method
            customerViewModel.insertCustomer(context,strUname,strFname,strLname,strPassword,strEmail,strAddress,strCity,strPostal,strPhone)


            val intent = Intent(this@UserDetails, MainActivity::class.java)
            val toast = Toast.makeText(applicationContext,"Sign up Successful", Toast.LENGTH_LONG)
            toast.show()
            startActivity(intent)
        //}
    }
}
}

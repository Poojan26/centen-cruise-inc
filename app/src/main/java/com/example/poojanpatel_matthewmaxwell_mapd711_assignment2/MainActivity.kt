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
import android.view.View
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var context: Context
    lateinit var strName: String
    lateinit var strCourse: String
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    context = this@MainActivity
    }
    //Function of login button
    fun login_button_click(view: android.view.View) {

        if (view.id == R.id.buttonlogin) {

            val username = findViewById<EditText>(R.id.ETUusername)
            val password = findViewById<EditText>(R.id.ETPassword)
            strName = username.text.toString().trim()
            strCourse = password.text.toString().trim()

            //validation for the empty values
            if (strName.isEmpty()) {
                username.error = "Enter User Name"
                Toast.makeText( context,"User Name should not be empty",Toast.LENGTH_LONG).show()
            }
            else if (strCourse.isEmpty()) {
                password.error = "Enter Password"
            }
            else{
                Toast.makeText( context,"Storing to database",Toast.LENGTH_LONG).show()

            }
            val prefs = getSharedPreferences("User",Context.MODE_PRIVATE)
            val editor = prefs.edit()

            editor.putString("Username",username.text.toString())
            editor.apply()



            val intent = Intent(this@MainActivity, CruiseTypes::class.java)
            val toast = Toast.makeText(applicationContext,"Login Successful",Toast.LENGTH_LONG)
            toast.show()
            startActivity(intent)


        }
    }

    // Function of Sign up button
    fun signup_button_click(view: android.view.View) {

        if (view.id == R.id.buttonsignup) {
            val intent = Intent(this@MainActivity, SignupPage::class.java)
            startActivity(intent)
        }
    }

}
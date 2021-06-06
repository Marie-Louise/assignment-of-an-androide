package com.example.codehive
import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast.LENGTH_LONG
import android.widget.Toast.makeText
import androidx.appcompat.app.AppCompatActivity
class MainActivity : AppCompatActivity() {
    @SuppressLint( )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val etName=findViewById<EditText>(R.id.etName)
        val etDob=findViewById<EditText>(R.id.etDob)
        val etNationality=findViewById<EditText>(R.id.etNationality)
        val etIdNo=findViewById<EditText>(R.id.etIdNo)
        val etPhone=findViewById<EditText>(R.id.etPhone)
        val etEmail=findViewById<EditText>(R.id.etEmail)
        val btnRegister=findViewById<EditText>(R.id.etRegister)
        btnRegister.setOnClickListener {
            val name =etName.text.toString()
            makeText(baseContext,name, LENGTH_LONG)
            val dob=etDob.text.toString()
            val nationality=etNationality.text.toString()
            val idNo=etIdNo.text.toString()
            val phone=etPhone.text.toString()
            val email=etEmail.text.toString()
            val details=Details(name,dob,email,nationality,idNo,phone)
            makeText(baseContext,details.toString(), LENGTH_LONG).show()
        }
    }
}
data class  Details(
    var name:String,
    var dob :String,
    var email:String,
    var nationality:String,
    var idNo:String,
    var phone:String,
)

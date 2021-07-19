package com.example.firebase

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.google.firebase.database.FirebaseDatabase
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnSave.setOnClickListener {
            var note = editText.text.toString()
            FirebaseDatabase.getInstance().reference.push().setValue(note)
            Log.d("IDK", "onCreate: HELLO")

        }


    }
}
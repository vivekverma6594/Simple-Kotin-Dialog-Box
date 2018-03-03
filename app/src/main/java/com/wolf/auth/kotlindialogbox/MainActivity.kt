package com.wolf.auth.kotlindialogbox

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.app.AlertDialog
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val dialogButton:Button = findViewById(R.id.dialogButton)
        dialogButton.setOnClickListener{
            showDialog()
        }
    }

    private fun showDialog(){
        val dialogBuilder = AlertDialog.Builder(this)


        dialogBuilder.setTitle("Sample Kotlin Dialog Box!!")
        dialogBuilder.setMessage("Choose any button...")
        dialogBuilder.setCancelable(false)
        dialogBuilder.setPositiveButton("Yes", { _, _ ->
            Toast.makeText(this, "Yes Button Pressed", Toast.LENGTH_SHORT).show()
        })
        dialogBuilder.setNegativeButton("No", { _, _ ->
            Toast.makeText(this, "No Button Pressed", Toast.LENGTH_SHORT).show()
        })
        dialogBuilder.setNeutralButton("Ok", {_,_ ->
            Toast.makeText(this, "Ok Button Pressed", Toast.LENGTH_SHORT).show()
        })
        val b = dialogBuilder.create()
        b.show()
    }
}

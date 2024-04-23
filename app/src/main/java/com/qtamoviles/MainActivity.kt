package com.qtamoviles

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.screen_1)

        val buttonLogin =findViewById<Button>(R.id.loginButton)

        buttonLogin.setOnClickListener{

            val intent = Intent(this,LoginActivity::class.java)
            startActivity(intent)
        }
    }
}

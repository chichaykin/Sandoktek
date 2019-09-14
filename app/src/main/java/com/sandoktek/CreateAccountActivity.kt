package com.sandoktek

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.sandoktek.ui.login.afterTextChanged
import kotlinx.android.synthetic.main.activity_create_acount.*

class CreateAccountActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_acount)

        createAccount.setOnClickListener { startMainActivity() }

        password2.apply {
            afterTextChanged {
                createAccount.isEnabled = (it == password1.text.toString())
            }
        }
    }

    private fun startMainActivity() {
        val intent = Intent(this, HomeActivity::class.java)
        startActivity(intent)
        finish()
    }
}

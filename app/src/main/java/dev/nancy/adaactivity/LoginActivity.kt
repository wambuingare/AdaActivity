package dev.nancy.adaactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class LoginActivity : AppCompatActivity() {
    lateinit var tilUsername: TextInputLayout
    lateinit var etUsername: TextInputEditText
    lateinit var tilPassword: TextInputLayout
    lateinit var etPassword: TextInputEditText
    lateinit var btnLogin: Button
    lateinit var tilConfirm:TextInputLayout
    lateinit var etConfirm:TextInputEditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        castViews()

    }
        fun castViews() {
            tilUsername = findViewById(R.id.tilUsername)
            etUsername = findViewById(R.id.etUsername)
            tilPassword = findViewById(R.id.tilPassword)
            etPassword = findViewById(R.id.etPassword)
            tilConfirm = findViewById(R.id.tilConfirm)
            etConfirm = findViewById(R.id.etConfirm)
            btnLogin = findViewById(R.id.btnLogin)
            btnLogin.setOnClickListener { validating() }
        }
    fun validating(){
        var error = false
        tilUsername.error = null
        tilPassword.error = null
        tilConfirm.error=null
        var username = etUsername.text.toString()
        if (username.isBlank()) {
            tilUsername.error = "Username is required"
            error=true
        }
        var password = etPassword.text.toString()
        if (password.isBlank()){
           tilPassword.error = "Username is required"
    }
        var confirm=etConfirm.text.toString()
        if (confirm.isBlank()) {
            tilConfirm.error = "Password is Invalid"
        }
        if (password!=confirm)
            etConfirm.error="wrong password"
    }
}

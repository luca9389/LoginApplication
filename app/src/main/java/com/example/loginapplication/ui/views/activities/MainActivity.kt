package com.example.loginapplication.ui.views.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.loginapplication.R
import com.example.loginapplication.databinding.ActivityLoginBinding
import com.example.loginapplication.databinding.ActivityMainBinding
import com.example.loginapplication.ui.views.fragments.LoginFragment

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        //binding.fragmentContainer

        replaceFragment()

    }

    private fun replaceFragment() {
        val loginFragment = LoginFragment()

        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.fragment_container, loginFragment)
        transaction.commit()

    }
}
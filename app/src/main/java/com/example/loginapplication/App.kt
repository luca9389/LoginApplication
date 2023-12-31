package com.example.loginapplication

import android.app.Application
import com.example.loginapplication.App.Companion.prefs
import com.example.loginapplication.data.SharedPreferences

class App : Application() {

    companion object {
        lateinit var prefs: SharedPreferences
    }

    override fun onCreate() {
        super.onCreate()

        prefs = SharedPreferences(applicationContext)

    }

}
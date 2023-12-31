package com.example.loginapplication

import android.app.Application
import com.example.loginapplication.data.preferences.SharedPreferences

class App : Application() {

    companion object {
        lateinit var prefs: SharedPreferences
    }

    override fun onCreate() {
        super.onCreate()

        prefs = SharedPreferences(applicationContext)

    }

}
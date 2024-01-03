package com.example.loginapplication.data.repositories

import android.content.Context
import com.example.loginapplication.App
import com.example.loginapplication.data.entities.UserModel
import com.example.loginapplication.data.preferences.SharedPreferences

class UserRepository {

    //private lateinit var sharedPreferences: SharedPreferences

    fun setUser(user: UserModel) {
        val pref = App.prefs.setUser(user)
    }

    fun getUser(): UserModel? {
        val userPref = App.prefs.getUser()
        if (userPref != null && !userPref.user.isNullOrEmpty() && !userPref.pass.isNullOrEmpty()) {
            return userPref
        }
        return null

    }


}
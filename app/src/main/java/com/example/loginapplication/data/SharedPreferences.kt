package com.example.loginapplication.data

import android.content.Context
import com.google.gson.Gson

class SharedPreferences(val context:Context) {


    val storage = context.getSharedPreferences(APP, 0)

    companion object {
        const val USER_SAVED : String = "user"
        const val APP : String = "app"
    }

    fun setUser(user: UserModel){
           storage.edit().putString(USER_SAVED, Gson().toJson(user)).apply()

    }

    fun getUser(): UserModel? {
        val data = storage.getString("user", null)
        if (data == null) {
            return null
        }
        return Gson().fromJson(data, UserModel::class.java)
    }

}

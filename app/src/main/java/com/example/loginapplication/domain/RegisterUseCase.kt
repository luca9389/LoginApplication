package com.example.loginapplication.domain

import androidx.lifecycle.MutableLiveData
import com.example.loginapplication.data.entities.UserModel
import com.example.loginapplication.data.repositories.UserRepository

class RegisterUseCase {
    val repository = UserRepository()
    //val user: UserModel = UserModel()


    fun setUser(name: String, pass: String): UserModel? {
        val lucaUser1 = UserModel()
        lucaUser1.user = name
        lucaUser1.pass = pass

        val getUser = repository.getUser()
        if (getUser == null || getUser.user != lucaUser1.user) {
            repository.setUser(lucaUser1)
            return getUser
        }
        return null


    }
}
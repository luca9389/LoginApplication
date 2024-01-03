package com.example.loginapplication.ui.views.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.loginapplication.data.entities.UserModel
import com.example.loginapplication.data.repositories.UserRepository

class RegisterViewModel : ViewModel() {

    val userSaved: MutableLiveData<UserModel?> get() = _userSaved
    private val _userSaved = MutableLiveData<UserModel?>()

    val repository = UserRepository()
    //val user: UserModel = UserModel()


    fun setUser(name: String, pass: String) {
        val lucaUser1: UserModel = UserModel()
        lucaUser1.user = name
        lucaUser1.pass = pass

        val getUser = repository.getUser()
        if (getUser == null  || getUser.user != lucaUser1.user){
            repository.setUser(lucaUser1)
            _userSaved.value = getUser
        }else {
            _userSaved.value = null
        }

        //if (getUser != null ){
        //    _userSaved.value = getUser
        //} else{
        //    _userSaved.value = null
        //}
    }


}
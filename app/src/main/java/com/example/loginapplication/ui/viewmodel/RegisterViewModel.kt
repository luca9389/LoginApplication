package com.example.loginapplication.ui.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.loginapplication.data.entities.UserModel
import com.example.loginapplication.domain.RegisterUseCase

class RegisterViewModel : ViewModel() {

    val userSaved: MutableLiveData<UserModel?> get() = _userSaved
    private val _userSaved = MutableLiveData<UserModel?>()

    val useCase : RegisterUseCase = RegisterUseCase()


    fun setUser(name: String, pass: String) {
        _userSaved.value = useCase.setUser(name, pass)//rerer
    }


}
package com.example.loginapplication.utlis

import android.content.Context
import android.widget.Toast

fun Context.messageToast(message: String) {
    Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
}
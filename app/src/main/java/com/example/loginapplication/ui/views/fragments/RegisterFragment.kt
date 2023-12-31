package com.example.loginapplication.ui.views.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.loginapplication.App.Companion.prefs
import com.example.loginapplication.R
import com.example.loginapplication.data.UserModel
import com.example.loginapplication.databinding.FragmentLoginBinding
import com.example.loginapplication.databinding.FragmentRegisterBinding
import kotlinx.coroutines.delay
import okhttp3.Dispatcher

class RegisterFragment : Fragment() {
 private lateinit var binding: FragmentRegisterBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentRegisterBinding.inflate(layoutInflater)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)//test

        binding.botonregister.setOnClickListener {

            var name: String = "Asedasdasda"
            var pass: String = "asdasdas"
            var user1 = UserModel(name, pass)

            prefs.setUser(user1)

            Toast.makeText(context, prefs.getUser()!!.user, Toast.LENGTH_SHORT).show()

        }

    }
}
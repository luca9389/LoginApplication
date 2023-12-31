package com.example.loginapplication.ui.views.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import com.example.loginapplication.App.Companion.prefs
import com.example.loginapplication.data.entities.UserModel
import com.example.loginapplication.databinding.FragmentRegisterBinding
import com.example.loginapplication.ui.views.viewmodel.RegisterViewModel

class RegisterFragment : Fragment() {
    private lateinit var binding: FragmentRegisterBinding
    private val registerViewModel by viewModels<RegisterViewModel>()

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

            var name: String = binding.usuario.getText().toString();
            var pass: String = binding.password.getText().toString()

            if (name.isNullOrEmpty() && pass.isNullOrEmpty()) {
                Toast.makeText(context, "El campo esta vacio", Toast.LENGTH_SHORT).show()
            } else {
                registerViewModel.setUser(name, pass)
            }

        }

        obserVer()

    }

    private fun obserVer() {
        registerViewModel.userSaved.observe(viewLifecycleOwner) { userSaved ->
            if (userSaved != null) {
                Toast.makeText(
                    context,
                    "El usuario" + userSaved.user + "Se registro correctmente",
                    Toast.LENGTH_SHORT
                )
                    .show()
            } else {
                Toast.makeText(context, "Hubo un error al registrase", Toast.LENGTH_SHORT).show()
            }

        }
    }
}
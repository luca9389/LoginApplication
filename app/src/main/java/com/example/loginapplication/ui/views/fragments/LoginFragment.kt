package com.example.loginapplication.ui.views.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.loginapplication.R
import com.example.loginapplication.databinding.FragmentLoginBinding


class LoginFragment : Fragment() {

    private lateinit var binding: FragmentLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentLoginBinding.inflate(inflater)

        //val user1: UserModel = UserModel("Dasdas","wdwdqawdf")
        //user1.user


        binding.button.setOnClickListener {
           // Toast.makeText(context,user1.user,Toast.LENGTH_SHORT).show()
        }

        binding.buttonRegister.setOnClickListener {
            val registerFragment = RegisterFragment()

            val transaction = requireActivity().supportFragmentManager.beginTransaction()
            transaction.replace(R.id.fragment_container, registerFragment)
            transaction.addToBackStack(null)
            transaction.commit()

        }

        return binding.root
        //return inflater.inflate(R.layout.fragment_login, container, false)
    }

}
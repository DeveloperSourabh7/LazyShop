package com.sourabh.authentication.ui.fragment

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import com.sourabh.authentication.R
import com.sourabh.authentication.databinding.FragmentSignInBinding

class SignInFragment : Fragment() {

    private lateinit var binding: FragmentSignInBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding=FragmentSignInBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
//        val navController = Navigation.findNavController(
//            requireActivity(),
//            R.id.authentication_nav_graph
//        )
        binding.btnSignUp.setOnClickListener {
            findNavController().navigate(R.id.action_signInFragment_to_signupFragment)
         }
        binding.tvForgotPwd.setOnClickListener {
            findNavController().navigate(R.id.action_signInFragment_to_forgotPasswordFragment)
        }
    }
}
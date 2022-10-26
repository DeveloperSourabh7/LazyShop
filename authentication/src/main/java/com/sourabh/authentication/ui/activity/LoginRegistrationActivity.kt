package com.sourabh.authentication.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.commit
import com.sourabh.authentication.R
import com.sourabh.authentication.databinding.ActivityAuthenticationBinding
import com.sourabh.authentication.ui.fragment.SignInFragment

class LoginRegistrationActivity : AppCompatActivity() {

    private lateinit var binding: ActivityAuthenticationBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_authentication)
    }
}
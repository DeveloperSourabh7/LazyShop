package com.sourabh.lazyshop.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import androidx.databinding.DataBindingUtil
import com.sourabh.authentication.ui.activity.LoginRegistrationActivity
import com.sourabh.home.ui.activity.HomeActivity
import com.sourabh.lazyshop.R
import com.sourabh.lazyshop.databinding.ActivitySplashBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class SplashActivity: AppCompatActivity() {

    lateinit var binding : ActivitySplashBinding

    lateinit var topAnim : Animation

    lateinit var bottomAnim : Animation

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        binding = DataBindingUtil.setContentView(this,R.layout.activity_splash)

        topAnim = AnimationUtils.loadAnimation(this,R.anim.top_animation)
        bottomAnim= AnimationUtils.loadAnimation(this,R.anim.bottom_animation)

        //binding.persistentLogo.animation = bottomAnim

        binding.appLogo.animation = topAnim
        binding.title.animation = topAnim

        Handler(Looper.getMainLooper()).postDelayed({

            startActivity(Intent(this@SplashActivity, LoginRegistrationActivity::class.java))
            finish()

        }, 5000)

    }
}
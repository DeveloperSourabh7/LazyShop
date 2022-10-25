package com.sourabh.home.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.commit
import com.sourabh.home.R
import com.sourabh.home.databinding.ActivityHomeBinding
import com.sourabh.home.ui.fragment.ExploreFragment
import com.sourabh.home.ui.fragment.GlobalFragment

class HomeActivity : AppCompatActivity() {
    private lateinit var binding:ActivityHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_home)
        supportFragmentManager.commit {
            val fragment = GlobalFragment()
            add(R.id.container_fragment, fragment)
        }
    }
}
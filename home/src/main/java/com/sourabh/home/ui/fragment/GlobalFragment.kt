package com.sourabh.home.ui.fragment

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.NavigationUI
import androidx.navigation.ui.setupWithNavController
import com.sourabh.home.R
import com.sourabh.home.databinding.FragmentGlobalBinding

class GlobalFragment : Fragment() {
    private lateinit var binding: FragmentGlobalBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding=FragmentGlobalBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val navHostFragment =
            childFragmentManager.findFragmentById(R.id.nav_host_fragment_global) as NavHostFragment
        val navController =navHostFragment.findNavController()

        binding.bottomNavView.setupWithNavController(navController)
        binding.bottomNavView.setOnItemSelectedListener{ item->

            NavigationUI.onNavDestinationSelected(item,navController)
            val count = navHostFragment.childFragmentManager.backStackEntryCount
            when(item.itemId){
                R.id.homeMainFragment ->{
                    if (count!=0) {
                        navController.popBackStack(R.id.homeMainFragment, false)
                    }
                }
                R.id.categoriesFragment ->{
                    navController.popBackStack(R.id.categoriesFragment, false)
                }
                R.id.notificationFragment ->{
                    navController.popBackStack(R.id.notificationFragment, false)
                }
                R.id.cartFragment ->{
                    navController.popBackStack(R.id.cartFragment, false)
                }
            }
            true
        }
    }
}
package com.example.mvvm_baseproject.ui.main

import android.os.Bundle
import androidx.navigation.fragment.NavHostFragment
import com.example.mvvm_baseproject.R
import com.example.mvvm_baseproject.databinding.ActivityMainBinding
import com.example.mvvm_baseproject.navigationComponent.AppNavigation
import com.example.mvvm_baseproject.ui.base.BaseActivity
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : BaseActivity<ActivityMainBinding>() {
    @Inject
    lateinit var appNavigation: AppNavigation

    override val layoutId = R.layout.activity_main

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val navHostFragment = supportFragmentManager
            .findFragmentById(R.id.nav_host) as NavHostFragment
        appNavigation.bind(navHostFragment.navController)
    }
}
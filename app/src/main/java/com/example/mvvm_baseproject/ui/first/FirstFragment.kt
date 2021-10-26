package com.example.mvvm_baseproject.ui.first

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.fragment.app.viewModels
import com.example.mvvm_baseproject.R
import com.example.mvvm_baseproject.databinding.FragmentSplashBinding
import com.example.mvvm_baseproject.navigationComponent.AppNavigation
import com.example.mvvm_baseproject.ui.base.BaseFragment
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class FirstFragment : BaseFragment<FragmentSplashBinding>(R.layout.fragment_splash) {

    @Inject
    lateinit var appNavigation: AppNavigation

    private val viewModel: SplashViewModel by viewModels()

    override fun initView(savedInstanceState: Bundle?) {
        super.initView(savedInstanceState)

        binding.btnToLogin.setOnClickListener {
            appNavigation.openSplashToLoginScreen()
        }

        binding.btnToHome.setOnClickListener {
            appNavigation.openLoginToHomeScreen()
        }
    }
}
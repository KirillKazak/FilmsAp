package com.kazak.kirill.filmsap.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import by.kirich1409.viewbindingdelegate.viewBinding
import com.kazak.kirill.filmsap.R
import com.kazak.kirill.filmsap.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val vb: ActivityMainBinding by viewBinding()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val navController = findNavController(R.id.nav_host_fragment)
        vb.bottomNavigationView.setupWithNavController(navController)
    }
}
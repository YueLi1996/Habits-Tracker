package com.codepath23.habitstracker

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fragmentManager: FragmentManager = supportFragmentManager

        val botNavView: BottomNavigationView = findViewById(R.id.bottom_navigation)
        botNavView.setOnItemSelectedListener { item ->
            var fragment: Fragment? = null
            when (item.itemId) {
                R.id.action_home -> {
                    fragment = null
                }
                R.id.action_compose -> {
                    fragment = null
                }
                R.id.action_profile -> {
                    fragment = null
                }
            }

            if (fragment != null) {
                fragmentManager.beginTransaction().replace(R.id.flContainer, fragment).commit()
            }

            true
        }
        botNavView.selectedItemId = R.id.action_home
    }

    companion object {
        const val TAG = "MainActivity"
    }
}
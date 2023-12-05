package com.example.fragments2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.fragments2.Fragment.HomeFragment
import com.example.fragments2.Fragment.SardorbekFragment
import com.example.fragments2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        val homeFragment = HomeFragment()
        val sardorbekFragment = SardorbekFragment()
        val fragmentManager = supportFragmentManager

        binding.apply {

            btnAdd.setOnClickListener {
                val transaction = fragmentManager.beginTransaction()
                transaction.add(R.id.liner_root, homeFragment)
                    .commit()
            }
            btnRemove.setOnClickListener {
                val transaction = fragmentManager.beginTransaction()
                    transaction.remove(homeFragment)
                    .commit()
            }

            btnReplace.setOnClickListener {
                val transaction = fragmentManager.beginTransaction()
                transaction.addToBackStack(sardorbekFragment.toString())
                transaction.replace(R.id.liner_root, sardorbekFragment)
                    .commit()
            }
            btnHide.setOnClickListener {
                val transaction = fragmentManager.beginTransaction()
                transaction.hide(homeFragment)
                transaction.hide(sardorbekFragment)
                    .commit()
            }
            btnShow.setOnClickListener {
                val transaction = fragmentManager.beginTransaction()
                transaction.show(homeFragment)
                    .commit()
            }
        }


    }
}
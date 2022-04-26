package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.add
import androidx.fragment.app.commit

abstract class SingleFragmentActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_single_fragment)
        val fragmentManager=supportFragmentManager
        val fragment=fragmentManager.findFragmentById(R.id.fragment_container)


        if (fragment == null) {
            fragmentManager
                .beginTransaction()
                .add(R.id.fragment_container, createFragment())
                .commit()
        }
    }

    abstract fun createFragment(): Fragment
}
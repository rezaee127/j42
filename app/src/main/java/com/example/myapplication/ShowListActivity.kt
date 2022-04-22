package com.example.myapplication

import android.os.Bundle
import androidx.fragment.app.Fragment

class ShowListActivity : SingleFragmentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun createFragment(): Fragment {
        return ShowListFragment()
    }




}
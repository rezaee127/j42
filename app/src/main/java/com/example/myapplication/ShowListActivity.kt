package com.example.myapplication

import androidx.fragment.app.Fragment

class ShowListActivity : SingleFragmentActivity() {


    override fun createFragment(): Fragment {
        return ShowListFragment()
    }


}
package com.example.myapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.myapplication.databinding.FragmentShowListBinding

class ShowListFragment : Fragment() {
    lateinit var binding:FragmentShowListBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentShowListBinding.inflate (inflater, container, false)
        return binding.root

        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_show_list, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val testList= arrayListOf("razie","fateme","maryam")
        binding.rvTestList.adapter=ListAdapter(testList)


    }


}
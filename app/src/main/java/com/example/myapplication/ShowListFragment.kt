package com.example.myapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.myapplication.databinding.FragmentShowListBinding


class ShowListFragment : Fragment() {
    lateinit var binding:com.example.myapplication.databinding.FragmentShowListBinding
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

        val testList= arrayListOf("razie","fateme","maryam","zahre","razie","fateme","maryam","zahre","razie","fateme","maryam","zahre")
        val adapter=ListAdapter2(){
            Toast.makeText(requireContext(),it,Toast.LENGTH_SHORT).show()
            //testList.remove(it)
        }
        binding.rvTestList.adapter=adapter
        adapter.submitList(testList)

    }


}
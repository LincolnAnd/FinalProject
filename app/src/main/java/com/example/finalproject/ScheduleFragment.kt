package com.example.finalproject

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.example.finalproject.databinding.FragmentMenuBinding
import com.example.finalproject.databinding.FragmentScheduleBinding
import com.example.finalproject.databinding.ScheduleItemLayoutBinding

class ScheduleFragment : Fragment() {
    private var _binding: ScheduleItemLayoutBinding? = null
    private val binding get() = _binding!!
    private val viewModel:viewModel by viewModels()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = ScheduleItemLayoutBinding.inflate(inflater, container, false)

val myAdapter=GameAdapter(viewModel.games)
        binding.recyclerView.adapter=myAdapter
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}
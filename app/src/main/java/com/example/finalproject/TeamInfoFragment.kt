package com.example.finalproject

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.example.finalproject.databinding.FragmentMenuBinding
import com.example.finalproject.databinding.FragmentTeamInfoBinding
import com.example.finalproject.databinding.TeamInfoItemLayoutBinding

class TeamInfoFragment : Fragment() {
    private var _binding: TeamInfoItemLayoutBinding? = null
    private val binding get() = _binding!!
    private val viewModel:viewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = TeamInfoItemLayoutBinding.inflate(inflater, container, false)

            val myAdapter2=PlayerAdapter(viewModel.players)
        binding.recyclerVieww.adapter=myAdapter2
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}
package com.example.finalproject

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.finalproject.databinding.FragmentMenuBinding
import com.example.finalproject.databinding.FragmentScheduleBinding

class ScheduleFragment : Fragment() {
    private var _binding: FragmentScheduleBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentScheduleBinding.inflate(inflater, container, false)
        val games=listOf(Game("Wyoming Seminary","Blue Knights",76,32,"12/06/22")
        ,Game("Tunkhannock","Tigers",81,35,"12/08/22")
        ,Game("Executive Education","Academy",58,55,"12/10/22")
        ,Game("Naticoke Area","team",64,33,"12/14/22"),
        Game("Valley West","team",79,24,"12/19/22"),
        Game("Danville","team",71,23,"12/27/22"),
        Game("Emmaus","team",58,55,"12/29/22"),
        Game("Scranton","Knights",56,49,"01,03,23"))
val myAdapter=GameAdapter(games)
        binding.recyclerView.adapter=myAdapter
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}
package com.example.finalproject

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.finalproject.databinding.FragmentMenuBinding
import com.example.finalproject.databinding.FragmentScheduleBinding
import com.example.finalproject.databinding.ScheduleItemLayoutBinding

class ScheduleFragment : Fragment() {
    private var _binding: ScheduleItemLayoutBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = ScheduleItemLayoutBinding.inflate(inflater, container, false)
        val games=listOf(Game("Wyoming Sem","Blue Knights",76,32,"12/06/22")
        ,Game("Tunkhannock","Tigers",81,35,"12/08/22")
        ,Game("Executive Education","Academy",58,55,"12/10/22")
        ,Game("Naticoke Area","Trojans",64,33,"12/14/22"),
        Game("Valley West","Spartans",79,24,"12/19/22"),
        Game("Danville","Ironmen",71,23,"12/27/22"),
        Game("Emmaus","Hornets",58,55,"12/29/22"),
        Game("Scranton","Knights",56,49,"01,03,23")
        ,Game("Scranton Prep","Cavaliers",66,51,"01/06/23"),
            Game("Berks Catholic","Saints",52,62,"01/07/23"),
        Game("Valley View","Cougars",52,38,"01/10/23")
        ,Game("Dalaware Valley","Warriors",66,30,"01/13/23")
        ,Game("Western Wayne","Wildcats",67,25,"01/17/23")
        ,Game("West Scranton","Invaders",72,53,"01/20/23")
        ,Game("Shamokin","Indians",61,41,"01/21/23")
        ,Game("Honesdale","Hornets",63,43,"01/24/23")
        ,Game("Scranton Prep","Cavaliers",65,48,"01/27/23")
        ,Game("North Pocono","Trojans",65,49,"01/31/23")
        ,Game("Valley View","Coaugars",38,41,"02/03/23")
        ,Game("Scranton","Knights",41,43,"02/07/23")
        ,Game("Wallenpaupack","Buckhorns",64,50,"02/10/23")
        ,Game("West Scranton","Invaders",62,53,"02/14/23")
        ,Game("Valley View","Cougars",36,50,"02/17/23")
        ,Game("North Pocono","Trojans",47,24,"02/24/23")
        ,Game("West Scranton","Invaders",60,38,"03/03/23")
        ,Game("Murrell Dobbins","Mustangs",67,56,"03/11/23")
        ,Game("Pocono Mtn. W","Panthers",61,56,"03/15/23"),
        Game("Imhotep","Panthers",38,65,"03/17/23"))
val myAdapter=GameAdapter(games)
        binding.recyclerView.adapter=myAdapter
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}
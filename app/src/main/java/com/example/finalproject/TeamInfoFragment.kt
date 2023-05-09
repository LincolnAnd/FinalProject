package com.example.finalproject

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.finalproject.databinding.FragmentMenuBinding
import com.example.finalproject.databinding.FragmentTeamInfoBinding

class TeamInfoFragment : Fragment() {
    private var _binding: FragmentTeamInfoBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentTeamInfoBinding.inflate(inflater, container, false)
        val players=listOf(Player("Mason Fedor","Junior","Forward","6\'4\"","180",0,10),
            Player("Matt Show","Senior","Guard","5\'11\"","165",0,11)
            ,Player("Will Marion","Junior","Guard","6\'1\"","1",0,12)
            ,Player("Patrick Walsh","Senior","Guard/Forward","6\'0\"","1",0,22)
            ,Player("Ryan Nealon","Junior","Guard","6\'1\"","1",0,23)
            ,Player("Roman Cutrufello","Senior","Guard","5\'11\"","160",0,24)
            ,Player("Lincoln Anderson","Junior","Guard","6\'0\"","1",0,25)
            ,Player("Gene Curtin","Junior","Guard/Forward","6\'2\"","1",0,33)
            ,Player("Jordan Shaffer","Freshman","Guard","6\'2\"","1",0,35)
            ,Player("Zach Brister","Senior","Forward","6\'2\"","1",0,40)
            ,Player("Jack Petrillo","Senior","Forward","6\'2\"","1",0,42)
            ,Player("Robby Lucas","Sophmore","Forward","6\'2\"","185",0,44))


            val myAdapter=PlayerAdapter(players)
        binding.recyclerView2.adapter=myAdapter
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}
package com.example.finalproject

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.finalproject.databinding.FragmentMenuBinding
import com.example.finalproject.databinding.FragmentTeamInfoBinding
import com.example.finalproject.databinding.TeamInfoItemLayoutBinding

class TeamInfoFragment : Fragment() {
    private var _binding: TeamInfoItemLayoutBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = TeamInfoItemLayoutBinding.inflate(inflater, container, false)
        val players=listOf(
            Player("Mason Fedor","Junior","Forward","6\'4\"","180",R.drawable.dorsquare,10),
            Player("Matt Show","Senior","Guard","5\'11\"","165",R.drawable.mattsquare,11)
            ,Player("Will Marion","Junior","Guard","6\'1\"","165",R.drawable.will,12)
            ,Player("Patrick Walsh","Senior","Guard/Forward","6\'0\"","170",R.drawable.patsquare,22)
            ,Player("Ryan Nealon","Junior","Guard","6\'1\"","165",R.drawable.ryansquare,23)
            ,Player("Roman Cutrufello","Senior","Guard","5\'11\"","160",R.drawable.romansquare,24)
            ,Player("Lincoln Anderson","Junior","Guard","6\'0\"","155",R.drawable.lincolnsquare,25)
            ,Player("Gene Curtin","Junior","Guard/Forward","6\'2\"","155",R.drawable.genesquare,33)
            ,Player("Jordan Shaffer","Freshman","Guard","6\'2\"","150",R.drawable.shaffersquare,35)
            ,Player("Zach Brister","Senior","Forward","6\'2\"","180",R.drawable.bristersquare,40)
            ,Player("Jack Petrillo","Senior","Forward","6\'2\"","205",R.drawable.dudesquare,42)
           , Player("Robby Lucas","Sophmore","Forward","6\'2\"","185",R.drawable.robbysquare,44))


            val myAdapter2=PlayerAdapter(players)
        binding.recyclerVieww.adapter=myAdapter2
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}
package com.example.finalproject

import android.annotation.SuppressLint
import android.graphics.Color
import android.widget.Toast
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.example.finalproject.databinding.ScheduleItemLayoutBinding
import com.example.finalproject.databinding.TeamInfoItemLayoutBinding
import kotlin.properties.Delegates

class TeamInfoHolder(val binding: TeamInfoItemLayoutBinding) :
    RecyclerView.ViewHolder(binding.root) {
    private lateinit var currentPlayer: Player
    init{
        binding.root.setOnClickListener({view->
            val action = TeamInfoFragmentDirections.actionTeamInfoFragmentToPlayerStatsFragment(binding.name.text.toString(),binding.number.text.toString(),binding.grade.text.toString(),currentPlayer.picture,currentPlayer.totalP,currentPlayer.totalFG)
            binding.root.findNavController().navigate(action)
        })
    }
    @SuppressLint("ResourceAsColor")

    fun bindPlayer(player: Player) {
        currentPlayer = player
        binding.name.text = currentPlayer.name
        binding.grade.text = currentPlayer.grade
        binding.height.text = currentPlayer.Height
        binding.weight.text = currentPlayer.weight
        binding.position.text=currentPlayer.position
        binding.number.text = currentPlayer.number.toString()
        binding.pic.setImageResource(currentPlayer.picture)




    }
}
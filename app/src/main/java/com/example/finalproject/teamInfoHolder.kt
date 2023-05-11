package com.example.finalproject

import android.annotation.SuppressLint
import android.graphics.Color
import androidx.recyclerview.widget.RecyclerView
import com.example.finalproject.databinding.ScheduleItemLayoutBinding
import com.example.finalproject.databinding.TeamInfoItemLayoutBinding
import kotlin.properties.Delegates

class TeamInfoHolder(val binding: TeamInfoItemLayoutBinding) :
    RecyclerView.ViewHolder(binding.root) {
    private lateinit var currentPlayer: Player

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
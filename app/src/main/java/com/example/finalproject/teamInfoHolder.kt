package com.example.finalproject

import android.annotation.SuppressLint
import android.graphics.Color
import androidx.recyclerview.widget.RecyclerView
import com.example.finalproject.databinding.ScheduleItemLayoutBinding
import kotlin.properties.Delegates

class TeamInfoHolder(val binding: ScheduleItemLayoutBinding) :
    RecyclerView.ViewHolder(binding.root) {
    private lateinit var currentPlayer: Player


    @SuppressLint("ResourceAsColor")
    fun bindPlayer(player: Player) {
        currentGame = game
        var result: String = "W"
        binding.WinOrLoss.setTextColor(Color.parseColor("#33cc5a"))

        if (currentGame.AbingtonScore < currentGame.OpponentScore) {
            result = "L"
            binding.WinOrLoss.setTextColor(Color.parseColor("#ff0006"))
        }
        binding.WinOrLoss.text = result
        binding.AHscore.text = currentGame.AbingtonScore.toString()
        binding.otherScore.text = currentGame.OpponentScore.toString()
        binding.otherTeam.text = currentGame.opponentSchool
        binding.otherName.text = currentGame.opponentName
        binding.name.text="Abington Heights"


    }
}
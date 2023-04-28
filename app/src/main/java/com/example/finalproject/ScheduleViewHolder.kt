package com.example.finalproject

import androidx.recyclerview.widget.RecyclerView
import com.example.finalproject.databinding.ScheduleItemLayoutBinding
import kotlin.properties.Delegates

class ScheduleViewHolder(val binding: ScheduleItemLayoutBinding) :
    RecyclerView.ViewHolder(binding.root) {
    private lateinit var currentGame: Game


    fun bindGame(game: Game) {
        currentGame = game
        var result: String = "W"
        if (currentGame.AbingtonScore < currentGame.OpponentScore) {
            result = "L"
        }
        binding.WinOrLoss.text = result
        binding.AHscore.text = currentGame.AbingtonScore.toString()
        binding.otherScore.text = currentGame.OpponentScore.toString()
        binding.otherTeam.text = currentGame.opponentSchool
        binding.otherName.text = currentGame.opponentName

    }
}
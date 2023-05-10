package com.example.finalproject

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.finalproject.databinding.TeamInfoItemLayoutBinding

class PlayerAdapter (val playerList:List<Player>):RecyclerView.Adapter<TeamInfoHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TeamInfoHolder {
        val binding=TeamInfoItemLayoutBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return TeamInfoHolder(binding)
    }

    override fun onBindViewHolder(holder: TeamInfoHolder, position: Int) {
val currentPlayer=playerList[position]
        holder.bindPlayer(currentPlayer)
    }

    override fun getItemCount(): Int {
return playerList.size
    }

}
package com.example.finalproject

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class PlayerAdapter (val playerList:List<Player>):RecyclerView.Adapter<TeamInfoHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TeamInfoHolder {
        return TeamInfoHolder(binding)
    }

    override fun onBindViewHolder(holder: TeamInfoHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

}
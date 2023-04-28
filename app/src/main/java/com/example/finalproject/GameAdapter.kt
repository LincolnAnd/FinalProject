package com.example.finalproject

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.finalproject.databinding.ScheduleItemLayoutBinding

class GameAdapter(val gameList: List<Game>):RecyclerView.Adapter<ScheduleViewHolder>() {
    override fun getItemCount(): Int {
      return gameList.size
    }

    override fun onBindViewHolder(holder: ScheduleViewHolder, position: Int) {
       val currentGame=gameList[position]
       holder.bindGame(currentGame)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ScheduleViewHolder {
        val binding=ScheduleItemLayoutBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ScheduleViewHolder(binding)
    }
}
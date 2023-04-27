package com.example.finalproject

import androidx.recyclerview.widget.RecyclerView
import com.example.finalproject.databinding.ScheduleItemLayoutBinding

class ScheduleViewHolder(val binding:ScheduleItemLayoutBinding)
    :RecyclerView.ViewHolder(binding.root){
        private lateinit var currentGame:Game
}
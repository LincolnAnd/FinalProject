package com.example.finalproject

import android.media.MediaPlayer
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.navigation.findNavController
import com.example.finalproject.databinding.FragmentMenuBinding
import com.example.finalproject.databinding.FragmentTeamInfoBinding
import com.example.finalproject.databinding.TeamInfoItemLayoutBinding
import com.google.android.material.dialog.MaterialAlertDialogBuilder
import com.google.android.material.snackbar.Snackbar

class TeamInfoFragment : Fragment() {
    private var _binding: TeamInfoItemLayoutBinding? = null
    private val binding get() = _binding!!
    private val viewModel:viewModel by viewModels()
    private lateinit var mediaPlayer: MediaPlayer

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = TeamInfoItemLayoutBinding.inflate(inflater, container, false)

            val myAdapter2=PlayerAdapter(viewModel.players)
        binding.recyclerVieww.adapter=myAdapter2
       mediaPlayer = MediaPlayer.create(context, R.raw.music)
        mediaPlayer.start()
        mediaPlayer.isLooping=true
        return binding.root
    }
    override fun onStop() {
        super.onStop()
        mediaPlayer.release()
    }
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}
package com.example.finalproject

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.finalproject.databinding.FragmentMenuBinding
import com.example.finalproject.databinding.FragmentPlayerStatsBinding
import com.google.android.material.snackbar.Snackbar

class PlayerStatsFragment : Fragment() {
    private var _binding: FragmentPlayerStatsBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentPlayerStatsBinding.inflate(inflater, container, false)
val args=PlayerStatsFragmentArgs.fromBundle(requireArguments())
        binding.nameTV.text=args.name
        binding.gradeTV.text=args.grade
        binding.numberTV.text=args.number
        var pic =args.pic
        binding.picTV.setImageResource(pic)
        binding.points.text="Total Points:  "+args.totalP
        binding.fgs.text="Total Feild Goals:  "+args.fg

        Toast.makeText(activity,
            "Great Season "+args.name+"!",
            Toast.LENGTH_LONG).show()

        return binding.root

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}
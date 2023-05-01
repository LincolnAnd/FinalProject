package com.example.finalproject

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.example.finalproject.databinding.FragmentMenuBinding

class MenuFragment : Fragment() {
    private var _binding: FragmentMenuBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentMenuBinding.inflate(inflater, container, false)
        val rootView=binding.root
        val myOnClickListener: View.OnClickListener = View.OnClickListener {view->
            when(view.id){
                R.id.scheduleButton-> rootView.findNavController().navigate(R.id.action_menuFragment_to_scheduleFragment)
                R.id.TeamInfo-> rootView.findNavController().navigate(R.id.action_menuFragment_to_teamInfoFragment)
                R.id.TeamStatsButton-> rootView.findNavController().navigate(R.id.action_menuFragment_to_teamStatsFragment)
                R.id.PhotoGalleryButton-> rootView.findNavController().navigate(R.id.action_menuFragment_to_pictureGalleryFragment)

            }
        }
        binding.scheduleButton.setOnClickListener(myOnClickListener)
        binding.TeamInfo.setOnClickListener(myOnClickListener)
        binding.TeamStatsButton.setOnClickListener(myOnClickListener)
        binding.PhotoGalleryButton.setOnClickListener(myOnClickListener)
        return rootView
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}
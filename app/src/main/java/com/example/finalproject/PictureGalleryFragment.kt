package com.example.finalproject

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentManager
import com.example.finalproject.databinding.FragmentMenuBinding
import com.example.finalproject.databinding.FragmentPictureGalleryBinding
import com.google.android.material.snackbar.Snackbar
import kotlinx.coroutines.NonDisposableHandle.parent


class PictureGalleryFragment : Fragment() {
    private var _binding: FragmentPictureGalleryBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentPictureGalleryBinding.inflate(inflater, container, false)

            Snackbar.make(
                binding.root,
                "Click for game pictures",
                Snackbar.LENGTH_SHORT).show()

        val myOnClickListener: View.OnClickListener = View.OnClickListener { view ->
            when(view.id) {
               
                R.id.button->openWebPage("https://bdnjphoto.com/20221208tahvbb")
                R.id.button2->openWebPage("https://bdnjphoto.com/20221214ahnbb")
                R.id.button3->openWebPage("https://bdnjphoto.com/20221229ahebbb")
                R.id.button4->openWebPage("https://bdnjphoto.com/20230106ahpbbb")
                R.id.button5->openWebPage("https://bdnjphoto.com/20230110ahvvbbb")
                R.id.button6->openWebPage("https://bdnjphoto.com/20230120ahwsbbb")
                R.id.button7->openWebPage("https://bdnjphoto.com/20230124ahhbbb")
                R.id.button8->openWebPage("https://bdnjphoto.com/20230127spahbbb")

            }}
        binding.button.setOnClickListener(myOnClickListener)
        binding.button2.setOnClickListener(myOnClickListener)
        binding.button3.setOnClickListener(myOnClickListener)
        binding.button4.setOnClickListener(myOnClickListener)
        binding.button5.setOnClickListener(myOnClickListener)
        binding.button6.setOnClickListener(myOnClickListener)
        binding.button7.setOnClickListener(myOnClickListener)
        binding.button8.setOnClickListener(myOnClickListener)


        return binding.root
    }
    fun openWebPage(url: String) {
        val webpage: Uri = Uri.parse(url)
        val intent = Intent(Intent.ACTION_VIEW, webpage)
            startActivity(intent)

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}
package com.example.fragments2.Fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.fragments2.R

class SardorbekFragment : Fragment() {

    lateinit var root:View
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        root = inflater.inflate(R.layout.fragment_sardorbek, container, false)

        root.findViewById<TextView>(R.id.tv_info)

            .text = "Sardor og'a fragmanti"
        return root
    }
    }

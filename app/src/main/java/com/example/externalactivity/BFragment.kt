package com.example.externalactivity

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView


class BFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_b, container, false)
        val tv : TextView = view.findViewById(R.id.tvName)
        //val person = arguments?.getString("person")
        //tv.text = person
        val args = BFragmentArgs.fromBundle(requireArguments())
        tv.text = args.name
        return view
    }
}
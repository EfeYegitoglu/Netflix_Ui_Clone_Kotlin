package com.efeyegitoglu.netflixclone

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.appcompat.app.AppCompatActivity

class DownloadsFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_downloads, container, false)

        val toolbar = view.findViewById<androidx.appcompat.widget.Toolbar>(R.id.toolbarDownloads)
        toolbar.title = "İndirilenler"
        setHasOptionsMenu(true)
        (requireActivity() as AppCompatActivity).setSupportActionBar(toolbar)



        return view
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.option_main_activity,menu)
        super.onCreateOptionsMenu(menu, inflater)
    }

}
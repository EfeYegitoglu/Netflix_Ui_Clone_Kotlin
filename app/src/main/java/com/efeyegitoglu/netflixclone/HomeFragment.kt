package com.efeyegitoglu.netflixclone

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class HomeFragment : Fragment() {

    private val categoryList = ArrayList<String>()
    private val categoryItemList= ArrayList<Int>()
    private lateinit var adapter: CategoryAdapter
    private lateinit var homeRecyclerView: RecyclerView



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_home, container, false)


        val toolbar = view.findViewById<androidx.appcompat.widget.Toolbar>(R.id.toolbarMainActivity)
        toolbar.setLogo(R.drawable.netflix_logo)
        toolbar.title = ""
        setHasOptionsMenu(true)
        (requireActivity() as AppCompatActivity).setSupportActionBar(toolbar)



        categoryList.add("Netflix'te Popüler")
        categoryList.add("Gündemdekiler")
        categoryList.add("Sürükleyici Filmler")
        categoryList.add("Komediler")

        categoryItemList.add(R.drawable.film1)
        categoryItemList.add(R.drawable.film2)
        categoryItemList.add(R.drawable.film3)
        categoryItemList.add(R.drawable.film4)
        categoryItemList.add(R.drawable.film5)
        categoryItemList.add(R.drawable.film6)
        categoryItemList.add(R.drawable.film7)
        categoryItemList.add(R.drawable.film8)
        categoryItemList.add(R.drawable.film9)


        homeRecyclerView = view.findViewById(R.id.homeRecycler)
        homeRecyclerView.setHasFixedSize(true)
        homeRecyclerView.layoutManager = LinearLayoutManager(context,LinearLayoutManager.VERTICAL,false)
        adapter = CategoryAdapter(context!!,categoryList,categoryItemList)
        homeRecyclerView.adapter = adapter








        return view
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.option_main_activity,menu)
        super.onCreateOptionsMenu(menu, inflater)
    }

}
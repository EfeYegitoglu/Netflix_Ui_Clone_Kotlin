package com.efeyegitoglu.netflixclone

import android.graphics.drawable.Drawable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ViewPagerAdapter(private var image: List<Int>,private var title: List<String>, private var about: List<String>) :
    RecyclerView.Adapter<ViewPagerAdapter.Pager2ViewHolder>() {

    inner class Pager2ViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        var itemTitle: TextView
        var itemAbout: TextView
        var imageViewPager:ImageView

        init {
            itemTitle = view.findViewById(R.id.textTitle)
            itemAbout = view.findViewById(R.id.textAbout)
            imageViewPager = view.findViewById(R.id.imageViewPager)
        }

    }


    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ViewPagerAdapter.Pager2ViewHolder {
        return Pager2ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.viewpager_item_page,parent,false))
    }

    override fun getItemCount(): Int {
        return title.size
    }

    override fun onBindViewHolder(holder: ViewPagerAdapter.Pager2ViewHolder, position: Int) {
        holder.imageViewPager.setBackgroundResource(image[position])
        holder.itemTitle.text = title[position]
        holder.itemAbout.text = about[position]
    }


}
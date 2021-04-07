package com.efeyegitoglu.netflixclone

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView


class CategoryItemAdapter(
    private val mContext: Context,
    private val categoryItemList: List<Int>,
) :
    RecyclerView.Adapter<CategoryItemAdapter.ViewHolder>() {



    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        var category_item: ImageView


        init {
            category_item = view.findViewById(R.id.category_item)

        }


    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): CategoryItemAdapter.ViewHolder {
        val view = LayoutInflater.from(mContext).inflate(R.layout.category_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(
        holder: CategoryItemAdapter.ViewHolder,
        position: Int,
    ) {
        holder.category_item.setImageResource(categoryItemList[position])
        holder.category_item.setOnClickListener {
            val b = BottomSheetFragment()
            b.show((mContext as MainActivity).supportFragmentManager, "bottomSheet")



        }
    }

    override fun getItemCount(): Int {
        return categoryItemList.size
    }




}
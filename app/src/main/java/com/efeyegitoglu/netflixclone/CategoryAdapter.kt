package com.efeyegitoglu.netflixclone

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class CategoryAdapter(private val mContext: Context, private val mCategoryList: List<String>,private val itemList:List<Int>) :
    RecyclerView.Adapter<CategoryAdapter.ViewHolder>() {


    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        var categoryText: TextView
        var itemRecycler: RecyclerView

        init {
            categoryText = view.findViewById(R.id.textCategory)
            itemRecycler = view.findViewById(R.id.categoryItemRecycler)
        }

    }


    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): CategoryAdapter.ViewHolder {
        return ViewHolder(
            LayoutInflater.from(mContext).inflate(R.layout.layout_home_category, parent, false)
        )
    }

    override fun onBindViewHolder(holder: CategoryAdapter.ViewHolder, position: Int) {
        holder.categoryText.text = mCategoryList[position]
        setCategoryItemRecycler(holder.itemRecycler,itemList)
    }

    override fun getItemCount(): Int {
        return mCategoryList.size
    }

    private fun setCategoryItemRecycler(recyclerView: RecyclerView, categoryItem:List<Int>){

        val itemAdapter = CategoryItemAdapter(mContext,categoryItem)
        recyclerView.layoutManager = LinearLayoutManager(mContext,RecyclerView.HORIZONTAL,false)
        recyclerView.adapter = itemAdapter

    }




}
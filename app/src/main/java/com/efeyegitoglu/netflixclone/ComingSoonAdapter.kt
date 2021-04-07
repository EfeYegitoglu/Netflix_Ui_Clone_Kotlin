package com.efeyegitoglu.netflixclone

import android.content.Context
import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import android.widget.VideoView
import androidx.recyclerview.widget.RecyclerView
import java.util.*

class ComingSoonAdapter(private val mContext: Context, private val mList: List<ComingSoonMovies>) :
    RecyclerView.Adapter<ComingSoonAdapter.ViewHolder>() {

    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        var soonVideoView: VideoView
        var soonMovieBigName: TextView
        var soonMovieDate: TextView
        var soonMovieName: TextView
        var sonMovieSubject: TextView
        var btnNotifications:Button
        var btnInfo:Button


        init {
            soonVideoView = view.findViewById(R.id.soonVideoView)
            soonMovieBigName = view.findViewById(R.id.soonMovieBigName)
            soonMovieDate = view.findViewById(R.id.soonMovieDate)
            soonMovieName = view.findViewById(R.id.soonMovieName)
            sonMovieSubject = view.findViewById(R.id.sonMovieSubject)
            btnNotifications = view.findViewById(R.id.btnNotifications)
            btnInfo = view.findViewById(R.id.btnInfo)

        }
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ComingSoonAdapter.ViewHolder {
        val view = LayoutInflater.from(mContext).inflate(R.layout.coming_soon_layout, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ComingSoonAdapter.ViewHolder, position: Int) {

        val movieVideo = mList[position].movieVideo
        val movieName = mList[position].movieName
        val movieDate = mList[position].movieDate
        val movieSubject = mList[position].movieSubject



        val uri = Uri.parse("android.resource://" + mContext.packageName + "/" + movieVideo)
        holder.soonVideoView.setVideoURI(uri)


        holder.btnNotifications.setOnClickListener {
                holder.soonVideoView.start()
        }

        holder.btnInfo.setOnClickListener {
            holder.soonVideoView.stopPlayback()
        }


        holder.soonMovieBigName.text = movieName
        holder.soonMovieName.text = movieName
        holder.soonMovieDate.text = "Yayın Tarihi: $movieDate"
        holder.sonMovieSubject.text = movieSubject

    }

    override fun getItemCount(): Int {
        return mList.size
    }
}
package com.efeyegitoglu.netflixclone

import java.io.Serializable
import java.util.*

data class ComingSoonMovies(
    val movieId: Int,
    val movieVideo:Int,
    val movieName: String,
    val movieDate: String,
    val movieSubject: String
) :
    Serializable {
}
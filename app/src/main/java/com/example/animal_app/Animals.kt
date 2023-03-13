package com.example.animal_app

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Animals(
    val name: String,
    var decsr :String,
    val img: Int
): Parcelable

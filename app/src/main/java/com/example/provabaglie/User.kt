package com.example.provabaglie

import android.media.Image
import java.io.Serializable

data class User(
    val photo: Image,
    val username: String,
    val age: Int,
    val gender: String,
    val sexualOrientation: String,
    val city: String,
    val position: Int
) : Serializable

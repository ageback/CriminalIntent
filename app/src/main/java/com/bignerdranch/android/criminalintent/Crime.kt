package com.bignerdranch.android.criminalintent

import android.text.format.DateFormat
import java.util.*

data class Crime(
    val id: UUID = UUID.randomUUID(),
    var title: String = "",
    var date: CharSequence = DateFormat.format("yyyy-MM-dd E HH:mm:ss", Date()),
    var isSolved: Boolean = false,
    var requirePolice: Boolean = false
)
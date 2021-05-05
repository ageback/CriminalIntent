package com.bignerdranch.android.criminalintent

import android.text.format.DateFormat
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*

@Entity
data class Crime(
    @PrimaryKey val id: UUID = UUID.randomUUID(),
    var title: String = "",
//    var date: CharSequence = DateFormat.format("yyyy-MM-dd E HH:mm:ss", Date()),
    var date: Date = Date(),
    var isSolved: Boolean = false,
    var suspect: String = ""
//    var requirePolice: Boolean = false
)
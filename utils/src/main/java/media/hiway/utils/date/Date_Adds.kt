package src.main.java.media.hiway.utils.date

import java.text.SimpleDateFormat
import java.util.Date
import java.util.TimeZone

/**
 *   Created by Allan Nava on 25/07/2023.
 *   Updated by Allan Nava on 25/07/2023.
 *
 **/

fun Date.formatDayMonthYear() : String? {
    return try {
        val formatter       = SimpleDateFormat("dd.MM.yyyy")
        formatter.timeZone = TimeZone.getDefault()
        val formattedDate   = formatter.format( this )
        formattedDate
    }catch(e: java.lang.Exception){
        return null
    }
}

fun Date.formatHoursMinutes() : String? {
    return try {
        val formatter       = SimpleDateFormat("HH:mm")
        formatter.timeZone = TimeZone.getDefault()
        val formattedDate   = formatter.format( this )
        formattedDate
    }catch(e: java.lang.Exception){
        return null
    }
}
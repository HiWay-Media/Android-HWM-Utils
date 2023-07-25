package src.main.java.media.hiway.utils.string

/**
 *   Created by Allan Nava on 25/07/2023.
 *   Updated by Allan Nava on 25/07/2023.
 *
 **/

fun String.capitalizeFirstLetter(): String{
    val words = this.split(" ")
    try {
        val sb = StringBuilder()
        if (words[0].length > 0) {
            sb.append(
                Character.toUpperCase(words[0].get(0)) + words[0].subSequence(
                    1,
                    words[0].length
                ).toString().toLowerCase()
            )
            for (i in 1 until words.size) {
                sb.append(" ")
                sb.append(
                    Character.toUpperCase(words[i].get(0)) + words[i].subSequence(
                        1,
                        words[i].length
                    ).toString().toLowerCase()
                )
            }
        }
        return sb.toString()
    }catch (e: Exception) {
        e.printStackTrace()
    }
    return this.trim()
    //words.toString()
}

val String.trimWhitespacesAndNewlines: String
    get() = this.replace("^ | $|\\n ", "")



// replaceDateTime

fun String.replaceDateTime() : String {
    var date = ""
    var state = 0
    var format = ""
    var output = ""
    for (char in this){
        //Log.i("string", "state $state | char $char | date $date" )
        if(state == 3 && char == ')' ){
            //date = date.replace(" ", "T")
            //date = date
            output += date
            state = 0
            continue
        }
        if (state == 3){
            format += char.toString()
            continue
        }
        if(state == 2 && char == ','){
            state = 3
            continue
        }
        if(state == 2 && char != '('){
            date += char.toString()
            continue
        }
        if(state == 1 && char == 'd'){
            state = 2
        }
        if(char == '$'){
            if(state == 0){
                state = 1
            }
        }
        if(state == 0){
            output += char.toString()
        }
    }
    return output
}
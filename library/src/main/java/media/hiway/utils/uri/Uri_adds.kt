package media.hiway.utils.uri

import android.net.Uri
/**
 *   Created by Allan Nava on 25/07/2023.
 *   Updated by Allan Nava on 25/07/2023.
 *
 **/
fun Uri.AddQueryParameters(parameters: Map<String, String>) : Uri {
    val builder = this.buildUpon()
    for (entry in parameters.entries) {
        builder.appendQueryParameter(entry.key, entry.value)
    }
    return builder.build()
}
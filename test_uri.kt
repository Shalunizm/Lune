import android.net.Uri

fun main() {
    val uriStr = "content://com.android.externalstorage.documents/tree/primary%3AMusic%2FAF"
    val uri = android.net.Uri.parse(uriStr)
    println("lastPathSegment: ${uri.lastPathSegment}")
    println("Parsed: ${uri.lastPathSegment?.substringAfterLast("/")?.substringAfterLast(":")}")
}

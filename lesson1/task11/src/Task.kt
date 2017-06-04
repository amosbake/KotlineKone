import java.util.*
import kotlin.Comparator

fun getList(): List<Int> {
    val arrayList = arrayListOf(1, 5, 2)
    Collections.sort(arrayList) { o1, o2 ->
        o2 - o1
    }
    return arrayList
}
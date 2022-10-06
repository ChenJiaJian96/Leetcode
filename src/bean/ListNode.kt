package bean

data class ListNode(
    @JvmField val `val`: Int,
    @JvmField var next: ListNode? = null
) {

    fun valueList(): ArrayList<Int> {
        val data = arrayListOf(`val`)
        var temp = next
        while (temp != null) {
            data.add(temp.`val`)
            temp = temp.next
        }
        return data
    }
}

fun ListNode?.equalsTo(other: ListNode?): Boolean {
    if (this == null && other == null) return true
    if (this == null || other == null) return false
    return this.`val` == other.`val` && this.next.equalsTo(other.next)
}
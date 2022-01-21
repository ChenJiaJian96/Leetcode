package bean

data class ListNode(val `val`: Int) {
    var next: ListNode? = null

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
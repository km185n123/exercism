data class Year(val todo: Int) {

    val isLeap: Boolean =
        (todo % 4 == 0 && todo % 100 != 0) || (todo % 400 == 0)
}
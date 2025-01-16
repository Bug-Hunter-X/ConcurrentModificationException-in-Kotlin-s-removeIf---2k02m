fun main() {
    val list = mutableListOf(1, 2, 3, 4, 5)
    val iterator = list.iterator()
    while (iterator.hasNext()) {
        val number = iterator.next()
        if (number % 2 == 0) {
            iterator.remove()
        }
    }
    println(list)
}
This uses an iterator, which allows for safe removal of elements during iteration. The remove() function of the iterator is specifically designed for this.
fun main() {
    val list = mutableListOf(1, 2, 3, 4, 5)
    list.removeIf { it % 2 == 0 }
    println(list)
}

This code intends to remove even numbers from a list, but it will result in a ConcurrentModificationException if you use the list in a loop while also modifying it inside the loop.  The removeIf function modifies the list directly and thus violates the iterator's assumptions. 
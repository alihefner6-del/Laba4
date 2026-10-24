fun main() {
    val items = mutableListOf("milk", "bread")
    print("Enter item to add: ")
    val newItem = readln()
    items.add(newItem)
    items[0] = "oat milk"
    println("List: $items")
    println("size = ${items.size}")
}
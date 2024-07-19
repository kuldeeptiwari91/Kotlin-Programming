fun main() {
    // Create an instance of ListView with an array of names
    val listView = ListView(arrayOf("John", "Samya", "Keesha", "Girlish"))
    // Access the inner class ListViewItems and call its displayItem method with position 2
    listView.ListViewItems().displayItem(2)
}

// ListView class represents a list view containing an array of items
class ListView(var items: Array<String>) {
    // Inner class ListViewItems provides functionality to interact with the ListView items
    inner class ListViewItems() {
        // Method to display an item at a specific position in the items array
        fun displayItem(position: Int) {
            println(items[position])
        }
    }
}

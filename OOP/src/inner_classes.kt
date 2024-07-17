fun main() {
    val listView = ListView(arrayOf("John", "Samya", "Keesha", "Girlish"))
    listView.ListViewItems().displayItem(2)
}

class ListView(var items: Array<String>) {
    inner class ListViewItems() {
        fun displayItem(position: Int) {
            println(items[position])
        }
    }
}
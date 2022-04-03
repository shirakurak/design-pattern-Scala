package iterator

class BookShelfIterator(bookShelf: BookShelf) extends Iterator {
  var index:Int = 0
  override def hasNext(): Boolean = {
    if (index < bookShelf.getLength()) {
      true
    } else {
      false
    }
  }

  override def next(): Any = {
    val book:Book = bookShelf.getBookAt(index)
    index = index + 1
    book
  }
}
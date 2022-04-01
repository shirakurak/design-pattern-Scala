package iterator

class BookShelfIterator extends Iterator {
  var bookShelf:BookShelf
  var index:Int = 0
  override def hasNext(): Boolean = {
    true
  }

  override def next(): Any = {

  }
}
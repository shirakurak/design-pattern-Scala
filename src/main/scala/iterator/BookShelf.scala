package iterator

class BookShelf(maxsize:Int) extends Aggregate {

  var books:Array[Book]
  var last:Int = 0
  books = new Array[Book](maxsize)

  def getBookAt(index:Int): Book = books(index)

  def appendBook(book:Book): Unit = {
    books(last) = book
    
  }
  override def iterator(): Iterator = BookShelfIterator(that)

}
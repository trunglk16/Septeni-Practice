def linearSearch[T](items: Array[T], seachElem: T) :Boolean = {
  if(items.isEmpty) false
  else if (items.head == seachElem) true
  else linearSearch(items.tail, seachElem)
}


//linearSearch(Array(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 20, 34, 56, 345, 1245), 10
//)
val array1 = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 20, 34, 56,10, 345, 1245)
//array1.contains(10)

def searchIndex[T](var items:List[T],var searchElem: T,var temp:Int) = {
  var listInd = List[Int]()
  var fromIndex = temp
  if (items.isEmpty) false
  else if (items.contains(searchElem) == true) {
    var index = items.indexOf(searchElem,temp)
    listInd = index :: Nil
    items(index) =
    fromIndex = index
    searchIndex(items,searchElem,fromIndex)

  }
  println(listInd)
}


array1.indexOf(10)

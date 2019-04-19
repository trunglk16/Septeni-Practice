def linearSearch[T](items: Array[T], seachElem: T) :Boolean = {
  if(items.isEmpty) false
  else if (items.head == seachElem) true
  else linearSearch(items.tail, seachElem)
}





//linearSearch(Array(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 20, 34, 56, 345, 1245), 10
//)
val array1 = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 20, 34, 56,10, 345, 1245)
//array1.contains(10)

def searchIndex[T](items:List[T],searchElem: T) = {
  var listInd = List[Int]()
  var newItems = List[T]()
  if (items.isEmpty) false
  else if (items.contains(searchElem) == true) {
    var index = items.indexOf(searchElem)
    listInd = index :: Nil
    items(index) =
    newItems = items.drop(index+1)

  }if(newItems.contains(searchElem) == true){
    var 
  }
  println(listInd)
  println(newItems)
}


array1.indexOf(10)
searchIndex(array1,10)

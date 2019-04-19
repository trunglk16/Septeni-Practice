def bubbleSort(numbers: Array[Int]) = {
  for (k <- 1 until numbers.length; j <- 0 until numbers.length -1 ) {
    if (numbers(j) > numbers(j + 1)) {
      val x = numbers(j)
      numbers(j) = numbers(j + 1)
      numbers(j + 1) = x
    }
  }
}

def bubbleSort2(numbers:Array[Int]): Unit = {
  for (k <- 1 until numbers.length; j <- 0 until numbers.length - 1 if numbers(j) > numbers(j+1)) {
    (numbers(j), numbers(j + 1)) match {
      case (x, y) =>
        numbers(j) = y
        numbers(j + 1) = x
    }
  }
}

def bubbleSort3(numbers:Array[Int]):Unit = {
  for (k <- 1 until numbers.length; j <- 0 until numbers.length - k
  if numbers(j) > numbers(j+1)){
    val x = numbers(j)
    numbers(j) = numbers(j+1)
    numbers(j+1) = x
  }
}


val array2 = Array(3, 6, 1, 5, 2, 0, 8)
bubbleSort2(array2)
array2

val array3 = Array(3, 6, 1, 5, 2, 0, 8)
bubbleSort3(array3)
array3

val array1 = Array(3, 6, 1, 5, 2, 0, 8)
bubbleSort(array1)
array1
def merge(left:List[Int], right:List[Int]):List[Int] = {
  val output = (0 until left.length + right.length).foldLeft(List[Int](), left,right) {
    (triple, _)
  }
}
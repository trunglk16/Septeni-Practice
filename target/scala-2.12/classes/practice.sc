object FallWinterSpringSummer extends App{
  for(season <- List("fail","winter","spring"))
    println(season + ": " + calculate(season))
}
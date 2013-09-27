class Anagram(val wordList: List[String]) {

  def generate(word: String) = wordList match {
    case (head :: tail) 
      if (head.toList ::: head.toList).sorted == word.toList.sorted =>
      List(head + " " + head)
    case _ =>
      List()
  }
}
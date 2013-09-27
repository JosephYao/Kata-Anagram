class Anagram(val wordList: List[String]) {

  def generate(word: String) = wordList match {
    case (head :: tail) if head + head == word =>
      List(head + " " + head)
    case _ =>
      List()
  }
}
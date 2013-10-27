class Anagram (val wordList: List[String]) {
  
  def generate(input: String, wordList: List[String] = wordList): List[String] = 
    wordList match {
    case (head :: tail) if head + head == input =>
      List(head + " " + head)
    case (head :: tail) =>
      generate(input, tail)
    case _ =>
      List()
  }

}
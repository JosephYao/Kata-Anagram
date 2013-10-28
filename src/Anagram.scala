class Anagram (val wordList: List[String]) {
  
  def generate(input: String, firstPartOfAnagram: List[String] = wordList,
      secondPartOfAnagram: List[String] = wordList): List[String] = 
    (firstPartOfAnagram, secondPartOfAnagram) match {
    case (headOfFirst :: tailOfFirst, headOfSecond :: tailOfSecond) 
    if headOfFirst + headOfSecond == input =>
      List(headOfFirst + " " + headOfSecond)
    case (headOfFirst :: tailOfFirst, headOfSecond :: tailOfSecond) =>
      generate(input, firstPartOfAnagram, tailOfSecond)
    case (headOfFirst :: tailOfFirst, _) =>
      generate(input, tailOfFirst, wordList)
    case _ =>
      List()
  }

}
class Anagram(val wordList: List[String]) {

  val firstPartOfAnagram = wordList
  
  def generate(input: String) = generateAssist(input, wordList) 
  
  private def generateAssist(input: String, 
      secondPartOfAnagram: List[String]):List[String] =
    (firstPartOfAnagram, secondPartOfAnagram) match {
    case (headOfFirst :: tailOfFirst, headOfSecond :: tailOfSecond) 
    if (headOfFirst + headOfSecond == input) =>
      List(headOfFirst + " " + headOfSecond)
    case (headOfFirst :: tailOfFirst, headOfSecond :: tailOfSecond) =>
      generateAssist(input, tailOfSecond)
    case _ =>
      List()
  } 
}
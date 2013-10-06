class Anagram(val wordList: List[String]) {

  def generate(input: String) = generateAssist(input, wordList, wordList) 
  
  private def generateAssist(input: String, 
      firstPartOfAnagram: List[String], secondPartOfAnagram: List[String]):List[String] =
    (firstPartOfAnagram, secondPartOfAnagram) match {
    case (headOfFirst :: tailOfFirst, headOfSecond :: tailOfSecond) 
    if (headOfFirst + headOfSecond == input) =>
      List(headOfFirst + " " + headOfSecond)
    case (headOfFirst :: tailOfFirst, headOfSecond :: tailOfSecond) =>
      generateAssist(input, firstPartOfAnagram, tailOfSecond)
    case (headOfFirst :: tailOfFirst, _) =>
      generateAssist(input, tailOfFirst, wordList)
    case _ =>
      List()
  }
}
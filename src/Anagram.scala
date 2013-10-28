class Anagram (val wordList: List[String]) {
  
  def generate(input: String, firstPartOfAnagram: List[String] = wordList, 
      secondPartOfAnagram: List[String] = wordList): List[String] = 
    (firstPartOfAnagram, secondPartOfAnagram) match {
    case (headOfFirst :: tailOfFirst, headOfSecond :: tailOfSecond) 
    if isAnagram(input, headOfFirst, headOfSecond) =>
      List(headOfFirst + " " + headOfSecond) ::: 
      generate(input, firstPartOfAnagram, tailOfSecond)
    case (headOfFirst :: tailOfFirst, headOfSecond :: tailOfSecond) =>
      generate(input, firstPartOfAnagram, tailOfSecond)
    case (headOfFirst :: tailOfFirst, _) =>
      generate(input, tailOfFirst, createSecondPartOfAnagram(headOfFirst))
    case _ =>
      List()
  }
  
  private def isAnagram(input: String, headOfFirst: String, headOfSecond: String) = 
    (headOfFirst + headOfSecond).sorted.mkString == input.sorted.mkString
  
  private def createSecondPartOfAnagram(headOfFirst: String) = 
    wordList.drop(wordList.indexOf(headOfFirst) + 1)

}
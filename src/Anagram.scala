class Anagram(val wordList: List[String]) {

  val firstPartOfAnagram = wordList
  
  def generate(input: String) = generateAssist(input, wordList)
  
  def generateAssist(input: String, secondPartOfAnagram: List[String]): List[String] =
    (firstPartOfAnagram, secondPartOfAnagram) match {
    case (headOfFirst :: tailOfFirst, headOfSecond :: tailOfSecond)
    if isAnagram(input, headOfFirst, headOfSecond) =>
      List(headOfFirst + " " + headOfSecond) 
    case (headOfFirst :: tailOfFirst, headOfSecond :: tailOfSecond) =>
      generateAssist(input, tailOfSecond)
    case _ =>
      List()
  }
  
  private def isAnagram(input: String, headOfFirst: String, headOfSecond: String) =  
    (headOfFirst.toList ::: headOfSecond.toList).sorted == input.toList.sorted
}
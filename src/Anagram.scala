class Anagram(val wordList: List[String]) {

  def generate(input: String) = generateAssist(input, wordList, wordList)
  
  def generateAssist(input: String, firstPartOfAnagram: List[String], secondPartOfAnagram: List[String]): List[String] =
    (firstPartOfAnagram, secondPartOfAnagram) match {
    case (headOfFirst :: tailOfFirst, headOfSecond :: tailOfSecond)
    if isAnagram(input, headOfFirst, headOfSecond) =>
      List(headOfFirst + " " + headOfSecond) 
    case (headOfFirst :: tailOfFirst, headOfSecond :: tailOfSecond) =>
      generateAssist(input, firstPartOfAnagram, tailOfSecond)
    case (headOfFirst :: tailOfFirst, _) =>
      generateAssist(input, tailOfFirst, wordList)
    case _ =>
      List()
  }
  
  private def isAnagram(input: String, headOfFirst: String, headOfSecond: String) =  
    (headOfFirst.toList ::: headOfSecond.toList).sorted == input.toList.sorted
}
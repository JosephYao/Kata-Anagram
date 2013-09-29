class Anagram(val wordList: List[String]) {

  def generate(word: String) = generateAssist(word, wordList, wordList) 
  
  def generateAssist(word: String, 
      firstPartOfAnagram: List[String], secondPartOfAnagram: List[String]): List[String] =
    (firstPartOfAnagram, secondPartOfAnagram) match {
    case (headOfFirst :: tailOfFirst, headOfSecond :: tailOfSecond) 
      if (headOfFirst.toList ::: headOfSecond.toList).sorted == word.toList.sorted =>
      headOfFirst + " " + headOfSecond :: generateAssist(word, firstPartOfAnagram, tailOfSecond) 
    case (headOfFirst :: tailOfFirst, headOfSecond :: tailOfSecond) =>
      generateAssist(word, firstPartOfAnagram, tailOfSecond)
    case _ =>
      List()
  }
}
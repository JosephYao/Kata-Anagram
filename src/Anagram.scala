class Anagram(val wordList: List[String]) {

  def generate(input: String) = wordList match {
    case (head :: tail)
    if isAnagram(input, head) =>
      List(head + " " + head)
    case _ =>
      List()
  }
  
  private def isAnagram(input: String, head: String) =  
    (head.toList ::: head.toList).sorted == input.toList.sorted
}
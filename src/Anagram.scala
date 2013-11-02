class Anagram(val wordList: List[String]) {

  def generate(input: String) = 
    for (firstPartOfAnagram <- wordList; 
         secondPartOfAnagram <- wordList.dropWhile(_ != firstPartOfAnagram);
         if isAnagram(firstPartOfAnagram, secondPartOfAnagram, input))
    yield firstPartOfAnagram + " " + secondPartOfAnagram
  
  private def isAnagram(firstPartOfAnagram: String, secondPartOfAnagram: String,
      input: String) = 
    (firstPartOfAnagram + secondPartOfAnagram).sorted == input.sorted
}
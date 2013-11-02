class Anagram(val wordList: List[String]) {

  def generate(input: String): List[String] = {
    if (wordList.isEmpty)
    	return List()
    
    for (firstPartOfAnagram <- wordList; 
         secondPartOfAnagram <- wordList;
         if isAnagram(firstPartOfAnagram, secondPartOfAnagram, input))
    	return List(firstPartOfAnagram + " " + secondPartOfAnagram)
   
    return List()
  }
  
  private def isAnagram(firstPartOfAnagram: String, secondPartOfAnagram: String,
      input: String) = {
    (firstPartOfAnagram + secondPartOfAnagram).sorted == input.sorted
  }
}
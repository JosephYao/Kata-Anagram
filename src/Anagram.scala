class Anagram(val wordList: List[String]) {

  def generate(input: String): List[String] = {
    if (wordList.isEmpty)
    	return List()
    
    for (firstPartOfAnagram <- wordList; 
         secondPartOfAnagram <- wordList;
         if (firstPartOfAnagram + secondPartOfAnagram == input))	
    	return List(firstPartOfAnagram + " " + secondPartOfAnagram)
   
    return List()
  }
}
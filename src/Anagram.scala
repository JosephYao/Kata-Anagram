class Anagram(val wordList: List[String]) {

  def generate(input: String): List[String] = {
    if (wordList.isEmpty)
    	return List()
    
    if (wordList.head + wordList.head == input)	
    	return List(wordList.head + " " + wordList.head)
   
    return List()
  }
}
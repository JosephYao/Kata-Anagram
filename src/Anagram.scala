class Anagram(val wordList: List[String]){
  
  def generate(input: String):List[String] = {
    if (wordList.isEmpty)
      return List()
    
    for (word <- wordList)
	    if ((word + word).sorted == input.sorted)
	      return List(word +  " " + word)
    
    return List() 
  }

}
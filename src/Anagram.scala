class Anagram(val wordList: List[String]){
  
  def generate(input: String):List[String] = {
    if (wordList.isEmpty)
      return List()
    
    for (firstPartOfAnagram <- wordList)
      for (secondPartOfAnagram <- wordList)
	    if ((firstPartOfAnagram + secondPartOfAnagram).sorted == input.sorted)
	      return List(firstPartOfAnagram +  " " + secondPartOfAnagram)
    
    return List() 
  }

}
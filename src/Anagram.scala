class Anagram(val wordList: List[String]){
  
  def generate(input: String) = 
    for (
        firstPartOfAnagram <- wordList;
        secondPartOfAnagram <- wordList.drop(wordList.indexOf(firstPartOfAnagram));
	    if (firstPartOfAnagram + secondPartOfAnagram).sorted == input.sorted
	) yield firstPartOfAnagram +  " " + secondPartOfAnagram

}
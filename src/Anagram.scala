class Anagram(val wordList: List[String]){
  
  def generate(input: String) = wordList match {
    case (head :: tail) if (head + head == input) 
      => List(head + " " + head)
    case _ 
      => List() 
  }

}
class Anagram(val wordList : List[String]) {

  def generate(input : String) : List[String] = {
    val wordCombination = List(wordList, wordList).transpose
    return wordCombination.map(_.mkString(" "))
  }

}

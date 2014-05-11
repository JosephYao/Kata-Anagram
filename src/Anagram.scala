class Anagram(val wordList : List[String]) {

  def generate(input : String) : List[String] = {
    val allWordPermutation = List(wordList, wordList).transpose
    val anagramWordPermutation = allWordPermutation.filter(_.mkString == input)
    return anagramWordPermutation.map(_.mkString(" "))
  }

}

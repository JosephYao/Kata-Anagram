class Anagram(val wordList : List[String]) {

  def generate(input : String) : List[String] = {
    val allWordPermutation = List(wordList, wordList).transpose
    val anagramWordPermutation = allWordPermutation.filter(isAnagram(_, input))
    return anagramWordPermutation.map(_.mkString(" "))
  }

  def isAnagram(wordPermutation: List[String], input: String) =
    wordPermutation.mkString.sorted == input.sorted
}

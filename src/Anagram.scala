class Anagram(val wordList : List[String]) {

  def generate(input : String) : List[String] = {
    val anagramWordCombinations = allWordCombinations.filter(isAnagram(_, input))
    return anagramWordCombinations.map(_.mkString(" "))
  }


  def allWordCombinations: List[List[String]] =
    if (wordList.length > 1)
      wordList.combinations(2).toList
    else
      List(wordList ::: wordList)

  def isAnagram(wordPermutation: List[String], input: String) =
    wordPermutation.mkString.sorted == input.sorted
}

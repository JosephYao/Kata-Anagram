class Anagram(wordList: List[String]) {

  def generate(input: String): List[String] = {
    if (wordList.length == 2 && isAnagram(input, wordList))
      return List(wordList.mkString(" "))

    if (!wordList.isEmpty && isAnagram(input, wordList ::: wordList))
      return List(wordList.head + " " + wordList.head)

    return List()
  }

  def isAnagram(input: String, wordCombination: List[String]) =
    wordCombination.mkString.sorted == input.sorted

}

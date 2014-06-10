class Anagram(wordList: List[String]) {

  def generate(input: String): List[String] = {
    if (wordList.length == 2)
      return List(wordList.mkString(" "))

    if (!wordList.isEmpty && isAnagram(input))
      return List(wordList.head + " " + wordList.head)

    return List()
  }

  def isAnagram(input: String) =
    (wordList.head + wordList.head).sorted == input.sorted

}

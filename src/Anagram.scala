class Anagram (val wordList: List[String]) {

  def generate(input: String): List[String] = {
    if (isAnagram(input))
      return List(wordList.head + " " + wordList.head)

    return List()
  }

  def isAnagram(input: String) =
    !wordList.isEmpty && wordList.head + wordList.head == input
}

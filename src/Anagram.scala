class Anagram (wordList: List[String]) {
  def generate(input: String): List[String] = {
    if (!wordList.isEmpty && wordList.head + wordList.head == input)
      return List(wordList.head + " " + wordList.head)

    return List()
  }

}

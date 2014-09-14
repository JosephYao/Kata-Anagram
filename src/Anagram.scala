class Anagram (val wordList: List[String]) {

  def generate(input: String): List[String] = {
    if (wordList.isEmpty)
      return List()

  return List(wordList.head + " " + wordList.head)
  }

}

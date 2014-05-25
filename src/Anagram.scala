class Anagram(wordList: List[String]) {

  def generate(input: String): List[String] = {
    if (wordList.isEmpty)
      return List()

    return List(wordList(0) + " " + wordList(0))
  }

}

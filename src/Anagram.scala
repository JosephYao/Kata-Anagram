class Anagram (wordList: List[String]) {

  def generate(input: String): List[String] =
  {
    if (wordList.length == 0)
      return List()

    return anagrams
  }

  def anagrams: List[String] =
    List(List(wordList(0), wordList(0))).map(_.mkString(" "))
}

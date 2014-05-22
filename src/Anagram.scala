class Anagram (wordList: List[String]) {

  def generate(input: String): List[String] =
  {
    if (wordList.length == 0)
      return List()

    return anagramStrings(input)
  }

  private def anagramStrings(input: String): List[String] =
    anagramCombinations(input).map(_.mkString(" "))

  private def anagramCombinations(input: String): List[List[String]] =
    List(List(wordList(0), wordList(0))).filter(isAnagramCombination(input, _))

  private def isAnagramCombination(input: String, candidate: List[String]) =
    candidate.mkString.sorted == input.sorted
}

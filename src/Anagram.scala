class Anagram (wordList: List[String]) {

  def generate(input: String): List[String] =
  {
    if (wordList.length == 1)
      return anagramStrings(input, anagramCombinations(input))

    return anagramStrings(input, anagramCombinationsForOtherCases)
  }

  private def anagramCombinationsForOtherCases: List[List[String]] =
    wordList.combinations(2).toList

  private def anagramStrings(input: String, combinations: List[List[String]]): List[String] =
    combinations.map(_.mkString(" "))

  private def anagramCombinations(input: String): List[List[String]] =
    List(List(wordList(0), wordList(0))).filter(isAnagramCombination(input, _))

  private def isAnagramCombination(input: String, candidate: List[String]) =
    candidate.mkString.sorted == input.sorted
}

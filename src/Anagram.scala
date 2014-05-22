class Anagram (wordList: List[String]) {

  def generate(input: String): List[String] =
  {
    val candidates =
      if (wordList.length == 1)
        anagramCandidatesForOneWordList
      else
        anagramCandidatesForOtherCases

    return anagramStrings(candidates.filter(isAnagramCombination(input, _)))
  }

  def anagramCandidatesForOneWordList: List[List[String]] =
    List(wordList ::: wordList)

  private def anagramCandidatesForOtherCases: List[List[String]] =
    wordList.combinations(2).toList

  private def anagramStrings(combinations: List[List[String]]): List[String] =
    combinations.map(_.mkString(" "))

  private def isAnagramCombination(input: String, candidate: List[String]) =
    candidate.mkString.sorted == input.sorted
}

class Anagram (wordList: List[String]) {
  def generate(input: String) = anagrams(input) map output

  private def output(anagrams: List[String]) = anagrams mkString " "

  private def anagrams(input: String) =
    (singleAnagramCandidates ++ doubleAnagramCandidates) filter(isAnagram(input, _))

  def doubleAnagramCandidates = wordList.combinations(2)

  def singleAnagramCandidates = List(wordList, wordList).transpose

  private def isAnagram(input: String, candidates: List[String]) =
    candidates.mkString.sorted == input.sorted
}

class Anagram (wordList: List[String]) {
  def generate(input: String) = anagrams(input) map output

  private def output(anagrams: List[String]) = anagrams mkString " "

  private def anagrams(input: String) =
    (List(wordList, wordList).transpose ++ wordList.combinations(2)).
      filter(isAnagram(input, _))

  private def isAnagram(input: String, candidates: List[String]) =
    (candidates.mkString).sorted == input.sorted
}

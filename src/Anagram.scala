class Anagram (val wordList: List[String]) {
  def generate(input: String) =
    anagrams(input).map(_.mkString(" "))

  def anagrams(input: String) =
    anagramCandidates.filter(isAnagram(input, _))

  def anagramCandidates =
    List(wordList, wordList).transpose ::: wordList.combinations(2).toList

  def isAnagram(input: String, candidates: List[String]) =
    candidates.mkString.sorted == input.sorted
}

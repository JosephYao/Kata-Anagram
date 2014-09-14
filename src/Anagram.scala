class Anagram (val wordList: List[String]) {

  def generate(input: String) =
    anagrams(input).map(_.mkString(" "))

  def anagrams(input: String) =
    (anagramCandidatesFromSingleWord ::: anagramCandidatesFromTwoWords).filter(isAnagram(input, _))

  def anagramCandidatesFromTwoWords =
    wordList.combinations(2).toList

  def anagramCandidatesFromSingleWord =
    List(wordList, wordList).transpose

  def isAnagram(input: String, candidates: List[String]) =
    (candidates.head + candidates.last).sorted == input.sorted
}

class Anagram (wordList : List[String]) {
  def generate(input : String) : List[String] =
    generateAnagrams(input, singleWordCandidates ++ doubleWordCandidates)

  def generateAnagrams(input: String, anagramCandidates: Iterator[List[String]]) =
    anagramCandidates.filter(isAnagram(input, _)).map(_.mkString(" ")).toList

  def singleWordCandidates =
    List(wordList, wordList).transpose.toIterator

  def doubleWordCandidates =
    wordList.combinations(2)

  def isAnagram(input: String, candidates: List[String]) =
    (candidates.head + candidates.last).sorted == input.sorted
}

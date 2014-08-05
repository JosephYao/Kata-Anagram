class Anagram (wordList : List[String]) {
  def generate(input : String) : List[String] = {
    if (wordList.length == 1)
      return generateAnagrams(input, singleWordCandidates)

    return generateAnagrams(input, doubleWordCandidates)
  }

  def generateAnagrams(input: String, anagramCandidates: Iterator[List[String]]) =
    anagramCandidates.filter(isAnagram(input, _)).map(_.mkString(" ")).toList

  def singleWordCandidates =
    List(wordList, wordList).transpose.toIterator

  def doubleWordCandidates =
    wordList.combinations(2)

  def isAnagram(input: String, candidates: List[String]) =
    (candidates.head + candidates.last).sorted == input.sorted
}

class Anagram (wordList: List[String]) {
  def generate(input: String): List[String] = generateAnagramList(input)

  def generateAnagramList(input: String) = anagramCandidates.filter(isAnagram(_, input)).map(_.mkString(" "))

  def anagramCandidates = List(wordList, wordList).transpose ::: wordList.combinations(2).toList

  def isAnagram(candidates: List[String], input: String) =
    (candidates.head + candidates.last).sorted == input.sorted
}

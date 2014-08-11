class Anagram (wordList: List[String]) {
  def generate(input: String): List[String] = {
    if (wordList.isEmpty)
      return List()

      return generateAnagramList(input)
  }

  def generateAnagramList(input: String) = anagramCandidates.filter(isAnagram(_, input)).map(_.mkString(" "))

  def anagramCandidates = List(wordList, wordList).transpose

  def isAnagram(candidates: List[String], input: String) =
    (candidates.head + candidates.last).sorted == input.sorted
}

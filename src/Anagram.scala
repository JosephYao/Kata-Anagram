class Anagram (val wordList: List[String]) {

  def generate(input: String): List[String] = {
    if (wordList.isEmpty)
      return List()

    if (wordList.length == 2 && isAnagram(input, wordList))
      return List(wordList.mkString(" "))

    return anagrams(input).map(_.mkString(" "))
  }

  def anagrams(input: String) =
    List(wordList, wordList).transpose.filter(isAnagram(input, _))

  def isAnagram(input: String, candidates: List[String]) =
    (candidates.head + candidates.last).sorted == input.sorted
}

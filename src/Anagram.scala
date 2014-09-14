class Anagram (val wordList: List[String]) {

  def generate(input: String): List[String] = {
    if (wordList.isEmpty)
      return List()

    return anagrams(input).map(_.mkString(" "))
  }

  def anagrams(input: String) =
    List(wordList, wordList).transpose.filter(candidate => isAnagram(input, candidate.head))

  def isAnagram(input: String, candidate: String) =
    (candidate + candidate).sorted == input.sorted
}

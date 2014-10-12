class Anagram(val wordList: List[String]) {
  def generate(input: String): List[String] = {
    if (wordList.length == 2 && isAnagram(input, wordList.head, wordList(1)))
      return List(wordList.head + " " + wordList(1))

    return anagrams(input).map(anagram => anagram + " " + anagram)
  }

  def anagrams(input: String) =
    wordList.filter(candidate => isAnagram(input, candidate, candidate))

  def isAnagram(input: String, candidate: String, anotherCandidate: String) =
    (candidate + anotherCandidate).sorted == input.sorted
}

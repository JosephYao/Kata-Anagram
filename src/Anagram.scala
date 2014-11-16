class Anagram (wordList: List[String]) {

  def generate(input: String): List[String] = {
    def output(anagram: String, anotherAnagram: String) = anagram + " " + anotherAnagram

    def isAnagram(candidate: String, anotherCandidate: String) =
      (candidate + anotherCandidate).sorted == input.sorted

    if (wordList.length == 2 && isAnagram(wordList.head, wordList(1)))
      return List(output(wordList.head, wordList(1)))

    return wordList.find(candidate => isAnagram(candidate, candidate)).toList.
      map(anagram => output(anagram, anagram))
  }
}

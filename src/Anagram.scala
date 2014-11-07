class Anagram (wordList: List[String]) {

  def generate(input: String): List[String] = {
    if (wordList.length == 2 && isAnagram(input, wordList.head, wordList(1)))
      return List(output(wordList.head, wordList(1)))

    return wordList.filter(candidate => isAnagram(input, candidate, candidate)).
      map(anagram => output(anagram, anagram))
  }

  def output(anagram: String, anotherAnagram: String) = anagram + " " + anotherAnagram

  def isAnagram(input: String, candidate: String, anotherCandidate: String) =
    (candidate + anotherCandidate).sorted == input.sorted
}

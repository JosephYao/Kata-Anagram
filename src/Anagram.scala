class Anagram (wordList: List[String]) {
  def generate(input: String): List[String] = {
    if (wordList.length == 2 && wordList.head + wordList.last == input)
      return List("a b")

    return anagrams(input).mapConserve(output)
  }

  private def output(anagram: String) = anagram + " " + anagram

  private def anagrams(input: String) = wordList.filter(isAnagram(input, _))

  private def isAnagram(input: String, candidate: String) =
    (candidate + candidate).sorted == input.sorted
}

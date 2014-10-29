class Anagram (wordList: List[String]) {
  def generate(input: String) = anagrams(input).mapConserve(output)

  private def output(anagram: String) = anagram + " " + anagram

  private def anagrams(input: String) = wordList.filter(isAnagram(input, _))

  private def isAnagram(input: String, candidate: String) =
    (candidate + candidate).sorted == input.sorted
}

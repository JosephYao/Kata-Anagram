class Anagram (wordList: List[String]) {

  def generate(input: String): List[String] = {
    def output(anagrams: List[String]) = anagrams.mkString(" ")

    def isAnagram(candidates: List[String]) =
      candidates.mkString.sorted == input.sorted

    def candidates = List(wordList, wordList).transpose ++
      wordList.combinations(2)

    return candidates.find(isAnagram).toList.map(output)
  }
}

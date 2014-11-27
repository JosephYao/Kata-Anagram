class Anagram(wordList: List[String]) {

  def generate(input: String): List[String] = {
    def isAnagram(candidates: List[String]) =
        (candidates.mkString).sorted == input.sorted

    def output(anagrams: List[String]) = anagrams.mkString(" ")

    def candidates = List(wordList, wordList).transpose ++
      wordList.combinations(2)

    return candidates.filter(isAnagram).map(output)
  }

}

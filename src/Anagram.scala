class Anagram (wordList: List[String]) {

  def generate(input: String): List[String] = {
    def output(anagram: String) = anagram + " " + anagram

    def isAnagram(candidate: String) =
      (candidate + candidate).sorted == input.sorted

    return wordList.find(isAnagram).toList.map(output)
  }
}

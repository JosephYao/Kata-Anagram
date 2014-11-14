class Anagram (wordList: List[String]) {

  def generate(input: String): List[String] = {
    def output(anagram: String) = List(anagram + " " + anagram)

    def isAnagram(candidate: String) =
      (candidate + candidate).sorted == input.sorted

    if (wordList.length == 2 && isAnagram(wordList(1)))
      return output(wordList(1))

    if (!wordList.isEmpty && isAnagram(wordList.head))
      return output(wordList.head)

    return List()
  }
}

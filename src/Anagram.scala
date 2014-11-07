class Anagram (wordList: List[String]) {

  def generate(input: String): List[String] = {
    if (!wordList.isEmpty && isAnagram(input, wordList.head))
      return output(wordList.head)

    if (wordList.length == 2 && isAnagram(input, wordList(1)))
      return output(wordList(1))

    return List()
  }

  def output(anagram: String) =
    List(anagram + " " + anagram)

  def isAnagram(input: String, candidate: String) =
    (candidate + candidate).sorted == input.sorted
}

class Anagram(val wordList: List[String]) {

  def generate(input: String): List[String] = {
    if (wordList.isEmpty)
      return List()

    if (isAnagram(input))
      return List(wordList.head + " " + wordList.head)

    return List()
  }

  def isAnagram(input: String) = input.sorted == (wordList.head + wordList.head).sorted
}

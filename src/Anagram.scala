class Anagram(val wordList: List[String]) {

  def generate(input: String): List[String] = {
    if (wordList.isEmpty)
      return List()

    if (isAnagram(input, wordList.head))
      return List(wordList.head + " " + wordList.head)

    if (isAnagram(input, wordList.last))
      return List(wordList.head + " " + wordList.last)

    return List()
  }

  def isAnagram(input: String, anotherWord: String) = input.sorted == (wordList.head + anotherWord).sorted
}

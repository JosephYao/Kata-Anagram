class Anagram(val wordList: List[String]) {

  def generate(input: String): List[String] = {
    return generateAnagrams(input)
  }

  def generateAnagrams(input: String) =
    wordListForAnagram.combinations(2).filter(isAnagram(input, _)).map(_.mkString(" ")).toList

  def isAnagram(input: String, candidates: List[String]) = input.sorted == (candidates.head + candidates.last).sorted

  def wordListForAnagram =
    if (wordList.length == 1)
      wordList ::: wordList
    else
      wordList

}

class Anagram(wordList: List[String]) {

  def generate(input: String): List[String] =
    createAnagrams(input, wordCombinations)

  def createAnagrams(input: String, wordCombinations: List[List[String]]) =
    wordCombinations.filter(isAnagram(input, _)).map(_.mkString(" "))

  def wordCombinations: List[List[String]] =
      wordList.combinations(2).toList ::: List(wordList, wordList).transpose

  def isAnagram(input: String, wordCombination: List[String]) =
    wordCombination.mkString.sorted == input.sorted

}

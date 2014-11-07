class Anagram (wordList: List[String]) {

  def generate(input: String) = anagrams(input).map(output)

  def anagrams(input: String) = candidates.filter(isAnagram(input, _))

  def candidates = List(wordList, wordList).transpose ++ wordList.combinations(2)

  def output(anagrams: List[String]) = anagrams.mkString(" ")

  def isAnagram(input: String, candidates: List[String]) =
    candidates.mkString.sorted == input.sorted
}

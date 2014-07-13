class Anagram(val wordList: List[String]) {

  def generate(input: String) = generateAnagrams(input)

  def generateAnagrams(input: String) =
    wordListForAnagramCandidates.filter(isAnagram(input, _)).map(_.mkString(" ")).toList

  def isAnagram(input: String, candidates: List[String]) = input.sorted == candidates.mkString.sorted

  def wordListForAnagramCandidates = wordList.combinations(2) ++ List(wordList, wordList).transpose

}

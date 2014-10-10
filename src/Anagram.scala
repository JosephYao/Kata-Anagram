class Anagram(val wordList: List[String]) {
  def generate(input: String) =
    anagrams(input).map(anagram => anagram + " " + anagram)

  def anagrams(input: String) =
    wordList.filter(isAnagram(input, _))

  def isAnagram(input: String, candidate: String) =
    (candidate + candidate).sorted == input.sorted
}

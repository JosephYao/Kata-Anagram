class Anagram (wordList: List[String]) {

  def generate(input: String) =
    wordList.filter(isAnagram(input, _)).map(output)

  def output(anagram: String) = anagram + " " + anagram

  def isAnagram(input: String, candidate: String) =
    (candidate + candidate).sorted == input.sorted
}

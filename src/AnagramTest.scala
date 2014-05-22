import org.junit.Test
import org.junit.Assert.assertEquals

class AnagramTest {

  @Test def empty_word_list_and_any_input_word {
    assertAnagramEquals(List(), List(), "anyWord")
  }

  @Test def one_word_list_and_double_of_this_word {
    assertAnagramEquals(List("a a"), List("a"), "aa")
    assertAnagramEquals(List("b b"), List("b"), "aa")
    assertAnagramEquals(List("ab ab"), List("ab"), "abab")
  }

  def assertAnagramEquals(expectedAnagrams: List[String], wordList: List[String], input: String) {
    val generator = new Anagram(wordList)
    val anagrams = generator.generate(input)
    assertEquals(expectedAnagrams, anagrams)
  }

}

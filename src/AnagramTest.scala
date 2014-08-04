import org.junit.Test
import org.scalatest.junit.JUnitSuite
import org.junit.Assert.assertEquals

class AnagramTest extends JUnitSuite{

  @Test def empty_word_list_and_input_is_any_word {
    assertAnagramsEquals(List(), "anyWord", List())
  }

  @Test def one_word_list_and_input_is_double_of_this_word {
    assertAnagramsEquals(List("a a"), "aa", List("a"))
    assertAnagramsEquals(List("b b"), "bb", List("b"))
    assertAnagramsEquals(List("ab ab"), "abab", List("ab"))
  }

  @Test def one_word_list_and_input_has_no_anagram {
    assertAnagramsEquals(List(), "ab", List("a"))
  }

  @Test def one_word_list_and_input_is_double_of_this_word_and_characters_order_is_not_same_as_the_word {
    assertAnagramsEquals(List("ab ab"), "abba", List("ab"))
  }

  @Test def two_word_list_and_input_is_the_combination_of_these_two_words {
    assertAnagramsEquals(List("a c"), "ac", List("a", "c"))
    assertAnagramsEquals(List("a d"), "ad", List("a", "d"))
  }

  def assertAnagramsEquals(expectedAnagrams: List[String], input: String, wordList: List[String]) {
    val generator = new Anagram(wordList)
    val anagrams = generator.generate(input)
    assertEquals(expectedAnagrams, anagrams)
  }
}

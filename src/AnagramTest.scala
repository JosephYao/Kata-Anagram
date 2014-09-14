import org.junit.Test
import org.junit.Assert.assertEquals
import org.scalatest.junit.JUnitSuite

class AnagramTest extends JUnitSuite {

  @Test def empty_word_list_and_input_is_any_word {
    assertAnagramsEqual(List(), "anyWord", List())
  }

  @Test def one_word_list_and_input_is_double_of_this_word {
    assertAnagramsEqual(List("a a"), "aa", List("a"))
    assertAnagramsEqual(List("b b"), "bb", List("b"))
    assertAnagramsEqual(List("ab ab"), "abab", List("ab"))
  }

  @Test def one_word_list_and_input_is_not_double_of_this_word {
    assertAnagramsEqual(List(), "bb", List("a"))
  }

  @Test def one_word_list_and_input_contains_double_of_all_characters_but_in_a_different_order {
    assertAnagramsEqual(List("ab ab"), "aabb", List("ab"))
  }

  @Test def any_word_list_and_input_is_double_of_any_word {
    assertAnagramsEqual(List("b b"), "bb", List("a", "b"))
    assertAnagramsEqual(List("c c"), "cc", List("a", "b", "c"))
  }

  @Test def two_word_list_and_input_is_double_of_both_words {
    assertAnagramsEqual(List("a b"), "ab", List("a", "b"))
    assertAnagramsEqual(List("c d"), "cd", List("c", "d"))
  }

  def assertAnagramsEqual(expectedAnagrams: List[String], input: String, wordList: List[String]) {
    val generator = new Anagram(wordList)
    val anagrams = generator.generate(input)
    assertEquals(expectedAnagrams, anagrams)
  }
}

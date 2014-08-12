import org.junit.Test
import org.scalatest.junit.JUnitSuite
import org.junit.Assert.assertEquals

class AnagramTest extends JUnitSuite {
  
  @Test def empty_word_list_and_any_word_input {
    assertAnagramsEqual(List(), "anyWord", List())
  }

  @Test def one_word_list_and_input_is_double_of_this_word {
    assertAnagramsEqual(List("a a"), "aa", List("a"))
    assertAnagramsEqual(List("b b"), "bb", List("b"))
    assertAnagramsEqual(List("ab ab"), "abab", List("ab"))
  }

  @Test def one_word_list_and_input_has_no_anagram {
    assertAnagramsEqual(List(), "aa", List("b"))
  }

  @Test def one_word_list_and_input_is_double_of_all_this_word_characters_but_different_to_spelling_order_of_this_word {
    assertAnagramsEqual(List("ab ab"), "abba", List("ab"))
  }

  @Test def more_than_one_word_list_and_input_is_double_of_any_non_first_word {
    assertAnagramsEqual(List("b b"), "bb", List("a", "b"))
    assertAnagramsEqual(List("b b"), "bb", List("a", "b", "c"))
  }

  @Test def two_word_list_and_input_is_combination_of_these_two_words {
    assertAnagramsEqual(List("a b"), "ab", List("a", "b"))
    assertAnagramsEqual(List("b a"), "ab", List("b", "a"))
  }

  @Test def three_word_list_and_input_is_combination_of_first_and_second_word {
    assertAnagramsEqual(List("a b"), "ab", List("a", "b", "c"))
    assertAnagramsEqual(List("b a"), "ab", List("b", "a", "c"))
  }

  def assertAnagramsEqual(expectedAnagrams: List[String], input: String, wordList: List[String]) {
    val generator = new Anagram(wordList)
    val anagrams = generator.generate(input)
    assertEquals(expectedAnagrams, anagrams)
  }
}

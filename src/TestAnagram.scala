import org.junit.Test
import org.junit.Assert.assertEquals
import org.scalatest.junit.JUnitSuite

class TestAnagram extends JUnitSuite {
  @Test def empty_word_list_and_input_is_any_word {
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

  @Test def one_word_list_and_input_has_double_characters_of_this_word_with_different_order  {
    assertAnagramsEqual(List("ab ab"), "abba", List("ab"))
  }

  @Test def more_than_one_word_list_and_input_has_and_only_has_anagram_of_non_first_word {
    assertAnagramsEqual(List("b b"), "bb", List("a", "b"))
    assertAnagramsEqual(List("c c"), "cc", List("a", "b", "c"))
  }

  @Test def more_than_one_word_list_and_input_has_and_only_has_anagram_of_two_words_of_list {
    assertAnagramsEqual(List("a b"), "ab", List("a", "b"))
    assertAnagramsEqual(List("b c"), "bc", List("a", "b", "c"))
  }

  def assertAnagramsEqual(expectedAnagrams: List[String], input: String, wordList: List[String]) {
    val generator = new Anagram(wordList)
    val anagrams = generator.generate(input)
    assertEquals(expectedAnagrams, anagrams)
  }
}

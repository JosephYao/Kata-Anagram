import org.junit.Test
import org.junit.Assert.assertEquals
import org.scalatest.junit.JUnitSuite

class TestAnagram extends JUnitSuite {

  @Test def empty_word_list_and_input_is_any_word {
    assertAnagramEqual(List(), "anyWord", List())
  }

  @Test def one_word_list_and_input_is_double_of_this_word {
    assertAnagramEqual(List("a a"), "aa", List("a"))
    assertAnagramEqual(List("b b"), "bb", List("b"))
    assertAnagramEqual(List("ab ab"), "abab", List("ab"))
  }

  @Test def one_word_list_and_input_has_no_anagram {
    assertAnagramEqual(List(), "bb", List("a"))
  }

  @Test def one_word_list_and_input_has_anagram_with_different_character_order {
    assertAnagramEqual(List("an an"), "anna", List("an"))
  }

  @Test def more_than_one_word_list_and_input_only_has_anagram_of_non_first_word {
    assertAnagramEqual(List("a a"), "aa", List("b", "a"))
    assertAnagramEqual(List("a a"), "aa", List("c", "b", "a"))
  }

  @Test def more_than_one_word_list_and_input_only_has_anagram_two_words_of_all {
    assertAnagramEqual(List("a b"), "ab", List("a", "b"))
    assertAnagramEqual(List("a b"), "ab", List("c", "a", "b"))
  }

  @Test def input_has_more_than_one_anagrams {
    assertAnagramEqual(List("a bc", "ab c"), "abc", List("a", "bc", "ab", "c"))
    assertAnagramEqual(List("ab ab", "ba ba", "ab ba", "abb a"), "abba", List("ab", "ba", "abb", "d", "c", "a"))
  }

  def assertAnagramEqual(expectedAnagram: List[String], input: String, wordList: List[String]) {
    val generator = new Anagram(wordList)
    assertEquals(expectedAnagram, generator.generate(input))
  }
}

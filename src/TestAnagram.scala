import org.junit.Test
import org.junit.Assert.assertEquals
import org.scalatest.junit.JUnitSuite

class TestAnagram extends JUnitSuite {

  @Test def empty_word_list_and_input_is_any_word {
    assertAnagrams(List(), "anyWord", List())
  }

  @Test def one_word_list_and_input_is_double_of_this_word {
    assertAnagrams(List("a a"), "aa", List("a"))
    assertAnagrams(List("b b"), "bb", List("b"))
    assertAnagrams(List("ab ab"), "abab", List("ab"))
  }

  @Test def one_word_list_and_input_has_no_anagram {
    assertAnagrams(List(), "bb", List("a"))
  }

  @Test def one_word_list_and_input_has_anagram_of_this_word_with_different_character_order {
    assertAnagrams(List("ab ab"), "abba", List("ab"))
  }

  @Test def two_word_list_and_input_only_has_anagram_of_second_word {
    assertAnagrams(List("a a"), "aa", List("b", "a"))
  }

  def assertAnagrams(expectedAnagrams: List[String], input: String, wordList: List[String]) {
    val generator = new Anagram(wordList)
    val anagrams = generator.generate(input)
    assertEquals(expectedAnagrams, anagrams)
  }
}

import org.junit.Test
import org.junit.Assert.assertEquals
import org.scalatest.junit.JUnitSuite

class TestAnagram extends JUnitSuite {

  @Test def empty_word_list_and_any_word {
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

  @Test def one_word_list_and_input_has_double_characters_of_this_word_with_different_order {
    assertAnagramEqual(List("ab ab"), "abba", List("ab"))
  }

  @Test def more_than_one_word_list_and_input_only_is_double_of_non_first_word {
    assertAnagramEqual(List("a a"), "aa", List("b", "a"))
    assertAnagramEqual(List("a a"), "aa", List("c", "b", "a"))
  }

  @Test def more_than_one_word_list_and_input_only_is_combination_of_any_two_words {
    assertAnagramEqual(List("a b"), "ab", List("a", "b"))
    assertAnagramEqual(List("a b"), "ab", List("c", "a", "b"))
  }

  @Test def acceptance_test {
    assertAnagramEqual(List("ab ab", "ba ba", "ab ba", "abb a", "a bba"), "abba", List("ab", "ba", "abb", "a", "bba"))
  }

  def assertAnagramEqual(expected: List[String], input: String, wordList: List[String]) {
    val generator = new Anagram(wordList)
    assertEquals(expected, generator.generate(input))
  }
}

import org.junit.Test
import org.junit.Assert.assertEquals
import org.scalatest.junit.JUnitSuite

class TestAnagram extends JUnitSuite {

  @Test def empty_word_list_and_any_input_word {
    assertAnagramEquals(List(), "anyInput", List())
  }

  @Test def one_word_list_and_double_of_that_word {
    assertAnagramEquals(List("a a"), "aa", List("a"))
    assertAnagramEquals(List("b b"), "bb", List("b"))
  }

  @Test def one_word_list_and_input_has_no_anagram {
    assertAnagramEquals(List(), "bb", List("a"))
  }

  @Test def two_character_word_list_and_input_has_anagram_but_order_is_different {
    assertAnagramEquals(List("ab ab"), "abba", List("ab"))
  }

  @Test def two_word_list_and_input_is_combination_of_these_two_words {
    assertAnagramEquals(List("a b"), "ab", List("a", "b"))
  }
  
  @Test def acceptance_test {
    assertAnagramEquals(List("ab cd", "ab dc", "cd ba", "ba dc"), "abcd", List("ab", "bc", "cd", "ba", "dc"))
  }

  def assertAnagramEquals(expectedAnagrams: List[String], input: String, wordList: List[String]) {
    val generator = new Anagram(wordList)
    assertEquals(expectedAnagrams, generator.generate(input))
  }

}

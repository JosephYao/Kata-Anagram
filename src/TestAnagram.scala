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

  def assertAnagramEqual(expected: List[String], input: String, wordList: List[String]) {
    val generator = new Anagram(wordList)
    assertEquals(expected, generator.generate(input))
  }
}

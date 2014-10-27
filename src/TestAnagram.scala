import org.junit.Test
import org.junit.Assert.assertEquals
import org.scalatest.junit.JUnitSuite

class TestAnagram extends JUnitSuite {

  @Test def empty_word_list_and_any_word {
    assertAnagramEqual(List(), "anyWord", List())
  }

  @Test def one_character_word_list_and_input_is_double_of_this_character {
    assertAnagramEqual(List("a a"), "aa", List("a"))
  }

  def assertAnagramEqual(expected: List[String], input: String, wordList: List[String]) {
    val generator = new Anagram(wordList)
    assertEquals(expected, generator.generate(input))
  }
}

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

  def assertAnagramEquals(expectedAnagrams: List[String], input: String, wordList: List[String]) {
    val generator = new Anagram(wordList)
    assertEquals(expectedAnagrams, generator.generate(input))
  }

}

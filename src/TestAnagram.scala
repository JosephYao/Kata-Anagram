import org.junit.Test
import org.junit.Assert.assertEquals
import org.scalatest.junit.JUnitSuite

class TestAnagram extends JUnitSuite {
  @Test def empty_word_list_and_input_is_any_word {
    assertAnagramsEqual(List(), "anyWord", List())
  }

  @Test def one_character_word_list_and_input_is_double_of_this_character {
    assertAnagramsEqual(List("a a"), "aa", List("a"))
  }

  def assertAnagramsEqual(expectedAnagrams: List[String], input: String, wordList: List[String]) {
    val generator = new Anagram(wordList)
    val anagrams = generator.generate(input)
    assertEquals(expectedAnagrams, anagrams)
  }
}

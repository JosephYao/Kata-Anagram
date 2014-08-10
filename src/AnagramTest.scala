import org.junit.Test
import org.scalatest.junit.JUnitSuite
import org.junit.Assert.assertEquals

class AnagramTest extends JUnitSuite {
  
  @Test def empty_word_list_and_any_word_input {
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

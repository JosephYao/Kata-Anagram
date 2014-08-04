import org.junit.Test
import org.scalatest.junit.JUnitSuite
import org.junit.Assert.assertEquals

class AnagramTest extends JUnitSuite{

  @Test def empty_word_list_and_input_is_any_word {
    assertAnagramsEquals(List(), "anyWord", List())
  }

  @Test def one_character_word_list_and_input_is_double_of_this_character {
    assertAnagramsEquals(List("a a"), "aa", List("a"))
  }

  def assertAnagramsEquals(expectedAnagrams: List[String], input: String, wordList: List[String]) {
    val generator = new Anagram(wordList)
    val anagrams = generator.generate(input)
    assertEquals(expectedAnagrams, anagrams)
  }
}

import org.junit.Test
import org.scalatest.junit.JUnitSuite

import org.junit.Assert.assertEquals

class AnagramTest extends JUnitSuite {

  @Test def empty_word_list_return_no_anagram {
    assertAnagramsEquals(List(), "anyWord", List())
  }

  @Test def one_word_list_and_input_is_double_of_this_word {
    assertAnagramsEquals(List("a a"), "aa", List("a"))
    assertAnagramsEquals(List("b b"), "bb", List("b"))
    assertAnagramsEquals(List("ab ab"), "abab", List("ab"))
  }

  @Test def one_word_list_and_input_is_not_double_of_this_word {
    assertAnagramsEquals(List(), "aa", List("b"))
    assertAnagramsEquals(List(), "aa", List("c"))
  }

  def assertAnagramsEquals(expectedAnagrams: List[String], input: String, wordList: List[String]) {
    val generator = new Anagram(wordList)
    val anagrams = generator.generate(input)
    assertEquals(expectedAnagrams, anagrams)
  }

}

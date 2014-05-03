import org.scalatest.junit.JUnitSuite
import org.junit.Test
import org.junit.Assert.assertEquals
 
class TestAnagram extends JUnitSuite {

  @Test def empty_word_list_and_input_is_any_word {
    assertAnagramsEqual(List(), List(), "anyword")
  }

  @Test def one_word_list_and_input_is_double_of_this_word {
    assertAnagramsEqual(List("a a"), List("a"), "aa")
    assertAnagramsEqual(List("b b"), List("b"), "bb")
    assertAnagramsEqual(List(), List("a"), "bb")
    assertAnagramsEqual(List("ab ab"), List("ab"), "abab")
  }
  
  @Test def more_than_one_word_list_and_input_is_double_of_any_non_first_word {
    assertAnagramsEqual(List("b b"), List("a", "b"), "bb")
    assertAnagramsEqual(List("c c"), List("a", "b", "c"), "cc")
  }
  
  @Test def any_word_list_and_input_is_combination_of_any_two_words {
    assertAnagramsEqual(List("a b"), List("a", "b"), "ab")
    assertAnagramsEqual(List("b d"), List("a", "b", "c", "d"), "bd")
  }

  @Test def input_character_order_is_different_from_anagrams {
    assertAnagramsEqual(List("a b"), List("a", "b"), "ba") 
  } 

  @Test def more_than_one_anagrams {
    assertAnagramsEqual(List("a bc", "a cb"), List("a", "bc", "cb"), "abc") 
    assertAnagramsEqual(List("bc d", "d cb"), List("a", "bc", "d", "cb"), "bcd") 
  }
  
  private def assertAnagramsEqual(expectedAnagrams: List[String], 
      wordList: List[String], input: String) = {
    val generator = new Anagram(wordList)
    val actualAnagrams = generator.generate(input)
    assertEquals(expectedAnagrams, actualAnagrams)
  }

}
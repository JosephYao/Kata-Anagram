import org.scalatest.junit.JUnitSuite
import org.junit.Test
import org.junit.Assert.assertEquals

class TestAnagram extends JUnitSuite {

  @Test def empty_word_list_and_any_word {
    assertAnagramsEquals(List(), List(), "anyword")
  }

  @Test def one_word_list_and_input_is_double_of_this_word {
    assertAnagramsEquals(List("a a"), List("a"), "aa")
    assertAnagramsEquals(List("b b"), List("b"), "bb")
    assertAnagramsEquals(List(), List("a"), "bb")
    assertAnagramsEquals(List("ab ab"), List("ab"), "abab")
  } 
  
  @Test def any_word_list_and_input_is_the_combination_of_first_and_any_other {
    assertAnagramsEquals(List("a b"), List("a", "b"), "ab")
    assertAnagramsEquals(List("a c"), List("a", "b", "c"), "ac")
  }

  @Test def three_word_list_and_input_is_the_combination_of_second_and_third {
    assertAnagramsEquals(List("b c"), List("a", "b", "c"), "bc")
  }
  
  @Test def anagram_has_different_character_order_as_input {
    assertAnagramsEquals(List("a cb"), List("a", "cb"), "abc")
  }
  
  @Test def more_than_one_anagrams {
    assertAnagramsEquals(List("a bc", "a cb"), List("a", "bc", "cb"), "abc")
    assertAnagramsEquals(List("a bcd", "a cbd", "a dcb"), List("a", "bcd", "cbd", "dcb"), "abcd")
  } 

  private def assertAnagramsEquals(expectedAnagram: List[String], 
      wordList: List[String], input: String) = {
	val generator = new Anagram(wordList)
	val actualAnagrams = generator.generate(input)
	assertEquals(expectedAnagram, actualAnagrams)
  }

}
import org.scalatest.junit.JUnitSuite
import org.junit.Test
import org.junit.Assert.assertEquals

class TestAnagram extends JUnitSuite {
  
  @Test def empty_word_list_and_input_is_any_word {
    assertAnagramsEquals(List(), List(), "anyword")
  }
  
  @Test def one_word_list_and_input_is_double_of_this_word {
    assertAnagramsEquals(List("a a"), List("a"), "aa")
    assertAnagramsEquals(List("b b"), List("b"), "bb")
    assertAnagramsEquals(List(), List("a"), "bb")
    assertAnagramsEquals(List("ab ab"), List("ab"), "abab")
  }
  
  @Test def two_words_list_and_input_is_double_of_any_word_except_the_first {
    assertAnagramsEquals(List("b b"), List("a", "b"), "bb")
    assertAnagramsEquals(List("c c"), List("a", "b", "c"), "cc")
  } 
  
  @Test def more_than_one_words_list_and_input_is_the_combination_of_any_two_words {
    assertAnagramsEquals(List("a b"), List("a", "b"), "ab")
    assertAnagramsEquals(List("a c"), List("a", "b", "c"), "ac")
    assertAnagramsEquals(List("b c"), List("a", "b", "c"), "bc")
  }
  
  private def assertAnagramsEquals(
      expectedAnagrams: List[String], wordList: List[String], input: String) = {
    val generator = new Anagram(wordList)
    val actualAnagrams = generator.generate(input)
    assertEquals(expectedAnagrams, actualAnagrams)
  }


}
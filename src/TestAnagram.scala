import org.scalatest.junit.JUnitSuite
import org.junit.Test
import org.junit.Assert.assertEquals

class TestAnagram extends JUnitSuite {

  @Test def empty_word_list_and_any_input {
    assertAnagramsEquals(List(), List(), "anyword")
  }

  @Test def one_word_list_and_input_is_double_of_this_word {
    assertAnagramsEquals(List("a a"), List("a"), "aa")
    assertAnagramsEquals(List("b b"), List("b"), "bb")
    assertAnagramsEquals(List(), List("b"), "aa")
    assertAnagramsEquals(List("ab ab"), List("ab"), "abab")
  }
  
  @Test def anagram_character_order_is_different_from_input_character_order {
    assertAnagramsEquals(List("ba ba"), List("ba"), "abab") 
  }
  
  @Test def more_than_one_word_list_and_input_is_the_first_and_any_other_word {
    assertAnagramsEquals(List("a b"), List("a", "b"), "ab") 
    assertAnagramsEquals(List("a c"), List("a", "b", "c"), "ac") 
  }
  
  @Test def input_is_one_only_combination_of_any_word_in_the_word_list {
    assertAnagramsEquals(List("b c"), List("a", "b", "c"), "bc") 
  }

  private def assertAnagramsEquals(expectedAnagrams: List[String], 
      wordList: List[String], input: String) = {
    val generator = new Anagram(wordList)
    val actualAnagrams = generator.generate(input)
    assertEquals(expectedAnagrams, actualAnagrams)
  }

}
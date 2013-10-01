import org.scalatest.junit.JUnitSuite
import org.junit.Test
import org.junit.Assert.assertEquals

class TestAnagram extends JUnitSuite {

  @Test def empty_word_list_and_any_word {
    assertAnagramsEquals(List(), List(), "anyword")
  }
  
  @Test def one_word_list_and_another_word_that_double_this_word {
    assertAnagramsEquals(List("a a"), List("a"), "aa")
    assertAnagramsEquals(List("b b"), List("b"), "bb")
    assertAnagramsEquals(List("ab ab"), List("ab"), "abab")
  }
  
  @Test def one_word_list_and_another_word_that_double_the_reversed_version_of_this_word {
    assertAnagramsEquals(List("ba ba"), List("ba"), "abab")
    assertAnagramsEquals(List("ca ca"), List("ca"), "acac")
  }
  
  @Test def two_word_list_and_another_word_is_their_combination {
    assertAnagramsEquals(List("a b"), List("a", "b"), "ab")
  }
  
  @Test def three_word_list_and_another_word_is_the_combination_of_first_and_third_word {
    assertAnagramsEquals(List("a c"), List("a", "b", "c"), "ac")
  }
  
  @Test def three_word_list_and_two_anagrams_combination {
    assertAnagramsEquals(List("a bc", "a cb"), List("a", "bc", "cb"), "abc")
  }
  
  @Test def three_word_list_and_another_word_is_the_combination_of_second_and_third {
    assertAnagramsEquals(List("b c"), List("a", "b", "c"), "bc")
  }

  private def assertAnagramsEquals(
      expectedAnagrams: List[String], wordList: List[String], word: String) = {
    val generator = new Anagram(wordList)
    val actualAnagrams = generator.generate(word)
    assertEquals(expectedAnagrams, actualAnagrams)
  }

}
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
  
  @Test def one_word_list_and_another_word_that_double_the_reverse_version_of_this_word {
    assertAnagramsEquals(List("ba ba"), List("ba"), "abab")
    assertAnagramsEquals(List("ca ca"), List("ca"), "acac")
  }

  private def assertAnagramsEquals(
      expectedAnagrams: List[String], wordList: List[String], word: String) = {
    val generator = new Anagram(wordList)
    val actualAnagrams = generator.generate(word)
    assertEquals(expectedAnagrams, actualAnagrams)
  }

}
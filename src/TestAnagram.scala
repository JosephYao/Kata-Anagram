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
  
  private def assertAnagramsEquals(expectedAnagram: List[String], 
      wordList: List[String], input: String) = {
	val generator = new Anagram(wordList)
	val actualAnagrams = generator.generate(input)
	assertEquals(expectedAnagram, actualAnagrams)
  }

}
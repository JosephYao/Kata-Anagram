import org.scalatest.junit.JUnitSuite
import org.junit.Test
import org.junit.Assert.assertEquals

class TestAnagram extends JUnitSuite {

  @Test def empty_word_list_and_any_word {
    assertAnagramsEquals(List(), List(), "anyword")
  }
  
  @Test def one_character_word_list_and_double_this_character_word {
    assertAnagramsEquals(List("a a"), List("a"), "aa")
    assertAnagramsEquals(List("b b"), List("b"), "bb")
  }
  
  private def assertAnagramsEquals(
      expectedAnagrams: List[String], wordList: List[String], word: String) = {
    val generator = new Anagram(wordList)
    val actualAnagrams = generator.generate(word)
    assertEquals(expectedAnagrams, actualAnagrams)
  }

}
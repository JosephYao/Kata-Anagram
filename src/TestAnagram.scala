import org.scalatest.junit.JUnitSuite
import org.junit.Test
import org.junit.Assert.assertEquals

class TestAnagram extends JUnitSuite {

  @Test def empty_word_list_and_any_word {
	val generator = new Anagram
	val actualAnagrams = generator.generate("anyword")
	assertEquals(List(), actualAnagrams)
  }

  
}
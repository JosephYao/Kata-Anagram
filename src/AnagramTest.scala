import org.junit.Test
import org.scalatest.junit.JUnitSuite
import org.junit.Assert.assertEquals

class AnagramTest extends JUnitSuite {
  
  @Test def empty_word_list_and_any_word_input {
    val generator = new Anagram(List())
    val anagrams = generator.generate("anyWord")
    assertEquals(List(), anagrams)
  }

}

import org.junit.Test
import org.junit.Assert.assertEquals
import org.scalatest.junit.JUnitSuite

class TestAnagram extends JUnitSuite {

  @Test def empty_word_list_and_input_is_any_word {
    val generator = new Anagram(List())
    val anagrams = generator.generate("anyWord")
    assertEquals(List(), anagrams)
  }

}

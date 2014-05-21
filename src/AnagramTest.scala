import org.junit.Test
import org.junit.Assert.assertEquals

class AnagramTest {

  @Test def empty_word_list_and_any_input_word {
      val generator = new Anagram(List())
      val anagrams = generator.generate("anyWord")
      assertEquals(List(), anagrams)
  }

}

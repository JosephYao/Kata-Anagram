import org.junit.Test
import org.junit.Assert.assertEquals

class AnagramTest {

  @Test def empty_word_list_and_input_is_any_word {
      val generator = new Anagram(List())
      val anagrams = generator.generate("anyWord")
      assertEquals(List(), anagrams)
  }

}

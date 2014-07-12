import org.junit.Test
import org.scalatest.junit.JUnitSuite

import org.junit.Assert.assertEquals

class AnagramTest extends JUnitSuite {

  @Test def empty_word_list_return_no_anagram {
      val generator = new Anagram(List())
      val anagrams = generator.generate("anyWord")
      assertEquals(List(), anagrams)
  }

}

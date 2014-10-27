import org.junit.Test
import org.junit.Assert.assertEquals
import org.scalatest.junit.JUnitSuite

class TestAnagram extends JUnitSuite {

  @Test def empty_word_list_and_any_word {
    val generator = new Anagram(List())
    assertEquals(List(), generator.generate("anyWord"))
  }

}

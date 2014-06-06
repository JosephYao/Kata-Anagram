import org.junit.Test
import org.junit.Assert.assertEquals

class AnagramTest {

  @Test def empty_word_list_and_input_is_any_word {
    assertAnagramEquals(List(), List(), "anyWord")
  }

  @Test def one_word_list_and_input_is_double_of_this_word {
    assertAnagramEquals(List("a a"), List("a"), "aa")
    assertAnagramEquals(List("ab ab"), List("ab"), "abab")
  }

  @Test def one_word_list_and_input_has_no_anagram {
    assertAnagramEquals(List(), List("a"), "bb")
  }

  @Test def one_word_list_and_input_has_anagram_and_in_random_character_order {
    assertAnagramEquals(List("ab ab"), List("ab"), "bbaa")
  }

  private def assertAnagramEquals(expectedAnagrams: List[String], wordList: List[String], input: String) {
    val generator = new Anagram(wordList)
    val anagrams = generator.generate(input)
    assertEquals(expectedAnagrams, anagrams)
  }

}

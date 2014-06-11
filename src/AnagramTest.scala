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

  @Test def two_word_list_and_input_is_the_combination_of_two_words {
    assertAnagramEquals(List("a b"), List("a", "b"), "ab")
    assertAnagramEquals(List("ac bd"), List("ac", "bd"), "abcd")
  }

  @Test def two_word_list_and_input_has_no_anagram {
    assertAnagramEquals(List(), List("a", "b"), "ac")
  }

  @Test def three_word_list_and_input_has_one_anagram {
    assertAnagramEquals(List("a b"), List("a", "b", "c"), "ab")
  }

  @Test def two_word_list_and_input_is_double_of_first_word {
    assertAnagramEquals(List("a a"), List("a", "b"), "aa")
  }

  private def assertAnagramEquals(expectedAnagrams: List[String], wordList: List[String], input: String) {
    val generator = new Anagram(wordList)
    val anagrams = generator.generate(input)
    assertEquals(expectedAnagrams, anagrams)
  }

}

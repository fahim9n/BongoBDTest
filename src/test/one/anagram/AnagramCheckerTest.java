package test.one.anagram;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AnagramCheckerTest extends TestCase {
    private  final AnagramChecker anagramChecker= new AnagramChecker();

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testAnagramRight() {
        assertEquals(anagramChecker.isAnagram("mona","amon"),true);
    }

    @Test
    public void testAnagramWrong() {
        assertEquals(anagramChecker.isAnagram("mona","okor"),false);
    }


    @Test
    public void testAnagramWithSpace() {
        assertEquals(anagramChecker.isAnagram("mona","n mo   a"),true);
    }

    @Test
    public void testAnagramWithDifferentLength() {
        assertEquals(anagramChecker.isAnagram("mona","mona mona"),false);
    }


}
package br.com.eulen.testeJ5;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.jupiter.api.Test;

public class LibraryTest {
	
	@Before
	public void setUp() {
		System.out.println("Running before");
	}

	@Test 
    public void testSomeLibraryMethod() {
        Library lib = new Library();
        assertTrue("someLibraryMethod should return 'true'", lib.someLibraryMethod());
    }
}

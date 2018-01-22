package devops.numbers;

import org.junit.*;

import devops.numbers.NumberWords;

public class NumberWordsTests {
	private NumberWords numberWords ;
	
	@Before
	public void setup() {
		numberWords = new NumberWords() ;
	}

	@Test
	public void numberOutOfRangeReturnsError() {
		Assert.assertEquals( "Error", "Number out of range", numberWords.toWords( -1 ) ) ;
	}
	
	@Test
	public void convertDigitsToWords() {
		Assert.assertEquals("Three", numberWords.toWords(3));
		Assert.assertEquals("Twenty Five", numberWords.toWords(25));
		Assert.assertEquals("One Hundred", numberWords.toWords(100));
		Assert.assertEquals("Two Hundred Ninety Five", numberWords.toWords(295));
		Assert.assertEquals("Five Hundred", numberWords.toWords(500));
		Assert.assertEquals("Nine Hundred Ninety Nine", numberWords.toWords(999));
		Assert.assertEquals("One Thousand One", numberWords.toWords(1001));
		Assert.assertEquals("Ten Lakh Ten", numberWords.toWords(1000010));
		Assert.assertEquals("Twenty One Crore Seventy Lakh", numberWords.toWords(217000000));
	}
}

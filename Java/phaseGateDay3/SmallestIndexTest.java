public class SmallestIndexTest{
smallestIndex frequency = new smallestIndex();

	@Test
public void indexofSmallestNumber(){

	boolean actual = frequency.smallestIndex();
	boolean expected = true;
	assertEquals(actual, expected);

}
}
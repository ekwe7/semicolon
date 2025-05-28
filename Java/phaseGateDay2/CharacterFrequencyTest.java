public class CharacterFrequencyTest{
numberofCharacterFrequency frequency = new numberofCharacterFrequency();

	@Test
public void checkCharacterFrequencyEquals(){

	boolean actual = frequency.numberofCharacterFrequency();
	boolean expected = true;
	assertEquals(actual, expected);

}
}
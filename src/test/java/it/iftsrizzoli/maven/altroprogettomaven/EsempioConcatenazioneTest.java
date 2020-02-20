package it.iftsrizzoli.maven.altroprogettomaven;

import static org.junit.Assert.assertEquals;

public class EsempioConcatenazioneTest {
	
	public void esempioConcatenazione() {
		
		EsempioConcatenazione uniTest = new EsempioConcatenazione();
		
		String stringa= uniTest.concatenate("Bella ", "Frate");
		//System.out.println(stringa);
		assertEquals("bella frate",stringa);
		
		
	}
	
	
	

}

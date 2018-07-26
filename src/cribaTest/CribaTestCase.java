package cribaTest;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import criba.CribaRefactor;

public class CribaTestCase {

	CribaRefactor criba;
	
	@Before
	public void inicialize()
	{
		criba = new CribaRefactor();
	}
	
	@SuppressWarnings("static-access")
	@Test
	public void primeNumbersTest() {
		int[] primeList = new int[5];
		
		primeList[0] = 2;
		primeList[1] = 3; 
		primeList[2] = 5;
		primeList[3] = 7;
		
		assertFalse(primeList.equals(criba.generaCriba(10)));
	}

}

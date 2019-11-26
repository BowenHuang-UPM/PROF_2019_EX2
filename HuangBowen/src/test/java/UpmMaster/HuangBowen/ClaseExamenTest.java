package UpmMaster.HuangBowen;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import junit.framework.TestCase;

public class ClaseExamenTest {

	@Test
	public void test(){
		ClaseExamen ce = new ClaseExamen();
		
		//n = 6
		List<Integer> result1 = null;
		result1.add(2);
		result1.add(3);
		try {
			TestCase.assertEquals(result1, ce.primos(6));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		//n = 13
		List<Integer> result2 = null;
		result2.add(13);
		try {
			TestCase.assertEquals(result2, ce.primos(13));
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		//n = 25
		List<Integer> result3 = null;
		result3.add(5);
		try {
			TestCase.assertEquals(result3, ce.primos(25));
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
		//entradaInvalida
		String result4 = "EntradaInvalida";
		try {
			TestCase.assertEquals(result4,ce.primos(0));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

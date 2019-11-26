package UpmMaster.HuangBowen;

import java.util.ArrayList;
import java.util.List;

public class ClaseExamen {

	static List<Integer> result = null;
	static int i = 2;
	
	public static List<Integer> primos (int n) throws Exception{
		if(n >= 2) {
			while(i <= n) {
				if(n % i == 0) {
					result.add(i);
					n = n / i;
				}else {
					 i++;
				}
			}			
		}else {
			throw new Exception("EntradaInvalida");
		}		
		return result;
	}
}

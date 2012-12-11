package serpis;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Test;


public class PArrayTest {

	@Test
	public void posicionDe() {
		int[] v1 = new int[]{5, 17, 15, 10, 3, 9};
		
		int pos;
		
		pos = PArray.posicionDe(v1, 33);
		Assert.assertEquals(-1, pos);
		
		pos = PArray.posicionDe(v1, 5);
		Assert.assertEquals(0, pos);
		
		pos = PArray.posicionDe(v1, 9);
		Assert.assertEquals(5, pos);
		
		int[] v2 = new int[]{};
		pos = PArray.posicionDe(v1, 77);
		Assert.assertEquals(-1, pos);
		
	}

	@Test
	public void menor(){
		int[] v1= new int []{5,17,15,10,3,9};
		int m1 = PArray.menor (v1);
		Assert.assertEquals(3, m1);
		
		Assert.assertEquals(4, PArray.menor(new int[]{4,6,5}));
		Assert.assertEquals(7, PArray.menor(new int[]{8,9,7}));
		
		
	}
	
	@Test (expected=IndexOutOfBoundsException.class)
	public void menorVacio(){
		int[] vacio =new int[]{}; 
		PArray.menor(vacio);
		
	}
}

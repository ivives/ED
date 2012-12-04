package serpis;

public class PArray {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] v = new int[] {5, 17, 15, 10, 3, 9};
		int m = menor (v);
		
		int pos = posicionDe (v ,3); 
		System.out.println( "m1 = " + m);
		System.out.println("pos = " + pos);

			
	}

	public static int posicionDe (int [] v , int x) {
		
		int cont = v.length;
		int index = 0;
		
		
		while (index < cont && v[index] != x){
			index ++;
		}
		return index == cont ? -1 : index;
				
	}
	
	private static int menor (int[] v){
		int m = v[0];
		for (int index = 0; index < v.length; index ++)
			if (v[index] < m)
				m = v [index];
			

		/*
		int index = 1;
		while (index < v.length){
			if (v[index] < m)
				m = v [index];
			index++;
		}
		*/
		return m;
		
	}
	
	private static int menorBis (int[] v){
		int posicionMenor = 0;
		for (int index = 1; index < v.length; index ++)
			if (v[index] < v[posicionMenor])
				posicionMenor = index;
		
		return v[posicionMenor];
	}
	
	private static int menorTris (int[] v){
		int m = v [0];
		for (int item : v)
			if (item < m)
				m = item;
		
		return m;
	
	}
	
	
}

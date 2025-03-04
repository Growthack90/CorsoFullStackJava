package esercitazione_AntonioPagano;

/*******************************************************/
//ESERCIZI ANTONIO PAGANO
/*******************************************************/
//ARRAY 1
public class Arrays {

	public static void main(String[] args) {

		int[] tmp = {1,3,46,89,90,4,3,2,7,8};
	

		for (int i = 0; i < tmp.length; i++) {
			if(tmp[i] %2 != 0)
			{
				for (int j = i+1; j < tmp.length; j++) {
					if(tmp[j] %2 == 0)
					{
						int t = tmp[i];
						tmp[i]= tmp[j];
						tmp[j] = t;
					}
				}

			}
		}
		
		
	}

}


//ARRAY 2
//public class Arrays {
//
//	public static void main(String[] args) {
//
//		int[] tmp = {3,4,7,10,30,37,5};
//		int[] tmp2 = new int[7];
//
//		//trovo tutti i numeri pari
//		int posPari = 0;
//		for (int i = 1; i < tmp.length; i++) {
//			if(tmp[i] %2 == 0)
//			{
//				tmp2[posPari] = tmp[i];
//				posPari++;
//
//			}
//		}
//		
//		//trovo tutti i numeri dipari
//		int posDispari = posPari;
//		for (int i = 1; i < tmp.length; i++) {
//			if(tmp[i] %2 != 0)
//			{
//				tmp2[posDispari] = tmp[i];
//				posDispari++;
//
//			}
//		}		
//		
//		//stampa array ordinato
//		for (int i = 1; i < tmp.length; i++) {
//			System.out.println(tmp2[i]);
//		}
//	}
//
//}


//ARRAY 3
//public class Arrays {
//	public static void main(String[] args) {
//		int[] r = { 20, 10, 5, 4, 3, 2, 1 };
//
//		int index = r.length - 1;
//		for (int i = 0; i < r.length / 2; i++) {
//			int tmp = r[i];
//			r[i] = r[index];
//			r[index] = tmp;
//			index--;
//		}
//
//		for (int k = 0; k < r.length; k++) {
//			System.out.println(r[k]);
//		}
//	}
//
//}


//ARRAY 4
//public class Arrays {
//	public static void main(String[] args) {
//		int[] r = { 20, 10, 5, 4, 3, 2, 1 };
//
//		int index = r.length - 1;
//		for (int i = 0; i < r.length / 2; i++) {
//			int tmp = r[i];
//			r[i] = r[index];
//			r[index] = tmp;
//			index--;
//		}
//
//		for (int k = 0; k < r.length; k++) {
//			System.out.println(r[k]);
//		}
//	}
//
//}



//ARRAY 5
//public class Arrays {
//
//	public static void main(String[] args) {
//
//		int[] tmp = {10,3,2,2,3};
//		
//		//troviamo il piu piccolo
//		int min = tmp[0];
//		int indexMin = 0;
//		for (int i = 0; i < tmp.length; i++) {
//			if(tmp[i] < min)
//			{
//				min = tmp[i];
//				indexMin = i;
//			}
//		}
//		
//		int minSecondo = 0;	
//		for (int i = 0; i < tmp.length; i++) {
//			if(tmp[i] != min)
//			{
//				minSecondo = tmp[i];
//			}
//		}
//		
//		// troviamo il secondo più piccolo
//		for (int i = 0; i < tmp.length; i++) {
//			if(tmp[i] < minSecondo && tmp[i] != min)
//			{
//				minSecondo = tmp[i];
//			}
//		}
//		
//		System.out.println("il minimo è:"+min);
//		System.out.println("il secondo minimo è:"+minSecondo);		
//	}
//
//}



//ARRAY 6
//public class Arrays {
//
//	public static void main(String[] args) {
//
//		int n = 5;
//		int[][] matrix = new int[n][n];
//
//		for (int i = 0; i < n; i++) {
//
//			for (int j = 0; j <= i; j++) {
//				if (j == 0 || j == i) {
//					matrix[i][j] = 1;
//
//				} else {
//					int tmp = matrix[i - 1][j - 1] + matrix[i - 1][j];
//					matrix[i][j] = tmp;
//				}
//			}
//
//		}
//
//		for (int i = 0; i < n; i++) {
//
//			for (int j = 0; j <= i; j++) {
//				System.out.print(matrix[i][j]);
//			}
//			System.out.println("");
//		}
//
//	}
//
//}



//ARRAY 7
//public class Arrays {
//
//	public static void main(String[] args) {
//
//		int[] tmp = { 3, 4, 6, 8 };
//
////		// shift verso sinistra
////		for (int i = 0; i < tmp.length - 1; i++) {
////			tmp[i] = tmp[i + 1];
////		}
//
//		
//		// shift verso destra
////		for (int i = tmp.length-1; i>0 ; i--) {
////			
////			tmp[i] = tmp[i-1];
////					
////		}
//		
//		
////		// rotazione verso sinistra
////		int first = tmp[0];
////		for (int i = 0; i < tmp.length - 1; i++) {
////			tmp[i] = tmp[i + 1];
////		}	
////		tmp[tmp.length-1] = first;
//
//		
//		// rotazione verso destra
//		int last = tmp[tmp.length-1];
//		for (int i = tmp.length-1; i>0 ; i--) {
//			
//			tmp[i] = tmp[i-1];
//					
//		}
//		tmp[0] = last;
//		
//		// stampa
//		for (int i = 0; i < tmp.length; i++) {
//			System.out.println(tmp[i]);
//
//		}
//
//	}
//
//}
/*******************************************************/
/*******************************************************/
/*******************************************************/

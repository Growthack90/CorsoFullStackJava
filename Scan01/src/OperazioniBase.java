/*******************************************************************************/
// CON METODO NON STATIC
/*******************************************************************************/
//public class OperazioniBase {
//	
//	public double somma(double a, double b) {
//		return a + b;
//	}
//	public double sottrazione(double a, double b) {
//        return a - b;
//    }
//	public double moltiplicazione(double a, double b) {
//        return a * b;
//    }
//	public double divisione(double a, double b) {
//		if (b!=0) {
//            return a / b;
//        } else {
//            throw new ArithmeticException("Impossibile eseguire la divisione per zero.");
//        }
//    }
//	}
/*******************************************************************************/


/*******************************************************************************/
//// CON METODO STATIC
/*******************************************************************************/
//public class OperazioniBase {
//	
//	public static double somma(double a, double b) {
//		return a + b;
//	}
//	public static double sottrazione(double a, double b) {
//		return a - b;
//	}
//	public static double moltiplicazione(double a, double b) {
//		return a * b;
//	}
//	public static double divisione(double a, double b) {
//		if (b!=0) {
//			return a / b;
//		} else {
//			throw new ArithmeticException("Impossibile eseguire la divisione per zero.");
//		}
//	}
/*******************************************************************************/


/*******************************************************************************/
	// CON THIS (IN QUESTO CASO NON C'E' BISOGNO DI USARE IL METODO STATIC)
/*******************************************************************************/
	public class OperazioniBase {
		
	    public double a, b;
		
		public double somma() {
			return this.a + this.b; // this fa riferimento all'oggetto della variabile chiamante
		}
		public double sottrazione() {
            return this.a - this.b;
        }
		public double moltiplicazione() {
            return this.a * this.b;
        }
		public double divisione() {
			if (b!=0) {
				return this.a / this.b;
			} else {
				throw new ArithmeticException("Impossibile eseguire la divisione per zero.");
			}
			
		}
}
/*******************************************************************************/
	
	

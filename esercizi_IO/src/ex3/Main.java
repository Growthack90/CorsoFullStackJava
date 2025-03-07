package ex3;

public class Main {
	public static void main(String[] args) {

		// metodo readString()
		IO.println("Inserisci il tuo nome: ");
		String nome = IO.readString();
		IO.println("Ciao " + nome + "!");
		System.out.println("La variabile nome è di tipo: " + nome.getClass().getSimpleName());

		// aggiuntivo: per comprendere la conversione di tipo stringa in intero
		IO.println("Inserisci la tua età: ");
		String etaStringa = IO.readString();
		System.out.println("La variabile etaStringa è di tipo: " + etaStringa.getClass().getSimpleName());
		int eta = Integer.parseInt(etaStringa);
		IO.println("Hai " + eta + " anni.");
		System.out.println("La variabile eta è di tipo: " + Integer.TYPE.getSimpleName());

		System.out.println("-----------------------------------");

		// metodo readInt()
		IO.println("Inserisci la tua età: ");
		int eta2 = IO.readInt();
		IO.println("Hai " + eta2 + " anni.");

		// CONDIZIONI
		if (eta2 >= 14 && eta2 < 18) {
			IO.println("Sei semi-maggiorenne");
			IO.println("cioè puoi guidare un motorino");
		} else if (eta2 >= 18 && eta2 < 25) {
			IO.println("Sei maggiorenne");
			IO.println("cioè puoi votare, guidare, ecc...");
		} else if (eta2 >= 25 && eta2 < 75) {
			IO.println("Sei non solo maggiorenne, ma puoi votare anche per il Senato");
		} else if (eta2 >= 75 && eta2 < 105) {
			IO.println("Sei un po' vecchiotto");
			IO.println("ma puoi ancora guidare, votare");
		} else if (eta2 >= 105) {
			IO.println("Sei un po' troppo vecchio");
			IO.println("ma puoi ancora guidare, votare se ce la fai");
		} else {
			IO.println("Sei minorenne");
			IO.println("cioè non puoi guidare, votare, ecc...");
		}
		System.out.println("-----------------------------------");

		// metodo readDouble()
		IO.println("Inserisci il tuo peso: ");
		double peso = IO.readDouble();
		IO.println("Il tuo peso è: " + peso + " kg.");

		System.out.println("-----------------------------------");

		IO.println("Inserisci il numero del giorno della settimana!");
		int numero_del_giorno = IO.readInt();
		if (numero_del_giorno >= 1 && numero_del_giorno <= 7) {
			// USO DEL COSTRUTTO IF-ELSE
			// quando siamo qui POSSIAMO essere sicuri che numero_del_giorno è compreso tra
			// 1 e 7
			if (numero_del_giorno == 1) {
				IO.println(" Hai scelto Lunedì");
			} else if (numero_del_giorno == 2) {
				IO.println(" Hai scelto Martedì");
			} else if (numero_del_giorno == 3) {
				IO.println(" Hai scelto Mercoledì");
			} else if (numero_del_giorno == 4) {
				IO.println(" Hai scelto Giovedì");
			} else if (numero_del_giorno == 5) {
				IO.println(" Hai scelto Venerdì");
			} else if (numero_del_giorno == 6) {
				IO.println(" Hai scelto Sabato");
			} else // per forza deve essere 7
			{
				IO.println(" Hai scelto Domenica");
			}
			// FINE del blocco che scatta se comunque è compreso tra 1 e 7
			/*
			 * Dato che si tratta DI UNA VERIFIA DI UGUAGLIANZA E NON DI UN INTERVALLO O DI
			 * MAGGIORI O MINORI E CI SONO TANTI IF-ELSE IF... ELSE... Possiamo sostituirlo
			 * con un costrutto switch
			 */

			// USO DEL COSTRUTTO SWITCH
			switch (numero_del_giorno) {
			case 1:
				IO.println("Hai scelto Lunedì");
				break;
			case 2:
				IO.println("Hai scelto Martedì");
				break;
			case 3:
				IO.println("Hai scelto Mercoledì");
				break;
			case 4:
				IO.println("Hai scelto Giovedì");
				break;
			case 5:
				IO.println("Hai scelto Venerdì");
				break;
			case 6:
				IO.println("Hai scelto Sabato");
				break;
			default:
				IO.println("Hai scelto Domenica");
				break;
			}
		} else {
			IO.println("Numero non valido");
		}

		System.out.println("-----------------------------------");

		// CICLI
		// Ciclo While 
		int x;
		do {
 
				IO.println("Inserisci un numero intero");
				x = IO.readInt();
				if (x%2 != 0)
					System.out.println("Hai inserito un numero dispari, inserisci un numero pari: ");	} 
		while (x%2 != 0);
		IO.println("BRAVO HAI MESSO UN PARI FINITO");
		/*
		 * Il while è un costrutto che ripete un blocco di istruzioni
		 * fintantochè la condizione che è indicata nel while risulta vera.
		 * Può ripetere quel blocco all'infinito (se la condizione non cambia) 
		 * o può ripeterla solo un certo numero di volte... bloccandosi quando la condizione non è più vera!
		 */


		// TABELLINE
		IO.println("Scegli la base:");
		int base = IO.readInt();
		IO.println("Tabellina del :" + base);
		// CICLO FOR
//		for (int i = 1; i <= 10; i++) {
//            System.out.println(base + " * " + i + " = " + (base * i));
//        }
		/*
		 * Il for è un costrutto che permette di iterare su un range di numeri.
		 * In questo caso, il for viene eseguito 10 volte, cioè fino a quando i viene incrementato fino a 11.
		 * Inoltre, l'incremento viene eseguito nella stessa riga di codice,
		 * che è il modo più comune di utilizzare il for in Java.
		 */
		// CICLO WHILE
//		int i = 1;
//        while (i <= 10) {
//            System.out.println(base + " * " + i + " = " + (base * i));
//            i++;
//        }
        
//        // CICLO DO-WHILE
        int i = 1;
        do {
            System.out.println(base + " * " + i + " = " + (base * i));
            i++;
        } while (i <= 10);
        
        System.out.println("-----------------------------------");    
      
        String risposta = "SI";
        do {
            IO.println("Scegli la base");
            int base2 = IO.readInt();
            IO.println("Tabellina del " + base2);

            int n = 1;
            while (n <= 10) {
                IO.println(base2 + " x " + n + " = " + (base2 * n));
                n++;
            }

            do {
                IO.println("Vuoi ripetere sto giochetto? (SI/NO)");
                risposta = IO.readString();
                risposta = risposta.toUpperCase(); // transform to uppercase
            } while (!risposta.equals("SI") && !risposta.equals("NO"));

        } while (risposta.equals("SI"));

        IO.println("Arrivederci");
        
        
		System.out.println("-----------------------------------");    
	}
}
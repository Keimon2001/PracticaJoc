
package uf4practicajoc.exercici3;

import java.util.Scanner;
import static uf4practicajoc.exercici3.Aplicacio.joc;


public class JocAdivinaNumero extends Joc {
    private int numeroAEndevinar;
    public JocAdivinaNumero(int vides, int numero) {
        super(vides);
        this.numeroAEndevinar = numero;
    }
    /**
     * Mètode escencial on es produeix tota l'acció del joc. 
     * Aquest metode demana que endevinis un numero de 0 a 10
     * Despres fa comparacions necesaries per al joc.
     * Si es diferent et treu una vida, si es igual has guanyat
     * I tambe et diu si es mes gran o mes petit.
     */
    @Override
    public void juga() {
        reiniciaPartida();
        System.out.println("Endevina un número entre 0 i 10:");
        int numeroEndevinat = llegirSencerTeclat();

        while (numeroEndevinat != this.numeroAEndevinar) {
            if (!treureVida()) {
                System.out.println("Has perdut! El número era: " + this.numeroAEndevinar);
                return;
            }

            if (numeroEndevinat > this.numeroAEndevinar) {
                System.out.println("El número és més petit.");
            } else {
                System.out.println("El número és més gran.");
            }

            System.out.println("Torna-ho a intentar:");
            numeroEndevinat = llegirSencerTeclat();
        }
        System.out.println("Has encertat!!");
        actualitzaRecord(joc);
    }
     /**
      * Métode per a llegir un enter, si no es un enter, t'ho torna a demanar. 
     */
    private int llegirSencerTeclat() {
        Scanner teclat = new Scanner(System.in);
        while (!teclat.hasNextInt()) {
            System.out.println("Has d'entrar un número enter!");
            teclat.nextLine();
        }
        return teclat.nextInt();
    }
}

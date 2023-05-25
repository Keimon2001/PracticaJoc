package uf4practicajoc.exercici7.jocs.numeros;

import uf4practicajoc.exercici7.jocs.interficies.Jugable;
import uf4practicajoc.exercici7.jocs.Joc;
import java.util.Scanner;


public  class JocAdivinaNumero extends Joc implements Jugable {

    protected int vides;
    protected int numeroAEndevinar;

    /**
     *
     * @param vides
     * @param numero
     */
    public JocAdivinaNumero(int vides, int numeroAEndevinar) { 
        super(vides);
        this.vides = vides;
        this.numeroAEndevinar = numeroAEndevinar;
        
    }

    /**
     * Mètode escencial on es produeix tota l'acció del joc. Aquest metode
     * demana que endevinis un numero de 0 a 10 Despres fa comparacions
     * necesaries per al joc. Si es diferent et treu una vida, si es igual has
     * guanyat I tambe et diu si es mes gran o mes petit.
     */
    @Override
       public void juga() {
        reiniciaPartida();
        System.out.println("Endevina un número entre 0 i 10: ");

        int numeroEndevinat = llegirSencerTeclat();
        boolean numeroValid = validaNumero(numeroEndevinat);

        while (!numeroValid) {
            System.out.println("Has introduït un número no valid.");
            System.out.println("Torna-ho a intentar:");
            numeroEndevinat = llegirSencerTeclat();
            numeroValid = validaNumero(numeroEndevinat);
        }

        for (int i = 0; i < vides; i++) {
            if (numeroEndevinat == numeroAEndevinar) {
                System.out.println("Has encertat!!");
                actualitzaRecord();
                return;
            } else {
                System.out.println("No has encertat el número");
                if (!treureVida()) {
                    System.out.println("Has perdut");
                    return;
                }
                mostrarVidesRestants();
            }

            if (numeroEndevinat > this.numeroAEndevinar) {
                System.out.println("El número és més petit.");
            } else {
                System.out.println("El número és més gran.");
            }

            System.out.println("Torna-ho a intentar:");
            numeroEndevinat = llegirSencerTeclat();
            numeroValid = validaNumero(numeroEndevinat);

            while (!numeroValid) {
                System.out.println("Has introduït un número no valid.");
                System.out.println("Torna-ho a intentar:");
                numeroEndevinat = llegirSencerTeclat();
                numeroValid = validaNumero(numeroEndevinat);
            }
        }

        System.out.println("Has perdut");
    }


    /**
     * Métode per a llegir un enter, si no es un enter, t'ho torna a demanar.
     */
    private int llegirSencerTeclat() {
        Scanner teclat = new Scanner(System.in);
        int a = 0;
        while (!teclat.hasNextInt()) {
            System.out.println("Has d'entrar un número enter!");
            teclat.nextLine();
            
        }
        return teclat.nextInt();
    }
    


    public boolean validaNumero(int numero){
        return true;
    }

    @Override
    public void mostraNom() {
        System.out.println("Endevina un número");
    }

    @Override
    public void mostraInfo() {
        System.out.println("En aquest joc has d'introduïr numeros fins que endevinis el número corresponent. Tindras 3 vides.");
    }

}

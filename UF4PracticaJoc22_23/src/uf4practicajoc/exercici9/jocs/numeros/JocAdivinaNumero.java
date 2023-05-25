package uf4practicajoc.exercici9.jocs.numeros;


import java.util.Random;
import java.util.Scanner;
import uf4practicajoc.exercici9.jocs.interficies.Jugable;
import uf4practicajoc.exercici9.jocs.Joc;

public class JocAdivinaNumero extends Joc implements Jugable {
    
    Random random;
    private int vides;
    int numeroAEndevinar;

    public JocAdivinaNumero(int vides) { 
        super(vides);
        this.vides = vides;
        random = new Random(System.currentTimeMillis());
    }

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

    private int llegirSencerTeclat() {
        Scanner teclat = new Scanner(System.in);
        int a = 0;
        while (!teclat.hasNextInt()) {
            System.out.println("Has d'entrar un número enter!");
            teclat.nextLine();
        }
        return teclat.nextInt();
    }
    
    public boolean validaNumero(int numero) {
        return true;
    }

    @Override
    public void reiniciaPartida() {
        super.reiniciaPartida();
        numeroAEndevinar = random.nextInt(11); // Genera un número aleatori entre 0 i 10
        }

    @Override
    public void mostraNom() {
        System.out.println("Endevina un número");
    }

    @Override
    public void mostraInfo() {
        System.out.println("En aquest joc has d'introduïr números fins que endevinis el número corresponent. Tindràs 3 vides.");
    }
}

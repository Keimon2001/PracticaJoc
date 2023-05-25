package uf4practicajoc.exercici8.jocs.numeros;

import uf4practicajoc.exercici8.jocs.interficies.Jugable;

public class JocAdivinaImparell extends JocAdivinaNumero implements Jugable {

    public JocAdivinaImparell(int vides) {
        super(vides);
        numeroAEndevinar = random.nextInt(11);
    }

    @Override
    public boolean validaNumero(int numero) {
        if (numero % 2 != 0) {
            return true;
        } else {
            System.out.println("Has d'introduir un número imparell.");
            return false;
        }
    }

    @Override
    public void mostraNom() {
        System.out.println("Endevina un número imparell");
    }

    @Override
    public void mostraInfo() {
        System.out.println("En aquest joc has d'introduïr numeros imparells fins que endevinis el número corresponent. Tindras 3 vides.");
    }

    @Override
    public void reiniciaPartida() {
        super.reiniciaPartida();
        numeroAEndevinar = random.nextInt(6) * 2 + 1; // Genera un número aleatori entre 0 i 10
    }
}

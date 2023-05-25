package uf4practicajoc.exercici6;

public class JocAdivinaImparell extends JocAdivinaNumero implements Jugable {

    public JocAdivinaImparell(int vides, int numeroAEndevinar) {
        super(vides, numeroAEndevinar);
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
}

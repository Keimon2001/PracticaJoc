package uf4practicajoc.exercici7.jocs.numeros;

import uf4practicajoc.exercici7.jocs.interficies.Jugable;

public class JocAdivinaParell extends JocAdivinaNumero implements Jugable {
    
    public JocAdivinaParell(int vides, int numeroAEndevinar) {
        super(vides, numeroAEndevinar);
    }

    @Override
    public boolean validaNumero(int numero) {
        if (numero % 2 == 0) {
            return true;
        } else {
            System.out.println("Has d'introduir un número parell.");
            return false;
        }
        
    }
    
     @Override
    public void mostraNom() {
        System.out.println("Endevina un número parell");
    }

    @Override
    public void mostraInfo() {
        System.out.println("En aquest joc has d'introduïr numeros parells fins que endevinis el número corresponent. Tindras 3 vides.");
    }
}

package uf4practicajoc.exercici4;

public class JocAdivinaParell extends JocAdivinaNumero {
    
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
}

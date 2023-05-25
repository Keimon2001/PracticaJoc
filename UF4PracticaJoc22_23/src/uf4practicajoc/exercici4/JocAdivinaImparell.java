
package uf4practicajoc.exercici4;


    
public class JocAdivinaImparell extends JocAdivinaNumero {
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
}


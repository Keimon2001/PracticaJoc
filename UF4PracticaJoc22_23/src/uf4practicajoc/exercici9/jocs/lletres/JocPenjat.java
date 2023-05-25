
package uf4practicajoc.exercici9.jocs.lletres;


import java.util.Scanner;
import uf4practicajoc.exercici9.jocs.Joc;
import uf4practicajoc.exercici9.jocs.interficies.Jugable;

public class JocPenjat extends Joc implements Jugable {
    private String cadenaEndevinar;
    private String cadenaActual;
    private int vides;

    public JocPenjat(int vides, String cadenaEndevinar) {
        super(vides);
        this.vides = vides;
        this.cadenaEndevinar = cadenaEndevinar;
    }

    @Override
    public void juga() {
        reiniciaPartida();
        inicialitzaCadenaActual();

        Scanner teclat = new Scanner(System.in);

        while (vides > 0) {
            System.out.println("Cadena actual: " + cadenaActual);
            System.out.print("Introdueix un caràcter: ");
            String caracters = teclat.nextLine();

            if (caracters.length() != 1) {
                System.out.println("Introdueix només un caràcter.");
                continue;
            }

            char caracter = caracters.charAt(0);

            if (cadenaEndevinar.contains(String.valueOf(caracter))) {
                actualitzaCadenaActual(caracter);

                if (cadenaActual.equals(cadenaEndevinar)) {
                    System.out.println("Has endevinat la cadena! Felicitats!");
                    return;
                }
            } else {
                treureVida();
            }
        }

        System.out.println("Has perdut! La cadena a endevinar era: " + cadenaEndevinar);
    }
   
    
    private void inicialitzaCadenaActual() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < cadenaEndevinar.length(); i++) {
            sb.append("-");
        }
        cadenaActual = sb.toString();
    }

    private void actualitzaCadenaActual(char caracter) {
        StringBuilder sb = new StringBuilder(cadenaActual);
        for (int i = 0; i < cadenaEndevinar.length(); i++) {
            if (cadenaEndevinar.charAt(i) == caracter) {
                sb.setCharAt(i, caracter);
            }
        }
        cadenaActual = sb.toString();
    }

    
    @Override
    public boolean treureVida() {
    vides--;
    if (vides == 0) {
        System.out.println("Has perdut! No et queden més vides.");
        return true;  
    } else {
        System.out.println("No és a la cadena. Et queden " + vides + " vides.");
        return false;  
    }
}

    @Override
    public void mostraNom() {
        System.out.println("Aquest es el joc del penjat");
    }

    @Override
    public void mostraInfo() {
        System.out.println("Has de ficar una lletra cada cop i s'anira descobrint la paraula si endevines les lletres. En cas contrari, es restaran vides. Es tenen 5 vides.");
    }
}



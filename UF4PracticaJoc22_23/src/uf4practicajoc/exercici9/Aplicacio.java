package uf4practicajoc.exercici9;


import uf4practicajoc.exercici9.jocs.numeros.JocAdivinaParell;
import uf4practicajoc.exercici9.jocs.numeros.JocAdivinaNumero;
import uf4practicajoc.exercici9.jocs.numeros.JocAdivinaImparell;
import uf4practicajoc.exercici9.jocs.interficies.Jugable;
import java.util.Scanner;
import uf4practicajoc.exercici9.jocs.lletres.JocPenjat;



public class Aplicacio {
    static Scanner teclat = new Scanner(System.in);
    
    public static void main(String[] args) {
        
    boolean continua = false;
    
    while(!continua) {
        Jugable joc = triaJoc();
        joc.mostraNom();
        joc.mostraInfo();
        joc.juga();
        
        System.out.println("Vols continuar jugant? s (si) / n (no)");
        String resultat = teclat.next();
        if(resultat.equalsIgnoreCase("n")){
            continua = true;
        }
    }
        
    }
    
    /**
     *
     * @return El joc que es vol jugar.
     * Aquest metode serveix per a triar el joc que volem jugar.
     */
    public static Jugable triaJoc(){
        
        JocAdivinaNumero Joc = new JocAdivinaNumero(3);
        JocAdivinaParell JocPa = new JocAdivinaParell(3);
        JocAdivinaImparell JocIm = new JocAdivinaImparell(3);
        JocPenjat JocPe = new JocPenjat(5,"minusvalia");
        
        Jugable[] jocs = new Jugable[4];
        
        jocs[0] = Joc;
        jocs[1] = JocPa;
        jocs[2] = JocIm;
        jocs[3] = JocPe;
        
        
        int opcio;
        do {
            System.out.println("Escull un joc");
            System.out.println("0 - Endevina un numero");
            System.out.println("1 - Endevina un numero parell");
            System.out.println("2 - Endevina un numero imparell");
            System.out.println("3 - Endevina la cadena");
            opcio = teclat.nextInt();
        } while (opcio < 0 || opcio > 3);
        
        return jocs[opcio];
        
    }
}
    


    

 
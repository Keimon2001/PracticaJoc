package uf4practicajoc.exercici2;

public class Aplicacio {
    public static void main(String[] args) {
        Joc joc1 = new Joc(5);
        Joc joc2 = new Joc(5);

        joc1.treureVida();
        joc1.mostrarVidesRestants();
        joc1.reiniciaPartida();
        joc1.mostrarVidesRestants();

        joc2.mostrarVidesRestants();
        Joc.actualitzaRecord(joc1);
        Joc.actualitzaRecord(joc2);
        
    }
}

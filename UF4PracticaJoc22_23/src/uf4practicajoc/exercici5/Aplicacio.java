package uf4practicajoc.exercici5;

public class Aplicacio {

    public static void main(String[] args) {
        JocAdivinaNumero joc = new JocAdivinaNumero(3, 5);
        joc.mostraNom();
        joc.mostraInfo();
        joc.juga();

        JocAdivinaParell joc2 = new JocAdivinaParell(3, 8);
        joc2.mostraNom();
        joc2.mostraInfo();
        joc2.juga();

        JocAdivinaImparell joc3 = new JocAdivinaImparell(3, 7);
        joc3.mostraNom();
        joc3.mostraInfo();
        joc3.juga();
    }
}

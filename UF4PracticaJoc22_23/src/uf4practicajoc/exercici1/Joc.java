package uf4practicajoc.exercici1;

public class Joc {

    public int vides;

    public static void main(String[] args) {
        // Crea una instància de la classe Joc amb 5 vides
        Joc joc1 = new Joc(5);
        joc1.mostraVidesRestants(); // mostra "Vides restants: 5"

        // Resta una vida i mostra el nombre de vides restants
        joc1.vides--;
        joc1.mostraVidesRestants(); // mostra "Vides restants: 4"

        // Crea una altra instància de la classe Joc amb 5 vides
        Joc joc2 = new Joc(5);

        // Mostra el nombre de vides restants de les dues instàncies
        joc2.mostraVidesRestants(); // mostra "Vides restants: 5"
        joc1.mostraVidesRestants(); // mostra "Vides restants: 4"       

    }

    /**
     *
     * @param videsInicials Variable amb les vides inicials que fa el jugador
     * Mètode per a fer reset a les vides.
     */
    public Joc(int videsInicials) {
        vides = videsInicials;
    }

    /**
     * Mètode per mostrar les vides que te actualment el jugador.
     */
    public void mostraVidesRestants() {
        System.out.println("Vides restants: " + vides);
    }
}

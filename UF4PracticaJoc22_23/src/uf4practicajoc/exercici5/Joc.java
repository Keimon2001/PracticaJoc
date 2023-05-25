package uf4practicajoc.exercici5;

public abstract class Joc {

    private int vides;
    private final int videsInicials;
    private static int record = 0;

    public Joc(int vides) {
        this.vides = vides;
        this.videsInicials = vides;
    }

    /**
     * Métode per mostrar vides actuals
     */
    public void mostrarVidesRestants() {
        System.out.println("Vides restants: " + vides);
    }

    /**
     *
     * @return Retorna true en cas que tinguem 1 o mes vides, Retorna false en
     * cas que ens quedem amb 0 vides. Métode per a treure 1 vida.
     */
    public boolean treureVida() {
        this.vides--;
        if (this.vides == 0) {
            System.out.println("Joc acabat");
            return false;
        }
        return true;
    }

    /**
     * Métode per a reiniciar la partida amb les videsInicials.
     */
    public void reiniciaPartida() {
        this.vides = this.videsInicials;
    }

    /**
     *
     * @param joc Métode per actualitzar el record en cas que les vides siguin
     * mes grans que el record. I tambe per a mostrar aconseguit el record en
     * cas que siguin iguals.
     */
    public void actualitzaRecord() {

        if (vides == record) {
            System.out.println("S'ha aconseguit el rècord!");
        } else if (vides > record) {
            record = vides;
            System.out.println("S'ha batut el rècord! Nou rècord: " + record);
        }
    }

}

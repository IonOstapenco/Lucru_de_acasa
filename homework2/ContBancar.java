package homework2;

/*Creează o clasă ContBancar care va avea următoarele atribute,
ceva asa camL\:

titular (String) - numele persoanei care deține contul
sold sau cont (double) - suma de bani care se află în cont
Creeaza asa metode în clasa ContBancar

depunere(double suma) - adaugă suma primită la sold.
retrage(double suma) - scade suma din sold dacă există fonduri suficiente, altfel afișează un mesaj de eroare.
afiseazaSold() - afișează soldul curent din cont.*/
public class ContBancar {
    private String titular;
    private double suma;
    private double sold;

    double depunere(double suma) {
        return sold += suma;
    }

    double retragere(double suma) {
        try{
            if (sold-suma<0){//daca ramane mai putin de 0
                throw new IllegalArgumentException("bani/fonduri insuficiente");
            }
            //daca tot ii normal
            sold-=suma;
        } catch (IllegalArgumentException e){//daca suma ramasa mai mic de 0 dupa retragere
            System.err.println(e.getMessage());//arata eroare in culoarea rosie
        }

        return sold;
    }

    public String getNumePersoana() {
        return titular;
    }

    public void setNumePersoana(String titular) {
        this.titular = titular;
    }

    public double getSuma() {
        return suma;
    }

    public void setSuma(double suma) {
        this.suma = suma;
    }

    public double getSold() {
        return sold;
    }

    public void setSold(double sold) {
        this.sold = sold;
    }

    void afiseazaSold() {
        System.out.println("Soldul pesoanei " + getNumePersoana() + " este " + sold);
    }
}

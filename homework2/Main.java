package homework2;

import java.util.Scanner;

/*În clasa Main, creează un obiect de tip ContBancar și simulează operațiuni de -
 depunere,
 retragere și
afișare a soldului.

Exemplu:

Creează un cont bancar cu un sold inițial de 1000 de lei.
Depune în cont suma de 500 de lei.
Afișează soldul curent.
Retrage din cont 300 de lei și afișează din nou soldul.
Încearcă să retragi o sumă mai mare decât soldul disponibil (de exemplu 1500 de lei) și afișează mesajul de eroare.*/
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String action;

        //pornim ciclu pana nu scriem exit
        while (true) {
            System.out.println("introdu comanda start pentru inceperea operatiunii sau exit pentru iesire");

            //mai jos logica
            ContBancar contBancar = new ContBancar();
            double sold;
            double depune;
            double retrage;
            String nume;
            System.out.println("Cont bancar");
            System.out.println("introdu nume");
            nume = scanner.nextLine();
            contBancar.setNumePersoana(nume);

            System.out.println("Introdu soldul initial in cont bancar");
            sold = scanner.nextDouble();
            contBancar.setSold(sold);

            scanner.nextLine();/*scanner.nextLine(). Acest lucru este necesar pentru a „absorbi” caracterul de linie nouă,
 care rămâne în buffer după introducerea unui număr.*/
            contBancar.afiseazaSold();

            System.out.println("depune o suma anumita");
            depune=scanner.nextDouble();
            contBancar.depunere(depune);

            scanner.nextLine();
            contBancar.afiseazaSold();

            System.out.println("retrage o suma anumita");
            retrage= scanner.nextDouble();
            contBancar.retragere(retrage);

            scanner.nextLine();
            contBancar.afiseazaSold();//iarasi afisam


            //intrebam daca doreste sa continue
            System.out.println("doriti sa continuati? scrieti DA/da pentru continuare, sau NU/nu");
            action = scanner.nextLine();

            if (action.equalsIgnoreCase("nu")) {
                System.out.println("iesire");
                break;//finisam ciclu si iesim
            } else if (action.equalsIgnoreCase("da")) {
                System.out.println("da");
                System.out.println("continuam");
            } else {
                System.out.println("comanda necunoscuta");
            }

        }
        scanner.close();

    }

}


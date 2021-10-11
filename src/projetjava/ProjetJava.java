package projetjava;

/**
 *
 * @author Léo Arnoult De Almeida and Pierre Juchniewicz
 */
public class ProjetJava {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Blackjack table1 = new Blackjack("Pierre",2);
        System.out.print(table1.nom_croupier);
    }
}

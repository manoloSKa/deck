import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class deck {
    /**/
    private List<Card> cards;

    /*Variable que guarda las cartas de la baraja virtual*/
    public deck() {
        cards = new ArrayList<>();
        initializeDeck();
    }

    /*Se crean las listas que contendran los valores que puede tomar una carta, palo, color y valor
    Utilizando la propiedad de uso de una lista como valor de recorrido en el for llenamos cada una delas cartas en
    nuestro arreglo*/
    private void initializeDeck() {
        List<String> palos = Arrays.asList("tréboles", "corazones", "picas", "diamantes");
        String color = null;
        List<String> valores = Arrays.asList("2", "3", "4", "5", "6", "7", "8", "9", "10", "A", "J", "Q", "K");

        for (String palo : palos) {
            for (String valor : valores) {
                color = (palo.equals("corazones") || palo.equals("diamantes")) ? "rojo" : "negro";
                cards.add(new Card(palo, color, valor));
            }
        }
    }

    /*El concepto es revolver la baraja, y hacemos uso del método shuffle, y se envía un mensaje donde se asegura que
    se hizo la mezcla*/
    public void shuffle() {
        Collections.shuffle(cards);
        System.out.println("Se mezcló el Deck.");
    }

    /*Se toma la primer carta del arreglo antes de hacerlo se valida que el mazo o baraja no este vacioy se elimina,
    se muestra y se despliega el tamaño del arreglo que en este caso con las cartas que quedan */
    public void head() {
        if (cards.isEmpty()) {
            System.out.println("El Deck está vacío.");
            return;
        }

        Card card = cards.remove(0);
        System.out.println(card);
        System.out.println("Quedan " + cards.size() + " cartas en el Deck.");
    }

    /*Se toma una carta del arreglo de modo aleatorio antes de hacerlo se valida que el mazo o baraja no este vacio y
    se elimina, se muestra y se despliega el tamaño del arreglo que en este caso con las cartas que quedan */
    public void pick() {
        if (cards.isEmpty()) {
            System.out.println("El Deck está vacío.");
            return;
        }

        int randomIndex = (int) (Math.random() * cards.size());
        Card card = cards.remove(randomIndex);
        System.out.println(card);
        System.out.println("Quedan " + cards.size() + " cartas en el Deck.");
    }

    /*Se toma las primeras 5 cartas del arreglo; antes de hacerlo se valida que el mazo o baraja no este vacio,
    se elimina, se muestra y se despliega el tamaño del arreglo que en este caso con las cartas que quedan */
    public void hand() {
        if (cards.size() < 5) {
            System.out.println("No hay suficientes cartas en el Deck para repartir una mano.");
            return;
        }

        System.out.println(cards.get(0));
        System.out.println(cards.get(1));
        System.out.println(cards.get(2));
        System.out.println(cards.get(3));
        System.out.println(cards.get(4));

        cards.subList(0, 5).clear();
        System.out.println("Quedan " + cards.size() + " cartas en el Deck.");
    }

    /*En el método main se llaman los distintos métodos creados y se despliegan en la consola*/
    public static void main(String[] args) {
        deck deck = new deck();
        deck.shuffle();
        System.out.println();

        deck.head();
        System.out.println();

        deck.pick();
        System.out.println();

        deck.hand();
        System.out.println();
    }
}

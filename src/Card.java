public class Card {
    /*Declaracion de variables*/
    private String palo;
    private String color;
    private String valor;

    /*Instanciación*/
    public Card (String palo, String color, String valor){
        this.palo = palo;
        this.color = color;
        this.valor = valor;
    }
    /*Metodos get*/
    public String getPalo(){
        return palo;
    }

    public String getColor(){
        return color;
    }

    public String getValor(){
        return valor;
    }

    /*Anotación para sobreeescribir metodos*/
    @Override
    public String toString(){
        return palo+","+color+","+valor;
    }
}

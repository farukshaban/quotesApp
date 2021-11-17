package javabasics;

public class Main {

    public static void main(String[] args) {
	Quotes quotes = new Quotes();
    int quoteLenght = quotes.quotes.length;
    int random1 = (int) (Math.random() * quoteLenght);
    String phrase = quotes.quotes[random1];
        System.out.println(phrase);

    }
}

package Week2.Practices.Practice05_BoxingGame;

public class Main {
    public static void main(String[] args) {
        Fighter fighter1 = new Fighter("Muhammed Ali", 10, 100, 90, 30);
        Fighter fighter2 = new Fighter("Mike Tyson", 15, 95, 100, 20);
        Ring match = new Ring(fighter1, fighter2, 90, 100);
        match.run();
    }
}

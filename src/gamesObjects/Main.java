package gamesObjects;

public class Main {
    public static void main(String[] args) {

        EnemyFactory factory = new EnemyFactory();

        Enemy monster = factory.createEnemy("monster");
        Enemy alien = factory.createEnemy("alien");
        Enemy neighbour = factory.createEnemy("neighbour");
        monster.attack();
        alien.attack();
        neighbour.attack();

    }
}
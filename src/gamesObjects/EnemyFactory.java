package gamesObjects;

 class EnemyFactory { // Фабричний метод

    public Enemy createEnemy(String type) {
        if (type.equalsIgnoreCase("monster")) {
            return new Monster();
        } else if (type.equalsIgnoreCase("alien")) {
            return new Alien();
        } else if (type.equalsIgnoreCase("neighbour")) {
            return new Neighbour();
        }
        return null;
    }

}

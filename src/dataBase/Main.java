package dataBase;

// Зверніть увагу що всі приклади є астрактні а не реальними проектами тому код вказаний
//лише для розуміння того чи іншого патерна

public class Main {

    public static void main(String[] args) {
        DataBaseFactory factory;
        String type1 = "MySQL";
        String type2 = "Postgres";
        if (type1.equalsIgnoreCase(String.valueOf(TypeDB.MySQL))) {
            factory = new MySQLFactory();
        }
        if (type2.equalsIgnoreCase(String.valueOf(TypeDB.Postgres))) {
            factory = new PostgresFactory();
        } else {
            throw new IllegalArgumentException("Invalid data base type");
        }

        Connection connection = factory.createConnection();
        Query query = factory.createQuery();

        connection.connect();
        query.execute();

    }
}

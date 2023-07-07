package dataBase;

public class PostgresFactory extends DataBaseFactory{
    @Override
    public Connection createConnection() {
        return new PostgresConnection();
    }

    @Override
    public PostgresQuery createQuery() {
        return new PostgresQuery();
    }
}

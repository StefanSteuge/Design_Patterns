package dataBase;


public class MySQLFactory extends DataBaseFactory{
    @Override
    public Connection createConnection() {
        return new MySQLConnection();
    }

    @Override
    public Query createQuery() {
        return new MySQLQuery();
    }
}

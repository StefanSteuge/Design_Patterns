package dataBase;


abstract class DataBaseFactory {

    public abstract Connection createConnection();
    public abstract Query createQuery();

}

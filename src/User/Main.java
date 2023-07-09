package User;

public class Main {

    public static void main(String[] args) {
        User steven = new User.Builder("Steven","admin")
                .age(46)
                .email("steven@gmail.com")
                .build();
        System.out.println("Welcome " + steven.toString());

        User eugene = new User.Builder("Eugene","admin")
                .address("Lviv")
                .email("eugene@gmail.com")
                .age(44)
                .build();
        System.out.println("Welcome " + eugene.toString());
    }

}

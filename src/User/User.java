package User;

public class User {

    private String username;
    private String password;
    private String email;
    private String address;
    private int age;

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return  "User:\n" +
                "username = " + username + ",\n" +
                "password = " + password + ",\n" +
                "email =    " + email + ",\n" +
                "address =  " + address + ",\n" +
                "age =      " + age +
                ';';
    }

    private User(Builder builder) {
        this.username = builder.username;
        this.password = builder.password;
        this.email = builder.email;
        this.address = builder.address;
        this.age = builder.age;


    }

    public static class Builder {

        private String username;
        private String password;
        private String email;
        private String address;
        private int age;

        public Builder(String username, String password) {
            this.username = username;
            this.password = password;
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public Builder address(String address) {
            this.address = address;
            return this;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }
}

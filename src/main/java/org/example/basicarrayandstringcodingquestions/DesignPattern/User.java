package org.example.basicarrayandstringcodingquestions.DesignPattern;
public class User {
    private final String name;
    private final int age;
    private final String country;
    private final String email;
    private final boolean isVerified;

    // Private constructor
    private User(Builder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.country = builder.country;
        this.email = builder.email;
        this.isVerified = builder.isVerified;
    }

    // Static Builder class
    public static class Builder {
        private final String name;
        private final int age;
        private String country;
        private String email;
        private boolean isVerified;

        public Builder(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public Builder country(String country) {
            this.country = country;
            return this;
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public Builder isVerified(boolean isVerified) {
            this.isVerified = isVerified;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", country='" + country + '\'' +
                ", email='" + email + '\'' +
                ", isVerified=" + isVerified +
                '}';
    }

    public static void main(String[] args) {
        User user = new User.Builder("Alice", 25)
                .country("India")
                .email("alice@example.com")
                .isVerified(true)
                .build();

        System.out.println(user);
    }
}

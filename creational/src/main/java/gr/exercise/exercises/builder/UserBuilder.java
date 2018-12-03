package gr.exercise.exercises.builder;

public final class UserBuilder {
    //required
    private String firstName;
    //required
    private String lastName;
    //optional
    private int age;
    //optional
    private String phone;
    //optional
    private String address;

    private UserBuilder(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public static UserBuilder getUserBuilder(String firstName, String lastName) {
        return new UserBuilder(firstName, lastName);
    }

    public UserBuilder withAge(int age) {
        this.age = age;
        return this;
    }

    public UserBuilder withPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public UserBuilder withAddress(String address) {
        this.address = address;
        return this;
    }

    public User build() {
        User user = new User(firstName, lastName, age, phone, address   );
        return user;
    }
}

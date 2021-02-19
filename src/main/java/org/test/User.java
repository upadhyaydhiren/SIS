package org.test;

import java.util.UUID;

public class User {
    private final String id;
    private String firstName;
    private String lastName;
    private Gender gender;

    public User(String firstName, String lastName, Gender gender) {
        this.id = UUID.randomUUID().toString();
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
    }

    enum Gender {
        MALE, FEMALE;
    }

    public String getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }
}

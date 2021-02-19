package org.test;

import java.util.Arrays;
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
        MALE("M"), FEMALE("F");
        Gender(String value) {
            this.value = value;
        }
        private final String value;

        public String getValue() {
            return value;
        }
        public static Gender findByValue(String value) {
            return Arrays
                    .stream(values())
                    .filter(gender1 -> gender1.value.equalsIgnoreCase(value))
                    .findFirst()
                    .orElse(null);
        }
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

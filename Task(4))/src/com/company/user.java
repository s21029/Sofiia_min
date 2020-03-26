package com.company;

public class user {
    public String name;
    public String surname;
    public String email;
    public String password;
    public boolean userGuest;

    public user (String name, String surname, String email, String password) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.password = password;
        this.userGuest = false;
    }

    public user(String email) {
        this.email = email;
        this.userGuest = true;
    }

    public boolean userGuest() {
        if (this.email == email) {
            return false;
        } else {
            return true;

        }
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isUserGuest() {
        return userGuest;
    }
    public void setUserGuest(boolean userGuest) {
        this.userGuest = userGuest;
    }
}

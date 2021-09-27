package com.company;

public class Main {

    public static void main(String[] args) {
        App Instagram = new App();
        Instagram.addMessage("@nndax");
        Instagram.addMessage("@oksupaevak");
        Instagram.addMessage("@noahbeck");

        User user = new User("Ali");

        Instagram.register(user);
        Instagram.addMessage("@ainasays");

        Instagram.removeMessage("@ainasays");

    }
}

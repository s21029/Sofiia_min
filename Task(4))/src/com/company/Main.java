package com.company;

public class Main {

    public static void main(String[] args) {

        user S1 = new user("s21028@pjwstk.edu.pl");
        S1.setSurname("Etgega");
        S1.setName("Sjbwce");
        S1.setPassword("47fbg34u");

        user S2 = new user("Sgsrgrgg", "Ygskj", "s21029@pjwstk.edu.pl", "987085rgt4");
        user S3 = new user("Sveth", "Ldfjr", "s21027@pjwstk.edu.pl", "563erbhbr");

        boolean guest1 = S2.userGuest();
        System.out.println("Shopping as a guest  " + guest1);

        boolean guest2 = S3.userGuest();
        System.out.println("Shopping as a guest  " + guest2);

        product a  = new product("a", 1, 1, 495);
        product b = new product("b", 2, 2);
        product c = new product("c", 3, 3 );


        a.setQuantity(5);
        long quantity = a.getQuantity();
        c.setPrice(5);
        double Price = b.getPrice();

        System.out.println("Quantity equals " + quantity + " Price is " + Price );

    }
}


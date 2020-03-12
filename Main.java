package com.company;

import org.w3c.dom.ls.LSOutput;

public class Main {

    public static void main(String[] args) {
        // Telefon
        Telefon Motorolla = new Telefon(333389, 23, "Motorolla", "kek");
        int Number = Motorolla.SendMobileNumber();
        System.out.println(Number);
        String Massege = Motorolla.SebdMobileMessenge();
        System.out.println("Send sms " + Massege + " to motorolla number " + Number);

    }



}

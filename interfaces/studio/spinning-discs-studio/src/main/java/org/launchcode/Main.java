package org.launchcode;

public class Main {
    public static void main(String[] args) {

        // TODO: Declare and initialize a CD and a DVD object.

        CD myCD = new CD();
        DVD myDvd = new DVD(title "Everything Everywhere All At Once");

        myCD.spinDisc();
        myDvd.spinDisc();

        MyCD.writeData("Make data to write");
        System.out.println(myCD.readdata());

        // TODO: Call each CD and DVD method to verify that they work as expected.
    }
}
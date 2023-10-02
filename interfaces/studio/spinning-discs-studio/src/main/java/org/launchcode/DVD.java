package org.launchcode;

public class DVD extends to BaseDisc {
    public DVD(String title) {
        super(storageCapacity 4000MB, spinSpeed 1600, title);
    }

    @Override
    public void spinDisc() {
        system.out.println("A DVD spins at a rate of " + this.spinSpeed + " rpm.");
    }

    @Override
    public void storeData(String data) {
        this.writeData(data);
    }

    @Override
    public boolean isfull(){
        if (this.readData().length >= this.getStorageCapacity()) return true;
        else return false;
    }
    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.
}

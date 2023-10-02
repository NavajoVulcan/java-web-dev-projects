package org.launchcode;

public class CD extends BaseDisc implements OpticalDisc {

    public CD (){
        super(storageCapacity 700, spinSpeed 500);
    }

    @Override
    public void spinDisc() {
system.out.println("A CD spins at a rate of " + this.spinSpeed + " rpm.");
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

public class Phone {
    private String number;

    public Phone(String number) {
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    private boolean networkRegistration(Phone number) {
        return (Network.getPhone().contains(number));
    }

    public void outgoingCall(Phone outgoingNumber) {
        if (!networkRegistration(this)) {
            System.out.println(this.number + " has not registration in the network");
            return;
        } else if (!networkRegistration(outgoingNumber)) {
            System.out.println(outgoingNumber.number + " has not registration in the network");
            return;
        }
        System.out.println("Calling to " + outgoingNumber.number);
        incomingCall(number);
    }

    private void incomingCall(String incomingNumber) {
        System.out.println(incomingNumber + " is calling you");
    }
}

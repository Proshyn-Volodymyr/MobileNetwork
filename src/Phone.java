public class Phone {
    private String number;

    public Phone(String number) {
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    private boolean networkRegistration(String number) {
        return (Network.getPhone().contains(number));
    }

    public void outgoingCall(String outgoingNumber) {
        if (!networkRegistration(number)) {
            System.out.println(number + " has not registration in the network");
            return;
        } else if (!networkRegistration(outgoingNumber)) {
            System.out.println(outgoingNumber + " has not registration in the network");
            return;
        }
        incomingCall(number);
    }

    private void incomingCall(String incomingNumber) {
        System.out.println(incomingNumber + " is calling you");
    }
}

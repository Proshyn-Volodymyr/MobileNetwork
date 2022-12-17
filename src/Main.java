
public class Main {
    public static void main(String[] args) {

        Phone phone1 = new Phone("123");
        Phone phone2 = new Phone("456");
        Phone phone3 = new Phone("789");

        Network.getPhone().add(phone1);
        Network.getPhone().add(phone2);
        Network.getPhone().add(phone3);

        phone1.outgoingCall(phone2);
        phone3.outgoingCall(new Phone("888"));
    }
}
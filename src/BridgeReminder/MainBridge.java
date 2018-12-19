package BridgeReminder;

public class MainBridge {

    public static void main(String[] args) {

	 PaySystem paySystem =new PaySystem(new Kiwi());
	 paySystem.getPay();
    }
}

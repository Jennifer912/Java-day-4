
public class Main {

	public static void main(String[] args) {
		
		Test ref=new Test();
		Banking(ref);
		
		HSBC hsbc=new HSBC();
		Banking(hsbc);
		
		Barclays barclays=new Barclays();
		Banking(barclays);

	}
	
	public static void Banking(BankofEngland bankingRef) {
		
		bankingRef.showBalance();
		bankingRef.openAccount();
	}

}

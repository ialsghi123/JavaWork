package practice.cardcompany;

public class Company {

	private int cardNumber=10000;
	
	//default
	
	private Company() {
		
	}
	
	private static Company Instance = null;
	
	static Company getInstance() {
		if(Instance == null) {
			Instance = new Company();
		}
		return Instance;
	}
	// 카드 발급
		public Card createCard() {
			cardNumber++;
			return new Card(cardNumber);
		}
		



	
	
		
} // end class

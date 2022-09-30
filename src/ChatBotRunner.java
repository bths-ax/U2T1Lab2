public class ChatBotRunner {
	public static void main(String[] args) {
		ChatBot debbie = new ChatBot("debbie", 5);
		debbie.greeting("guy");
		debbie.weather();
		debbie.favoriteNumber(10);
		System.out.println("Also, 1 + 2 + 3 is " + debbie.addNumbers(1, 2, 3));
		System.out.println("Also also, 5 feet is " + debbie.convertFeetToMeters(5) + " meters");
		debbie.doAThing();
		System.out.println("Returned thing: " + debbie.returnAThing());
		debbie.goodbye();
	}
}

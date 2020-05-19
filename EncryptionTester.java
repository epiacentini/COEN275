package assign2;

public class EncryptionTester {
	public static void testSet1() {
		
		System.out.println("Test Cases With A Shift of 0");
		Encryptor test = new Encryptor(0); // new encryptor with shift of 0
		String testString = test.encrypt("abcdefghijklmnopqrstuvwxyz");
		System.out.println(testString);
		testString = test.decrypt(testString);
		System.out.println(testString);
		System.out.println();
		
		testString = test.encrypt("Eric S. Piacentini");
		System.out.println(testString);
		testString = test.decrypt(testString);
		System.out.println(testString);
		System.out.println();
		
		testString = test.encrypt("Xray defraction");
		System.out.println(testString);
		testString = test.decrypt(testString);
		System.out.println(testString);
		System.out.println();
		
		testString = test.encrypt("Zebra-tailed lizard");
		System.out.println(testString);
		testString = test.decrypt(testString);
		System.out.println(testString);
		System.out.println();
		
		testString = test.encrypt("Walkie-talkie");
		System.out.println(testString);
		testString = test.decrypt(testString);
		System.out.println(testString);
		System.out.println();
		
		testString = test.encrypt("COEN 275 OO Analysis, Design and Programming");
		System.out.println(testString);
		testString = test.decrypt(testString);
		System.out.println(testString);
		System.out.println();
		
		System.out.println("Test Cases With A Shift of 3");
		test.setOffset(3); // set a new offset to 3
		testString = test.encrypt("abcdefghijklmnopqrstuvwxyz");
		System.out.println(testString);
		testString = test.decrypt(testString);
		System.out.println(testString);
		System.out.println();
		
		testString = test.encrypt("Eric S. Piacentini");
		System.out.println(testString);
		testString = test.decrypt(testString);
		System.out.println(testString);
		System.out.println();
		
		
		testString = test.encrypt("Xray defraction");
		System.out.println(testString);
		testString = test.decrypt(testString);
		System.out.println(testString);
		System.out.println();
		
		testString = test.encrypt("Zebra-tailed lizard");
		System.out.println(testString);
		testString = test.decrypt(testString);
		System.out.println(testString);
		System.out.println();
		
		testString = test.encrypt("Walkie-talkie");
		System.out.println(testString);
		testString = test.decrypt(testString);
		System.out.println(testString);
		System.out.println();
		
		testString = test.encrypt("COEN 275 OO Analysis, Design and Programming");
		System.out.println(testString);
		testString = test.decrypt(testString);
		System.out.println(testString);
		System.out.println();
		
		System.out.println("Test Cases With A Shift of 11");
		test.setOffset(11); // set a new offset to 11
		testString = test.encrypt("abcdefghijklmnopqrstuvwxyz");
		System.out.println(testString);
		testString = test.decrypt(testString);
		System.out.println(testString);
		System.out.println();
		
		testString = test.encrypt("Eric S. Piacentini");
		System.out.println(testString);
		testString = test.decrypt(testString);
		System.out.println(testString);
		System.out.println();
		
		
		testString = test.encrypt("Xray defraction");
		System.out.println(testString);
		testString = test.decrypt(testString);
		System.out.println(testString);
		System.out.println();
		
		testString = test.encrypt("Zebra-tailed lizard");
		System.out.println(testString);
		testString = test.decrypt(testString);
		System.out.println(testString);
		System.out.println();
		
		testString = test.encrypt("Walkie-talkie");
		System.out.println(testString);
		testString = test.decrypt(testString);
		System.out.println(testString);
		System.out.println();
		
		testString = test.encrypt("COEN 275 OO Analysis, Design and Programming");
		System.out.println(testString);
		testString = test.decrypt(testString);
		System.out.println(testString);
		System.out.println();
		
		System.out.println("Test Cases With A Shift of 25");
		test.setOffset(25); // set a new offset to 25
		testString = test.encrypt("abcdefghijklmnopqrstuvwxyz");
		System.out.println(testString);
		testString = test.decrypt(testString);
		System.out.println(testString);
		System.out.println();
		
		testString = test.encrypt("Eric S. Piacentini");
		System.out.println(testString);
		testString = test.decrypt(testString);
		System.out.println(testString);
		System.out.println();
		
		
		testString = test.encrypt("Xray defraction");
		System.out.println(testString);
		testString = test.decrypt(testString);
		System.out.println(testString);
		System.out.println();
		
		testString = test.encrypt("Zebra-tailed lizard");
		System.out.println(testString);
		testString = test.decrypt(testString);
		System.out.println(testString);
		System.out.println();
		
		testString = test.encrypt("Walkie-talkie");
		System.out.println(testString);
		testString = test.decrypt(testString);
		System.out.println(testString);
		System.out.println();
		
		testString = test.encrypt("COEN 275 OO Analysis, Design and Programming");
		System.out.println(testString);
		testString = test.decrypt(testString);
		System.out.println(testString);
		System.out.println();
		
		test.setOffset(26); // will not change the value so the value of offset will remain at 25
		
	}
	
	public static void testSet2() {
		int firstOffset = (int)((Math.random()*100) % 26 + 1);
		System.out.println("Test Cases With A Shift of " + firstOffset );
		Encryptor test = new Encryptor(firstOffset); // new encryptor with shift of randomly generated value
		String testString = test.encrypt("abcdefghijklmnopqrstuvwxyz");
		System.out.println(testString);
		testString = test.decrypt(testString);
		System.out.println(testString);
		System.out.println();
		
		testString = test.encrypt("Eric S. Piacentini");
		System.out.println(testString);
		testString = test.decrypt(testString);
		System.out.println(testString);
		System.out.println();
		
		testString = test.encrypt("Xray defraction");
		System.out.println(testString);
		testString = test.decrypt(testString);
		System.out.println(testString);
		System.out.println();
		
		testString = test.encrypt("Zebra-tailed lizard");
		System.out.println(testString);
		testString = test.decrypt(testString);
		System.out.println(testString);
		System.out.println();
		
		testString = test.encrypt("Walkie-talkie");
		System.out.println(testString);
		testString = test.decrypt(testString);
		System.out.println(testString);
		System.out.println();
		
		testString = test.encrypt("COEN 275 OO Analysis, Design and Programming");
		System.out.println(testString);
		testString = test.decrypt(testString);
		System.out.println(testString);
		System.out.println();
		
		int secondOffset = (int)((Math.random()*100) % 26 + 1);
		System.out.println("Test Cases With A Shift of " + secondOffset );
		test.setOffset(secondOffset); // new encryptor with shift of randomly generated value
		testString = test.encrypt("abcdefghijklmnopqrstuvwxyz");
		System.out.println(testString);
		testString = test.decrypt(testString);
		System.out.println(testString);
		System.out.println();
		
		testString = test.encrypt("Eric S. Piacentini");
		System.out.println(testString);
		testString = test.decrypt(testString);
		System.out.println(testString);
		System.out.println();
		
		testString = test.encrypt("Xray defraction");
		System.out.println(testString);
		testString = test.decrypt(testString);
		System.out.println(testString);
		System.out.println();
		
		testString = test.encrypt("Zebra-tailed lizard");
		System.out.println(testString);
		testString = test.decrypt(testString);
		System.out.println(testString);
		System.out.println();
		
		testString = test.encrypt("Walkie-talkie");
		System.out.println(testString);
		testString = test.decrypt(testString);
		System.out.println(testString);
		System.out.println();
		
		testString = test.encrypt("COEN 275 OO Analysis, Design and Programming");
		System.out.println(testString);
		testString = test.decrypt(testString);
		System.out.println(testString);
		System.out.println();
		
		int thirdOffset = (int)((Math.random()*100) % 26 + 1);
		System.out.println("Test Cases With A Shift of " + thirdOffset );
		test.setOffset(thirdOffset); // new encryptor with shift of randomly generated value
		testString = test.encrypt("abcdefghijklmnopqrstuvwxyz");
		System.out.println(testString);
		testString = test.decrypt(testString);
		System.out.println(testString);
		System.out.println();
		
		testString = test.encrypt("Eric S. Piacentini");
		System.out.println(testString);
		testString = test.decrypt(testString);
		System.out.println(testString);
		System.out.println();
		
		testString = test.encrypt("Xray defraction");
		System.out.println(testString);
		testString = test.decrypt(testString);
		System.out.println(testString);
		System.out.println();
		
		testString = test.encrypt("Zebra-tailed lizard");
		System.out.println(testString);
		testString = test.decrypt(testString);
		System.out.println(testString);
		System.out.println();
		
		testString = test.encrypt("Walkie-talkie");
		System.out.println(testString);
		testString = test.decrypt(testString);
		System.out.println(testString);
		System.out.println();
		
		testString = test.encrypt("COEN 275 OO Analysis, Design and Programming");
		System.out.println(testString);
		testString = test.decrypt(testString);
		System.out.println(testString);
		System.out.println();
		
		int fourthOffset = (int)((Math.random()*100) % 26 + 1);
		System.out.println("Test Cases With A Shift of " + fourthOffset );
		test.setOffset(fourthOffset); // new encryptor with shift of randomly generated value
		testString = test.encrypt("abcdefghijklmnopqrstuvwxyz");
		System.out.println(testString);
		testString = test.decrypt(testString);
		System.out.println(testString);
		System.out.println();
		
		testString = test.encrypt("Eric S. Piacentini");
		System.out.println(testString);
		testString = test.decrypt(testString);
		System.out.println(testString);
		System.out.println();
		
		testString = test.encrypt("Xray defraction");
		System.out.println(testString);
		testString = test.decrypt(testString);
		System.out.println(testString);
		System.out.println();
		
		testString = test.encrypt("Zebra-tailed lizard");
		System.out.println(testString);
		testString = test.decrypt(testString);
		System.out.println(testString);
		System.out.println();
		
		testString = test.encrypt("Walkie-talkie");
		System.out.println(testString);
		testString = test.decrypt(testString);
		System.out.println(testString);
		System.out.println();
		
		testString = test.encrypt("COEN 275 OO Analysis, Design and Programming");
		System.out.println(testString);
		testString = test.decrypt(testString);
		System.out.println(testString);
		System.out.println();
	}
	
	public static void main(String[] args) {
		testSet1();
		testSet2();
		return;
	}
		
}

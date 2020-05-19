package assign2;

public class Encryptor implements Encryptable{
	
	private int offset;
	
	public Encryptor(int shift) { //initializes encryptor with a shift
		if(shift > 0 && shift < 26) //checks if shift is in range 1 - 25
			offset = shift;
	}
	
	public void setOffset(int shift) { // sets offset to a number between 1 - 25
		if(shift > 0 && shift < 26)
			offset = shift;
		else
			System.out.println("Not in the valid bounds!");
	}

	@Override
	public String encrypt(String text) {
		text = text.toUpperCase();
		char[] encryptedText = text.toCharArray();
		int i;
		
		for(i=0; i < text.length(); i++) {
			if((encryptedText[i] >= 'a' && encryptedText[i] <= 'z') || (encryptedText[i] >= 'A' && encryptedText[i] <= 'Z') ) {
				//checks if the character is special (i.e. not an alphabet character
				encryptedText[i] = (char) (((encryptedText[i] - 'A' + offset) % 26) + 'A'); // shifts over by the shift amount
				continue;
			}
		}
		
		return new String(encryptedText);
	}

	@Override
	public String decrypt(String text) {
		text = text.toUpperCase();
		char[] decryptedText = text.toCharArray();
		int i;
		
		for(i=0; i < text.length(); i++) {
			if((decryptedText[i] >= 'a' && decryptedText[i] <= 'z') || (decryptedText[i] >= 'A' && decryptedText[i] <= 'Z') ) {
				//checks if the character is special (i.e. not an alphabet character
				decryptedText[i] = (char) (((decryptedText[i] - 'A' + (26 - offset)) % 26)+ 'A');
				continue;
			}
			
		}
		
		return new String(decryptedText);
	
	}
}

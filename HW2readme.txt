Eric Piacentini
COEN 275 OO Analysis, Design and Programming
Winter 2020
Assignment 2

IDE: Eclipse
Java Verison: jdk-11.0.2.jdk	JAVA SE-11

Question 1 (50 pts)
Develop a Java interface called Encryptable with the method declarations as below:
•	String encrypt (String text)
•	String decrypt (String text)
Develop a class called Encryptor that implements Encryptable.  
Data Members: 
offset (an integer) : is used to shift the letters in the original string. The offset should be greater than 0 and less than 26. It should be initialized in the constructors.
Apart from the constructors, the following methods should be provided:
void setOffset (int shift):  stores shift in the data member, offset. 
String encrypt (String plaintext):
This method should encrypt the plaintext using Casesar cipher algorithm (see details below) and return the encrypted string. It should use the offset stored as a datamember.
The plaintext should first be converted to all upper case or all lower case. Assuming that it is converted to all upper case, the following formula can be used to shift each letter in the plaintext by the given offset.
	encrypted_letter = (letter_in_plaintext – ‘A’ + offset) mod 26  + ‘A’

Keep in mind that each character has an integer value (its ascii value for example) and its charcater representation. The encrypted letter should be stored as a character in the result string (encrypted text).
The encrypted text should be returned from the method.
Caesar cipher encryption: is a substitution algorthim and one of the most basic forms of encryption where an offset is used to substitute a different letter for every letter of the alphabet. 
For example, if an offset of 1 is used, then ‘A’ is represented by ‘B’, ‘B’ is represented by ‘C’, and so on. When we reached the end of the alphabet and a no letter is after the current one, then we wrap around to the beginning of the alphabet. In our current scenario ‘Z’ is represented by ‘A’. 
Example1 (with a Caesar shift of 3):
Original: 		A B C D E F G H I J K L M N O P Q R S T U V W X Y Z
Encrypted:		D E F G H I J K L M N O P Q R S T U V W X Y Z A B C

Example 2 (with a Caesar shift of 8):
Original:		#There were 7 cars at the intersection.
Encrypted: 		#BPMZM EMZM 7 KIZA IB BPM QVBMZAMKBQWV.

String decrypt (String encryptedText):
This method should decrypt the encryptedText using the offset stored as a datamember.
Use following formula to decrypt each letter in the encryptedText,
	decrypted_letter = (letter_in_encryptedText – ‘A’ + (26 -offset)) mod 26  + ‘A’
The decrypted letter should be stored as a character in the result string (decrypted text).
The decrypted text should be returned from the method.

Some points to note:
•	Uppercase and lowercase letters should all be encrypted to either all uppercase or all lowercase.
•	Any non-alphabetic characters should be included as such in the encrypted string.
•	Offset should be between 0 and 26, both numbers not inclusive.

Question 2 (30 pts)
You will now create a class called EncryptionTester with the following methods:
•	A static method called testSet1() – a void method with no parameters. In this method, you should test the encrypt() and decrypt() methods of Encryptor class you have defined in Question 1. You should include at least 6 test cases as given below.
Strings to encrypt: 
a)	“abcdefghijklmnopqrstuvwxyz”
b)	Your full name (first name <space> middle initial <dot> <space> lastname).
c)	Xray defraction
d)	Zebra-tailed lizard
e)	Walkie-talkie
f)	COEN 275 OO Analysis, Design and Programming

Offsets (keys) to use:
a)	0 	b) 3	c)11	d) 25	e) 26
You may include any additional examples of your choice.

You should create an instance of Encryptor and set the offset to the values given and encrypt (and decrypt) each of the strings given above.

•	A static method called testSet2() - a void method with no parameters.
In this method, you should generate 4 random numbers in 1-25 range (see details below for random number generation) for values of offset and use the offsets to encrypt and decrypt the given test strings.

	Generating Random numbers in Java: You can generate random numbers by
a)	Using the method, Math.random(), or
b)	Using the class Random in java.util package.

•	A main(): You must call testSet1() and testSet2() methods.

You must capture the output (it is ok to capture the screen shots) and include it with your submission.
NOTE:  If your submission does not include any output, the maximum score you can possibly receive is 50%.

Question 3 (15 pts)
Define a class called BankAccount with the following members:
Data Members: accntId (a String), name (a String), balance (a double), password (a String).
Methods: Apart from constructors and access methods, the following methods should be provided.
double withdraw(double amount) : returns the amount if the amount is a positive number greater than 0 and less than or equal to  balance. The amount is subtracted from the balance. If the amount is a negative number or > the balance, the method should display an appropriate message and return a 0.
void deposit (double amount) : if the amount is a positive number > 0, adds the amount to balance.

Question 4 (40 pts)
Define a class called ATM to simulate the functionality of an Automated Teller Machine to withdraw and deposit money from a collection of BankAccounts. 
Data Members:
accounts (a list of BankAccounts): should implement the list as a Collection class of your choice.
passwordEncoder (Encryptor)
Methods:
A constructor : Create the accounts array with a size of your choice. Create passwordEncoder as an instance of Encryptor.
void addAccount (String acctId, String name,double balance, String password):
The functionality is given in these steps:
1.	Call the encrypt() method with password as the parameter ,on the passwordEncoder object. The encrypt method should return an encryted form of the password. 
2.	Create a BankAccount object with acctId, name, balance and the encrypted password.
3.	Add the newly created BankAccount object to the accounts array.

double getMoney(String acctId, String password, double amount)
The functionality is described below:
The method should search the accounts array for a BankAccount object with an acctId that matches the parameter, acctId. If the acctId matches, decrypt (remember you stored an encrypted password in the Bankaccount object) the password in that BankAccount object and compare it with the parameter, password. If they match, call withdraw() with parameter amount on the BankAccount object and return the money withdrawn.

main():  Do the following steps.
1.	Create an instance of ATM.
2.	Call the addAccount() with the following values for parameters:
	acctId: A123 name: M.Jones	password: fall-quarter	balance: 2000.00
3.	    Call the addAccount() with the following values for parameters:
	acctId: B654 name: B.Smith	password: renaissance	balance: 100.00
4.	Call the getMoney() with the following values for parameters:
	acctId: A123 password: fall-quarter	amount: 1000.00
5.	Call the getMoney() with the following values for parameters:
	acctId: B654 password: essence		amount: 100.00
6.	Call the getMoney() with the following values for parameters:
	acctId: B654 password:	renaissance amount: 50.00
7.	Call the getMoney() with the following values for parameters:
	acctId: B654 password:	renaissance amount: 50.00
8.	Call the getMoney() with the following values for parameters:
	acctId: B654 password:	renaissance amount: 50.00
9.	Call the addAccount() with the following values for parameters:


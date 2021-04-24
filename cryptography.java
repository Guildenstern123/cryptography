public class cryptography{
	static String CaesarEncrypt(String plaintext, int num){
		//create string for final cipher text and initialize charNum
		String cipher = new String("");
		int charNum = 0;

		//add each cipher text character to the cipher variable
		for(int i = 0; i < plaintext.length(); i++){
			charNum = (int)plaintext.charAt(i)+num;

			if(charNum > 'z'){
				cipher += (char)(charNum-97);
			}else{
				cipher += (char)charNum;
			}
		}
		return cipher;
	}

	static String CaesarDecrypt(String ciphertext, int num){
		//create a string for the final plaintext after decryption & initialize charNum
		String plaintext = new String("");
		int charNum = 0;

		//add each plaintext character into the plaintext string
		for(int i = 0; i < ciphertext.length(); i++){
			charNum = (int)ciphertext.charAt(i)-num;
			if(charNum  < 'a'){
				plaintext += (char)((122+charNum)-122);
			}else{
				plaintext += (char)charNum;
			}
		}

		return plaintext;

	}

	public static void main(String args[]){
		System.out.println(CaesarEncrypt("thisisatest",1));
		System.out.println(CaesarDecrypt("uijtjtbuftu",1));
	}
}

public class cryptography{
	static String Caesar(String plaintext, int num){
		String cipher = new String("");
		char[] plainArray = new char[plaintext.length()];

		for(int i = 0; i < plaintext.length();i++){
			plainArray[i] = plaintext.charAt(i);
		}

		for(int i = 0; i < plainArray.length; i++){
			if((int)plainArray[i]+num > 122){
				cipher += (char)(((int)plainArray[i]+num)-97);
			}else{
				cipher += (char)((int)plainArray[i] + num);
			}
		}
		return cipher;
	}

	public static void main(String args[]){
		System.out.println(Caesar("thisisatest",1));
	}
}

class Palindrom{
	public static void main(String[] args){
		for (int i = 0; i < args.length; i++) {
			 String s = args[i];
			 System.out.println(s + " is Palindrom: " + isPalindrom(s));
			}
}
	public static String reverseString(String str) {
		String newstr = "";
		for(int i = str.length() - 1; i > -1; i--)newstr += str.charAt(i);
		return newstr;
	}
	
	public static boolean isPalindrom(String str) {
		return str.equals(reverseString(str));
	}
	
}
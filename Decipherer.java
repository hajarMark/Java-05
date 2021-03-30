package Decipherer;

	public class Decipherer {
		public static void main(String[] args) {
			System.out.println(decipherer("0@sn9sirppa@#?ia'jgtvryko1"));
			System.out.println(decipherer("q8e?wsellecif@#?sel@#?setuotpazdsy0*b9+mw@x1vj"));
			System.out.println(decipherer("aopi?sedohtém@#?sedhtmg+p9l!"));
		}
		public static String decipherer(String message) {
			int len=message.length()/2;
			String sub_agrs=message.substring(5,5+len);
			String reducedString = sub_agrs.replace("@#?", " ");
			StringBuilder builder = new StringBuilder();
			builder.append(reducedString);
			return builder.reverse().toString();		
	     }
	}
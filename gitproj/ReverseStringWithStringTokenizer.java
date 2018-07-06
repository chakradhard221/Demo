import java.util.Scanner;
import java.util.StringTokenizer;

public class ReverseStringWithStringTokenizer {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
	
String token;;
Scanner scanner = new Scanner(System.in);
      System.out.println("Enter Sentance");
      String string = scanner.nextLine();
		String s=new String(string);
		StringTokenizer stringTokenizer = new StringTokenizer(s);
		String sRev=" ";
		StringTokenizer tokenizer = new StringTokenizer(s);
		while (tokenizer.hasMoreTokens()) {
			token = tokenizer.nextToken();
			sRev=token+" "+sRev;
		}
		
		System.out.println(sRev);
}
	
	
	
}

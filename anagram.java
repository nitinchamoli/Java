import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a name");
		String name = sc.nextLine();
		char[] cname = name.toCharArray();
		Arrays.sort(cname);
		String sname = new String(cname);
		while(true){
		    System.out.println("Enter String");
		    String str = sc.nextLine();
		    char[] cstr = str.toCharArray();
		    Arrays.sort(cstr);
		    String sstr = new String(cstr);
		    if(sname.equals(sstr)){
		        System.out.println("String is same");
		    }
		    else{
		        System.out.println("String is not same");
		    }        
		}
		
	}
}

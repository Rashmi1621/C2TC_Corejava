package string;
import java.util.*;

public class String {

	public static void main(java.lang.String[] args) {
		// TODO Auto-generated method stub
		String a= "hello"; 
		
		String b= new String("World");
		
		char arr[]={'a','b','c','d' ,'e'};
		String e= new String(arr);
		System.out.println("String method by converting char array ---"+e+"\n");
		
		System.out.println("String concatination ---"+a.concat(b)+"\n");
		String c=a.concat(b);
		
		System.out.println("SubString From beginIndex 2 in "+a+" string ----"+a.substring(2)+"\n");
		System.out.println("SubString From beginIndex 2 to EndIndex 6 in "+c+" string ----"+c.substring(2, 6)+"\n");
		
		String g="HELLO";
		String h="hello";
		String j="HELLO";
		
		System.out.print(g+" == "+h+"---");
		System.out.println(g==h);
		System.out.println("");
		
		System.out.println(g+" IsEquals "+h+"---"+g.equals(h)+"\n");
		System.out.println(g+" IsEqualsIgnoreCase "+h+"---"+g.equalsIgnoreCase(h)+"\n");
		System.out.println(g+" compareTo "+h+"---"+g.compareTo(h)+"\n");
		System.out.println(g+" compareToIgnoreCase "+h+"---"+g.compareToIgnoreCase(h)+"\n");
				
		System.out.print(g+" == "+j+"---");
		System.out.println(g==j);
		System.out.println("");
		System.out.println(g+" IsEquals "+j+"---"+g.equals(j)+"\n");
		System.out.println(g+" IsEqualsIgnoreCase "+j+"---"+g.equalsIgnoreCase(j)+"\n");
		System.out.println(g+" compareTo "+j+"---"+g.compareTo(j)+"\n");
		System.out.println(g+" compareToIgnoreCase "+j+"---"+g.compareToIgnoreCase(j));

	}

}

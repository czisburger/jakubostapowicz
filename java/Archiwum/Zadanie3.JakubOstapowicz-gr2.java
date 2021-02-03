import java.util.*;

class ZadaniaJava{
	public static void main(String[] arg){
		int num1 = (int)(Math.random()*((10-1)+1)+1);
		int num2 = (int)(Math.random()*((10-1)+1)+1);
		int wynik = num1*num2;
		System.out.print(num1+"*"+num2+"="+wynik);
	}
}
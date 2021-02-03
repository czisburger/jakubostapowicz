import java.util.*;

class ZadaniaJava{
	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		System.out.print("Podaj pierwsza liczbe: ");
		int jeden = sc.nextInt();
		System.out.print("\nPodaj druga liczbe: ");
		int dwa = sc.nextInt();
		int suma = jeden+dwa;
		System.out.print("\nSuma = "+suma);
	}
}
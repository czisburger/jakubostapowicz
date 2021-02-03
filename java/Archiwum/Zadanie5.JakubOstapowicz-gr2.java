import java.util.*;

class ZadaniaJava{
	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		System.out.print("Wygenerowana liczba: "+random());
		System.out.println("\nZakonczyc[0]");
		int num2 = sc.nextInt();
		if(num2==0){
			System.exit(0);
		}else{
			while(num2>0){
				System.out.print("Wygenerowana liczba: "+random());
				System.out.println("\nZakonczyc[0]");
				num2 = sc.nextInt();
			}
			while(num2<0){
				System.out.print("Wygenerowana liczba: "+random());
				System.out.println("\nZakonczyc[0]");
				num2 = sc.nextInt();
			}
		}
	}
	public static int random(){
		int num1 = (int)(Math.random()*((20-1)+1)+1);
		return num1;
	}
}
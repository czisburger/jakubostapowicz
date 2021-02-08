import java.util.Scanner;

class DzialanieMatematyczne{
	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		String figura = "";
		if(!figura.equals("quit")){
			menu();
			figura = sc.next();
			figura(figura);
		}
	}
	
	public static void figura(String figura){
		switch(figura){
			case "1":{
				kwadrat();
				break;
			}
			case "2":{
				prostokat();
				break;
			}
			default:{
				defaultText();
			}
		}
	}
	
	public static void menu(){
		System.out.println("1 - kwadrat");
		System.out.println("2 - prostokat");
		System.out.println("quit - zamkniecie programu");
		System.out.println("");
		System.out.print("Wybierz jedna figure: ");
		
	}
	
	public static void defaultText(){
		System.out.print("");
	}
	
	public static void kwadrat(){
		System.out.println("");
		Scanner sc = new Scanner(System.in);
		System.out.print("Podaj dlugosc boku: ");
		int bok = sc.nextInt();
		for (int i=1; i<bok; i++){
			for (int j=1; j<=i; j++)
			System.out.print("*");
			System.out.println();
		}
	}
	
	public static void prostokat(){
		System.out.println("");
		Scanner sc = new Scanner(System.in);
		System.out.print("Podaj dlugosc pierwszego boku: ");
		int pierwszy = sc.nextInt();
		System.out.print("Podaj dlugosc pierwszego boku: ");
		int drugi = sc.nextInt();
	}
}